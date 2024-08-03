import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter DATE: ");
        String str = sc.nextLine();

        LocalDate ajKiDate = LocalDate.parse(str);
        ajKiDate = ajKiDate.plusDays(30);

        System.out.println("Date after adding 30 days: "+ ajKiDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy")));


//        or

//        String newDate = ajKiDate.format(DateTimeFormatter.ofPattern("dd-MMMM-yyyy"));
//        System.out.println("Date after adding 30 days: "+ newDate);
    }
}