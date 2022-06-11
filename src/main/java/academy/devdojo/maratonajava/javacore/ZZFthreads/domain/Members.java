package academy.devdojo.maratonajava.javacore.ZZFthreads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private Boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pedingEmails() {
        synchronized (emails) {
            return emails.size();
        }
    }

    public void addMemberEmail(String email) {
        synchronized (emails) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " Adicionou email na lita");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String retrieveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " checking if there are emails");
        synchronized (emails) {
            while (emails.size() == 0) {
                if (!open) return null;
                System.out.println(Thread.currentThread().getName() + " Nao tem email disponivel na lista, entrando em modo de espera");
                emails.wait();
            }
            return emails.poll();
        }
    }

    public void close() {
        open = false;
        synchronized (emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todos que nao estamos mais pegando emails");
        }
    }
}
