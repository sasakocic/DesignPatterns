package Messages;

public class Messages {
    private static final int MAX = 100;
    private int count = 0;
    private String[] messages = new String[MAX];

    public int getCount() {
        return count;
    }

    public void pushMessage(String message) {
        messages[count++] = message;
    }

    public String popMessage() {
        return messages[--count];
    }
}
