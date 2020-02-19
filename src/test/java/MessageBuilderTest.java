import org.junit.Test;

import static org.junit.Assert.*;

public class MessageBuilderTest {

    @Test
    public void getMessage() {
        MessageBuilder obj = new MessageBuilder();
        assertEquals("Hello, Shankar", obj.getMessage("Shankar"));
        assertEquals("Please provide a name!", obj.getMessage(null));
        assertEquals("Please provide a name!", obj.getMessage(""));
    }
}