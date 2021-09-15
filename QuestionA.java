import java.util.Scanner;

public class QuestionA {

    public static final String firstLine = "Enter first line in (x1,x2) format:";
    public static final String secondLine = "Enter second line in (x3,x4) format:";
    public static final String overlap = "Lines are overlapping";
    public static final String noOverlap = "Lines are not overlapping";
    public static final String errMsg = "Please enter line in appropriate format.";

    public static int numbers(String line, int choice) {
        int comma = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == ',') {
                comma = i;
            }
        }
        //Checking lines whether is it in appropriate format or not.
        if (line.charAt(0) != '(' || comma == 0 || line.charAt(line.length() - 1) != ')') {
            System.out.println(errMsg);
            System.exit(-1);
        }
        int x1 = Integer.parseInt(line.substring(1, comma));
        int x2 = Integer.parseInt(line.substring(comma + 1, line.length() - 1));
        if (choice == 1) {
            return x1;
        }
        return x2;
    }

    public static boolean overlap(int x1, int x2, int x3, int x4) {
        //Checking each number whether is it overlaps or not.
        boolean A = (x1 < x3) && (x1 < x4);
        boolean B = (x2 < x3) && (x2 < x4);
        boolean C = (x1 > x3) && (x1 > x4);
        boolean D = (x2 > x3) && (x2 > x4);

        return !((A && B) || (C && D));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(firstLine);
        String line1 = input.nextLine();
        int x1 = 0, x2 = 0, x3 = 0, x4 = 0;
        try {
            x1 = numbers(line1, 1);
            x2 = numbers(line1, 2);

            System.out.println(secondLine);
            String line2 = input.nextLine();
            x3 = numbers(line2, 1);
            x4 = numbers(line2, 2);
        } catch (NumberFormatException e) {
            System.out.println(errMsg);
            System.exit(-1);
        }
        if (overlap(x1, x2, x3, x4)) {
            System.out.println(overlap);
        } else {
            System.out.println(noOverlap);
        }
    }

}