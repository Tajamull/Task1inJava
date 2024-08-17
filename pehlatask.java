import java.util.Scanner;

public class pehlatask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the website URL: ");
        String url = scanner.nextLine();

        if (url.endsWith(".com")) {
            System.out.println("This is a Company Website");
        } else if (url.endsWith(".pk")) {
            System.out.println("This is a Pakistan Website");
        } else if (url.endsWith(".org")) {
            System.out.println("This is an Organization Website");
        } else if (url.endsWith(".edu")) {
            System.out.println("This is an Educational Institution Website");
        } else {
            System.out.println("Unknown Website Type");
        }

        scanner.close();
    }
}