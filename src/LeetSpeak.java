
import java.util.Scanner;

public class LeetSpeak {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String original = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
        char[] originalArray = original.toCharArray();

        String leet = "@@88((Dd33Ff66##!!JjKk11MmNn00PpQqRr$$77UuVvWwXxYy22";
        char[] leetArray = leet.toCharArray();

        System.out.println("Type in any text you want!");
        String yourText = scanner.nextLine();
        char[] yourTextArray = yourText.toCharArray();

        for (int i = 0; i < yourTextArray.length; i++){

            if(yourTextArray[i] == ' '){
                System.out.print(" ");
            }

            for (int j = 0; j < originalArray.length; j++){

                if (yourTextArray[i] == originalArray[j]){
                    yourTextArray[i] = leetArray[j];

                    System.out.print(yourTextArray[i]);

                }
            }

        }
    }

}

