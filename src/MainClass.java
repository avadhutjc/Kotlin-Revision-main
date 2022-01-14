import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        // DoNothing.Utils.cool();
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            System.out.println("This input is of type Integer");
        } else if (scanner.hasNextFloat()) {
            System.out.println("This input is of type Float");
        } else if (scanner.hasNextLine()) {
            System.out.println("This input is of type string");
        } else {
            System.out.println("This is something else");
        }
    }

}
