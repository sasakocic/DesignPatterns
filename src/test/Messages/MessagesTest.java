package test.Messages;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import Messages.Messages;
import static org.junit.Assert.assertEquals;

public class MessagesTest {
    Messages m = new Messages();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testEmpty() {
        assertEquals(m.getCount(), 0);
    }

    @Test
    public void testCount() {
        assertEquals(m.getCount(), 0);
        m.pushMessage("Message A");
        assertEquals(m.getCount(), 1);
        m.pushMessage("Message B");
        assertEquals(m.getCount(), 2);
    }

    @Test
    public void testLastInFirstOut() {
        m.pushMessage("Message A");
        m.pushMessage("Message B");
        assertEquals(m.popMessage(), "Message B");
        assertEquals(m.popMessage(), "Message A");
    }
}
