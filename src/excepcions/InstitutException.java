package excepcions;

public class InstitutException extends Exception {
    private int codiError;

    public InstitutException(String message, int codiError) {
        super(message);
        this.codiError = codiError;
    }
}
