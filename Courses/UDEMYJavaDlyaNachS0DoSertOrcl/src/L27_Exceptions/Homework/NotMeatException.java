package L27_Exceptions.Homework;

public class NotMeatException extends RuntimeException {
    NotMeatException(String notMeatStringParameter) {
        super(notMeatStringParameter);
    }
}
