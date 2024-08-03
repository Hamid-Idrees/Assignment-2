public class Q7 {
    public static void main(String[] args) {

        String [] strArr = {"flower", "flow", "flight"};

        if (strArr.length == 0){
            System.out.println("String is empty");
        }

        else if (strArr.length == 1){
            System.out.println(strArr[0]);
        }

        else {
            String firstString = strArr[0]; // flower at 0 string

            for (int i=1; i< strArr.length; i++) {     // nested loop to compare every alphabet // now start from string 1

                String currentString = strArr[i];

                int j = 0;

                while (j < currentString.length() && j < firstString.length() && currentString.charAt(j) == firstString.charAt(j)) {
                    j++;
                }

                if (j == 0) {
                    System.out.println("not matched");
                    break;
                }

                firstString = currentString.substring(0, j);
            }

            System.out.println(firstString);

        }

    }
}