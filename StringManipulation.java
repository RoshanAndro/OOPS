import java.util.Scanner; 

public class StringManipulation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the first string: ");
        String str1 = new String(scanner.nextLine());
        System.out.print("Enter the second string: ");
        String str2 = new String(scanner.nextLine());

        
        int length1 = str1.length();
        System.out.println("Length of the first string: " + length1);

        
        String concatenatedString = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenatedString);

        
        char firstChar = str1.charAt(0);
        System.out.println("First character of the first string: " + firstChar);

        
        System.out.print("Enter a string to compare with the first: ");
        String compareString = scanner.nextLine();
        boolean areEqual = str1.equals(compareString);
        System.out.println("First string equals the input: " + areEqual);

        
        System.out.print("Enter a substring to search in the concatenated string: ");
        String substringToSearch = scanner.nextLine();
        boolean containsSubstring = concatenatedString.contains(substringToSearch);
        System.out.println("Concatenated string contains the substring: " + containsSubstring);

        
        String upperCaseString = str1.toUpperCase();
        System.out.println("First string in uppercase: " + upperCaseString);

        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.nextLine(); 
        String stringFromInt = String.valueOf(number);
        System.out.println("String representation of the integer: " + stringFromInt);

        scanner.close();
    }
}
