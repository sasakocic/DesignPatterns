package test.Messages;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import Messages.Messages;
import static org.junit.Assert.assertEquals;

public class MessagesTest {
    Messages messages = new Messages();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testEmpty() {
        assertEquals(messages.getCount(), 0);
    }

    @Test
    public void testCount() {
        messages.pushMessage("Message A");
        assertEquals(messages.getCount(), 1);
        messages.pushMessage("Message B");
        assertEquals(messages.getCount(), 2);
    }

    @Test
    public void testLastInFirstOut() {
        messages.pushMessage("Message A");
        messages.pushMessage("Message B");
        assertEquals(messages.popMessage(), "Message B");
        assertEquals(messages.popMessage(), "Message A");
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testOverflow() {
        for (int i=0; i <= Messages.MAX; i++) {
            messages.pushMessage("Some message");
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testUnderflow() {
        messages.popMessage();
    }
}
