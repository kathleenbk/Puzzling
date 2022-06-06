public class PuzzleTest {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();

        // App Test Cases
        System.out.println("\n\n----- Get Ten Rolls -----");
        System.out.println(appTest.getTenRolls());

        System.out.println("\n\n----- Get Random Letter -----");
        System.out.printf("The random letter is: %s", appTest.getRandomLetter());

        System.out.println("\n\n----- Generate Password -----");
        System.out.printf("The password is: %s", appTest.generatePassword());
        
        System.out.println("\n\n----- New Password Set -----");
        System.out.printf("The new password set is: %s \n\n", appTest.getNewPasswordSet(3));
    }
}