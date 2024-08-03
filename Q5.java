import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String str = sc.nextLine();

        int numInInt = Integer.parseInt(str); // string se integer me

        String [] romanCh = {"M","CM","D","C","XC","L","X","IX","V","I"};
        int [] romanVal = {1000,900,500,100,90,50,10,9,5,1};

        String concateValue = "";

        for (int i=0; i<romanVal.length; i++){
            int num = numInInt / romanVal[i];
            if(num==0) continue; // to skip and come outside the loop

            concateValue = (num==4 && i>0)? romanCh[i] + romanCh[i-1] : romanCh[i];

            numInInt %= romanVal[i];
        }

        System.out.println("Number in roman: "+ concateValue);

    }
}
