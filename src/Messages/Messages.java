package Messages;

public class Messages {
    public static final int MAX = 100;
    private int count = 0;
    private String[] messages = new String[MAX];

    public int getCount() {
        return count;
    }

    public void pushMessage(String message) throws ArrayIndexOutOfBoundsException {
        if (count == MAX -1)
            throw new ArrayIndexOutOfBoundsException("Cannot push more than " + MAX + " messages");
        messages[count++] = message;
    }

    public String popMessage() throws ArrayIndexOutOfBoundsException {
        if (count == 0)
            throw new ArrayIndexOutOfBoundsException("No more messages to pop");
        return messages[--count];
    }
}
