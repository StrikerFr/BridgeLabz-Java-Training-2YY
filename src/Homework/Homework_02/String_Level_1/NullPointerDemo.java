package Homework.Homework_02.String_Level_1;

public class NullPointerDemo {
    public static void generateException() {
        String text = null;
        text.length();
    }

    public static void handleException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
    }

    public static void main(String[] args) {
        handleException();
    }
}

