package hexlet.code;

import java.util.Scanner;

class Cli {
    public static void hello() {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
    }
}
