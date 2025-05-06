import java.util.Scanner;

class AuthenticationException extends Exception {
    public AuthenticationException(String message) {
        super(message);
    }
}

class Authentication {
    private static final String VALID_USERNAME = "ksb";
    private static final String VALID_PASSWORD = "ksb123";

    public static void authenticate(String username, String password) throws AuthenticationException {
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            System.out.println("Authentication successful! Welcome, " + username + ".");
        } else {
            throw new AuthenticationException("Authentication failed! Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.println("--- Login ---");
        System.out.print("Enter username: ");
        username = sc.next(); 

        System.out.print("Enter password: ");
        password = sc.next(); 

        try {
            authenticate(username, password);

        } catch (AuthenticationException e) {
            System.err.println("Error: " + e.getMessage()); 

        } finally {
            System.out.println("Closing resources.");
            sc.close(); 
        }

        System.out.println("Program finished.");
    }
}
