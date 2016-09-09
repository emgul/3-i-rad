import java.util.Scanner;
import java.util.Arrays;

public class Tre_i_rad {

    public static void main(String[] args) {

        boolean end = false;

        int[] arr;
        arr = new int[9];

        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;

        System.out.println(java.util.Arrays.toString(arr));

         do {

            Scanner move1 = new Scanner(System.in);
            System.out.println("Spelare 1 vilket tal ska ändras?");
            int input = move1.nextInt();
            arr[input - 1] = 0;
            System.out.println(java.util.Arrays.toString(arr));

            Scanner move2 = new Scanner(System.in);
            System.out.println("Spelare 2 vilket tal ska ändras?");
            int input2 = move2.nextInt();
            arr[input2 - 1] = 0;
            System.out.println(java.util.Arrays.toString(arr));

             if (Arrays.asList(arr).contains(0)) {
                end = true;
             }
                else {
                    System.out.println("continue");
             }

         } while(end == false);

            System.out.println("End");

        }

    }