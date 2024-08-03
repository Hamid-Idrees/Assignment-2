import java.util.Scanner;
import java.util.regex.Pattern;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter brackets:");
        String str = input.nextLine();

        if(Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)\\}\\]").matcher(str).matches()){
            System.out.println("okkkk");}

        else {
            System.out.println("not okkk");}


//        Pattern pattern = Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)\\}\\]");
//        Matcher matcher = pattern.matcher(str);
//        boolean b = matcher.matches();
//
//        if (b==true){
//            System.out.println("valid bracket");
//        }
//        else{
//            System.out.println("invalid bracket");
//        }



    }
}
