import java.util.Scanner;

public class CaseStudy2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu = 0;
        System.out.println("===== MAIN MENU =====");
        System.out.println("1. Add Order");
        System.out.println("2. Show Order List");
        System.out.println("3. Exit");
        System.out.print("Select Menu: ");
        menu = input.nextInt();

        switch (menu) {
            case 1:
                
                break;
            case 2:
            case 3:
            case 4:    
            default:
                break;
        }
    }
}