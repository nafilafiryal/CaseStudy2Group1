import java.util.Scanner;

public class CaseStudy2 {
    static  int listOrder[][] = new int[4][4];

    static void addOrder () {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String name = input.nextLine();
        System.out.print("Enter Table Number: ");
        int tabelNumber = input.nextInt();

        while (true) {
            System.out.println();
            System.out.println("=====CAFE MENU====");
            System.out.println("1. Black Caffe - Rp 15.0000");
            System.out.println("2. Latte - Rp. 22.0000");
            System.out.println("3. Pull tea - Rp 12.0000");
            System.out.println("4. Fried noodles - Rp. 18.000");
            break;
        }

        int menu = 0;
        while (true) {
            System.out.print("Select menu (enter menu number, or 0 to exit): ");
            menu = input.nextInt();
            //menu = menuAdd;

            // if (menu <= 4) {
                switch (menu) {
                    case 1:
                        System.out.print("Enter the number of items for black coffe: ");
                        listOrder[row][0] = input.nextInt();
                        break;
                    case 2:
                        System.out.print("Enter the number of items for latte: ");
                        listOrder[row][1] = input.nextInt();
                        break;
                    case 3:
                        System.out.print("Enter the number of pull tea: ");
                        listOrder[row][2] = input.nextInt();
                        break;
                    case 4:
                        System.out.print("Enter the number of fries noodle: ");
                        listOrder[row][3] = input.nextInt();
                        break;
                    default: 
                        System.out.println("wesss");
                        return;
                    }
                    // } else if (menu == 0) {
                        //     System.out.println("Order has been recorded.");
                        // }
                    }
                    
                }
    

    static void showOrderList () {
        
    }
    
    static void Exit () {
    }
    
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
            addOrder();
            break;
            case 2:
            case 3:  
            default:
            
            break;
        }
    }
}