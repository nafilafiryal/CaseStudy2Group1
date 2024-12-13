import java.util.Scanner;

public class CaseStudy2 {
    static  int listOrder[][] = new int[10][4];
    static String [] customerName =  new String[10];
    static int [] tableNumber = new int[10];
    static int row = 0;
    static double BlackCoffe = 15000;
    static double latte = 22000;
    static double pullTea = 12000;
    static double friedNoodle = 18000;
    static double orderBlack, orderLatte, orderTea, orderNoodle, totalOrder;
    static int orderCount = 0;

    static void addOrder () {
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter customer's name: ");
        customerName[row] = input.nextLine();
        System.out.print("Enter Table Number: ");
        tableNumber[row] = input.nextInt();

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
            System.out.print("\nSelect menu (enter menu number, or 0 to exit): ");
            menu = input.nextInt();  

            if (menu == 0) {
                break;
            }
                
            switch (menu) {
                case 1:
                    System.out.print("Enter the number of items for black coffe: ");
                    listOrder[row][0] += input.nextInt();
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
                    System.out.print("Enter the number of fried noodle: ");
                    listOrder[row][3] = input.nextInt();
                    break;
                default:
                    System.out.println("Invalid menu.");
                    }
                }
                orderBlack = BlackCoffe * listOrder[row][0];
                orderLatte = latte * listOrder[row][1];
                orderTea = pullTea * listOrder[row][2];
                orderNoodle = friedNoodle * listOrder[row][3];

                double totalOrder = orderBlack + orderLatte + orderTea + orderNoodle;

                System.out.println("\nOrder added successfully.");
                System.out.println("Order total price: Rp" + totalOrder);
                row++;
            }

            
            public static void showOrderList () {
                Scanner sc = new Scanner(System.in);
                if (orderCount == 0) {
                    System.out.println("No orders yet.");
                    return;
                }
                System.out.println("==== ORDER LIST ====");
        
                for (int i = 0; i < 10; i++) {
                    System.out.println("name cutomer: " + customerName[i]);
                    System.out.println("number table: " + tableNumber[i]);
                    System.out.println("Order Details: ");
                    System.out.println(" - Kopi Hitam x " + listOrder[row][0] + " = "  + "Rp " + orderBlack);
                    System.out.println("-----------------------");
                }
            }
            
            static void Exit () {
                System.out.println("Your order has been successful, please wait for your order.");
            }
            
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                int menu = 0;
        
                while (menu != 3) {
                    System.out.println("\n===== MAIN MENU =====");
                    System.out.println("1. Add Order");
                    System.out.println("2. Show Order List");
                    System.out.println("3. Exit");
                    System.out.print("Select Menu: ");
                    menu = input.nextInt();
                    input.nextLine();
                    
                    switch (menu) {
                        case 1:
                            addOrder();
                            break;
                        case 2:
                            showOrderList();
                            break;
                        case 3:
                            Exit();
                            break;  
                        default:
                        System.out.println("order not reccording");
                        break;
                    }
                }
            }
}