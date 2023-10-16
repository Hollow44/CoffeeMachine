import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type number 1:");
        int a = scanner.nextInt();

        System.out.println("Type number 2:");
        int b = scanner.nextInt();

        System.out.println(a + b);
    }
}