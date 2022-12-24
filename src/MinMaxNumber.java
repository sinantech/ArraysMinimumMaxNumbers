import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] list = {15, 12, 788, 1, -1, -778, 2, 8};
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        Arrays.sort(list);

        System.out.println("Array : " + Arrays.toString(list));

        int maxNumber = 0;
        int minNumber = 0;
        for (int i : list) {
            if (number < i) {
                maxNumber = i;
                break;
            }
        }
        int[] reverse = new int[list.length];
        for (int i = 0, j = list.length - 1; i < list.length; i++, j--) {
            reverse[i] = list[j];
        }
        for (int i : reverse) {
            if (i < number) {
                minNumber = i;
                break;
            }
        }

        System.out.println("Input : " + number);
        System.out.println("Min : " + minNumber);
        System.out.println("Max : " + maxNumber);
    }
}
