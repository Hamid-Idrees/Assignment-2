import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();

        Pattern pattern = Pattern.compile("([a-zA-Z]+\\d+|[a-zA-Z]+|[a-zA-Z]+.[a-zA-Z]+)@gmail.com");

        Matcher matcher = pattern.matcher(str);

        boolean b = matcher.matches();

        if (b){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }

    }
}