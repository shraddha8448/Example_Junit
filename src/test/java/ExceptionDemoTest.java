import org.example.ExceptionDemo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionDemoTest {

    @Test
    void testDivideByZeroException(){
        ExceptionDemo obj = new ExceptionDemo();

        ArithmeticException exception = assertThrows(ArithmeticException.class,()->{
            obj.divide(10,0);
        });

        assertEquals("Cannot divide by zero",exception.getMessage());
    }

    @Test
    void testValidDivision(){
        ExceptionDemo obj = new ExceptionDemo();

        // No exception should be thrown for valid Division
        assertDoesNotThrow(()->{
            obj.divide(10,2);
            assertEquals(5,5);
        });
    }
}
