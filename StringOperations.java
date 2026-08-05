import java.util.Arrays;
import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. Length
        System.out.println("\nLength : " + str.length());

        // 2. Trim
        String trimmed = str.trim();
        System.out.println("Trimmed String : " + trimmed);

        // 3. Uppercase
        System.out.println("Uppercase : " + trimmed.toUpperCase());

        // 4. Lowercase
        System.out.println("Lowercase : " + trimmed.toLowerCase());

        // 5. Capitalize First Letter
        String capitalized =
                trimmed.substring(0,1).toUpperCase()
                + trimmed.substring(1).toLowerCase();
        System.out.println("Capitalized : " + capitalized);

        // 6. Substring
        System.out.println("Substring (0-5): " +
                trimmed.substring(0,5));

        // 7. charAt
        System.out.println("Character at index 2 : " +
                trimmed.charAt(2));

        // 8. contains()
        System.out.println("Contains \"Java\" ? " +
                trimmed.contains("Java"));

        // 9. indexOf() second and third word
        int firstSpace = trimmed.indexOf(" ");
        int secondSpace = trimmed.indexOf(" ", firstSpace + 1);

        System.out.println("First space index : " + firstSpace);
        System.out.println("Second space index : " + secondSpace);

        if(firstSpace != -1)
            System.out.println("Second word starts at : " + (firstSpace+1));

        if(secondSpace != -1)
            System.out.println("Third word starts at : " + (secondSpace+1));

        // 10. Replace
        System.out.println("Replace Java with Python : "
                + trimmed.replace("Java","Python"));

        // 11. Split
        String[] words = trimmed.split(" ");

        // 12. Arrays.toString()
        System.out.println("Split Array : "
                + Arrays.toString(words));

        // 13. equals()
        System.out.print("Enter another string : ");
        String str2 = sc.nextLine();

        System.out.println("Equals : "
                + trimmed.equals(str2));

        // 14. indexOf() Operations
        System.out.println("\nIndex of first 'a' : "
                + trimmed.indexOf('a'));

        System.out.println("Index of last 'a' : "
                + trimmed.lastIndexOf('a'));

        System.out.println("Index of \"Java\" : "
                + trimmed.indexOf("Java"));

        System.out.println("Index of \"Java\" from position 5 : "
                + trimmed.indexOf("Java"
                ,5));

        sc.close();
    }
}