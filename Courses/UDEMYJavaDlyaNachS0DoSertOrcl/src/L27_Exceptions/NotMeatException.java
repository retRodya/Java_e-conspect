package L27_Exceptions;

public class NotMeatException extends RuntimeException {
    NotMeatException(String notMeatStringParameter) {
        super(notMeatStringParameter);
    }
}
