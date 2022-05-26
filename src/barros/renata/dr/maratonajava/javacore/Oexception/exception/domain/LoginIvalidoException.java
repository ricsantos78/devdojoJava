package barros.renata.dr.maratonajava.javacore.Oexception.exception.domain;

public class LoginIvalidoException extends Exception{
    public LoginIvalidoException() {
    super("Login invalido");
    }

    public LoginIvalidoException(String message) {
        super(message);
    }
}
