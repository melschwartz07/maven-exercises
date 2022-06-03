import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class MavenExercises {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

//  TODO: Enter Something: Life, The Universe, and Everything
//        You Entered: "Life, The Universe, and Everything"
//        "Life, The Universe, and Everything" is not a number
//        Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//        Reversed: gnihtyrevE dna ,esrevinU eht ,efiL

        System.out.println("Enter something: ");
        String userInput = scanner.nextLine();
        System.out.println("You entered: " + userInput);
        System.out.println(StringUtils.isNumeric(userInput) + " is not a number");
        System.out.println("Flipped Case: " + StringUtils.swapCase(userInput));
        System.out.println("Reversed: " + StringUtils.reverse(userInput));
    }
}
