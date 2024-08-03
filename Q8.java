import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sc.nextLine();

        String newStr = "";

        char [] arr = str.toCharArray();

        for (int i = 0; i < arr.length ; i++) {

            int j;

            // when duplicate found
            for (j=0; j<i ;j++){
                if (arr[i]==arr[j]){
                    break;
                }
            }

            // when duplicate not found
            if(i==j){
               newStr += arr[i];
            }
        }

        char [] arr1 = newStr.toCharArray();
        Arrays.sort(arr1);

        System.out.println(newStr);

    }
}