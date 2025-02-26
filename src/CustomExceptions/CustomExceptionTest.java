package CustomExceptions;

public class CustomExceptionTest extends RuntimeException {

    CustomExceptionTest(String e) {
        super("Exception Occurred: " + e);
    }
}
