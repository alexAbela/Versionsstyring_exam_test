package debug_tests;

import java.util.Scanner;


public class debug_test_array {

    public static void main(String[] args) {
        int[] ints = parseInput();
        int[] shiftetInts = new int[ints.length];
        for(int i = 1; i < ints.length; i++){
            shiftetInts[i - 1] = ints[i];
        }
        shiftetInts[ints.length - 1] = ints[0];
        String s = "";
        for(int j = 0; j < shiftetInts.length; j++){
            Integer.toString(shiftetInts[j]);
            s += shiftetInts[j] + " ";
        }
        System.out.println(s);
    }

    private static int[] parseInput() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] strings = input.split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0;i<ints.length;i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        scan.close();
        return ints;
    }
}

