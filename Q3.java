import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q3 {
    public static void main(String[] args) {

        LocalDate ajKiDate = LocalDate.now();
        System.out.println("Old format date: "+ ajKiDate);

        String newTodayDate = ajKiDate.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println("New format date: "+ newTodayDate);
    }
}
