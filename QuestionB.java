import java.util.Scanner;

public class QuestionB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // accepts first string
        System.out.print("Enter First string: ");
        String firstValue = input.nextLine();
        firstValue = firstValue.toLowerCase().replaceAll("\\s+", "");
        // accepts second string
        System.out.print("Enter Second string: ");
        String secondValue = input.nextLine();
        secondValue = secondValue.toLowerCase().replaceAll("\\s+", "");
        // compare first string to second string
        int compareBoth = firstValue.compareTo(secondValue);
        // if compareTo is zero then that means they are equal
        if(compareBoth == 0){
            System.out.print(firstValue +" is equal to "+ secondValue );
            return;
        }else if ( compareBoth > 0){
            System.out.print(firstValue+" is greater than "+ secondValue);
            return;
        }else{
            System.out.print(firstValue+" is smaller than "+ secondValue);
            return;
        }
    }
}
