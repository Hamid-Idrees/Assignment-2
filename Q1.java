import java.util.Scanner;

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String str = sc.nextLine();

        int stringKiLength = str.length();

        boolean flag = true;

        for (int i=0; i<stringKiLength/2; i++){
            if (str.charAt(0)!=str.charAt(stringKiLength-1)) {
                flag = false;
                break;
            }
        }

        if (flag==true){
            System.out.println("This is a Palindrome");
        }
        else {
            System.out.println("This is not a Palindrome");
        }

    }
}