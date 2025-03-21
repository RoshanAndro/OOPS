import java.util.Scanner;
import java.util.Arrays;

class StrAray {
    void userDefine(String str[], int n) {
        int i, j;
        String temp;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.print("The strings after sorting using user-defined method: ");
        for (i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int option, num, i;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        num = sc.nextInt();
        sc.nextLine();  

        String[] strings = new String[num];
        StrAray d = new StrAray();

        do {
            System.out.println("1. User defined");
            System.out.println("2. Built-in");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            sc.nextLine();  

            switch (option) {
                case 1:
                    System.out.println("Enter the strings:");
                    for (i = 0; i < num; i++) {
                        strings[i] = sc.nextLine();
                    }
                    d.userDefine(strings, num);
                    break;
                case 2:
                    System.out.println("Enter the strings:");
                    for (i = 0; i < num; i++) {
                        strings[i] = sc.nextLine();
                    }
                    Arrays.sort(strings);
                    System.out.print("The strings after sorting using built-in method: ");
                    for (i = 0; i < num; i++) {
                        System.out.print(strings[i] + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Please enter a valid number.");
            }
        } while (option != 3);

        sc.close();
    }
}
