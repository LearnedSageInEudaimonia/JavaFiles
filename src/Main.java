import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String str = "  hello world    ";
        str.strip();
        System.out.println(str);
        int lastSpaceIndex = str.lastIndexOf(" ");

        System.out.println(str.length() - lastSpaceIndex - 1);
    }
}