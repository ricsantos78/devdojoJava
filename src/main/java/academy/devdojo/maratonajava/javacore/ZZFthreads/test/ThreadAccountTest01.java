package academy.devdojo.maratonajava.javacore.ZZFthreads.test;

import academy.devdojo.maratonajava.javacore.ZZFthreads.domain.Account;

public class ThreadAccountTest01 implements Runnable {
    private final Account account = new Account();

    public static void main(String[] args) {
        ThreadAccountTest01 tat = new ThreadAccountTest01();
        Thread t1 = new Thread(tat, "Hestia");
        Thread t2 = new Thread(tat, "Bell Cranel");
        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            withDrawal(10);
            if (account.getBalance() < 0) {
                System.out.println("F");
            }
        }
    }

    private void withDrawal(int amount) {
        System.out.println(getThreadName()+ " #### fora do synchronized");
        synchronized (account) {
            System.out.println(getThreadName()+ " **** dentro do synchronized");
            if (account.getBalance() >= amount) {
                System.out.println(getThreadName() + " sacando valor...");
                account.withDrawal(amount);
                System.out.println(getThreadName() + " saque efetuado com sucesso, seu saldo e de :" + account.getBalance());
            } else {
                System.out.println("Sem dinheiro para " + getThreadName() + " efetuar o saque " + account.getBalance());
            }
        }
    }

    private String getThreadName() {
        return Thread.currentThread().getName();
    }


}
