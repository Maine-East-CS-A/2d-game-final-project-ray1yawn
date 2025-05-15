package TsStuff;
import java.util.Scanner;

public class InputStuff {
    private static final Scanner scan = new Scanner(System.in);

    public String getUserInputThangSutffYk() {
        return scan.nextLine();
    }

    public boolean validateInput(String input) {
         return input != null && input.length() == 5 && input.chars().allMatch(Character::isLetter);
    }
}