
import org.junit.Test;
import static org.junit.Assert.*;

public class TestUnit {

    private String message = "Hello World!!";
    private MessageUtil mu = new MessageUtil(message);

    @Test
    public void testPrintMessage(){
        assertEquals(message, mu.printMessage());
    }
}
