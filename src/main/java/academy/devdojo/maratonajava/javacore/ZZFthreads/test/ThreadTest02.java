package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

/*
 *ESTAGIO 2 ELES PODEM FICAR EM LOOPING
 *Estados das threads
 * 1 - NEW
 * 2 - Runabble <-> Running
 * 2.1 - Running -> Walting/Blocked
 * 2.2 - Walting/Blocked -> Runnable
 * 3 - DEAD
 */

class ThreadExampleRunnable2 implements Runnable {
    private String c;

    public ThreadExampleRunnable2(String c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println();
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 500; i++) {
            System.out.print(c);
            if (i % 100 == 0) {
                System.out.println();
            }
            Thread.yield();
        }
    }
}

//Daemon x User
public class ThreadTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new ThreadExampleRunnable2("KA"));
        Thread t2 = new Thread(new ThreadExampleRunnable2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t1.join();
        t2.start();
    }
}
