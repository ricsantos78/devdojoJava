package barros.renata.dr.maratonajava.javacore.Oexception.exception.test;

import barros.renata.dr.maratonajava.javacore.Oexception.exception.domain.LoginIvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginIvalidoException e) {
            e.printStackTrace();
        }
    }
    private static void logar() throws LoginIvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "Goku";
        String senhaDB = "ssj";
        System.out.println("Usuario");
        String u = teclado.nextLine();
        System.out.println("Senha");
        String d = teclado.nextLine();

        if (!usernameDB.equals(u) || !senhaDB.equals(d)){
            throw new LoginIvalidoException("Usuario ou senha invalido");
        }else {
            System.out.println("Usuario logado com sucesso");
        }
    }
}
