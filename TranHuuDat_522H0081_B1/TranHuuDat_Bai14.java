import java.util.Scanner;
public class TranHuuDat_Bai14 {
    public static void main (String[]args){        
        may_ban_nuoc();
        
    }
    public static void may_ban_nuoc(){
        Scanner sc = new Scanner (System.in);
        while(true){
            System.out.println("--------Menu--------");
            System.out.println("1. Coca");
            System.out.println("2. Pepsi");
            System.out.println("3. Sprite");
            System.out.println("4. Snack");
            System.out.println("5. Shutdown Machine");
            System.out.println("Please enter the number: ");
            int n = sc.nextInt();
            int money ;
            
            switch(n){
                case 1:
                    System.out.println("The price of Coca is: 2$, please enter the amcunt of money: ");
                    money = sc.nextInt();
                    if(money<2)
                        System.out.println("Not enough money to buy this item, please select again");
                    else
                        System.out.println("Your chane is: "+(money -2)+"$");
                    break;
                case 2:
                    System.out.println("The price of Pepsi is: 3$, please enter the amcunt of money: ");
                    money = sc.nextInt();
                    if(money<2)
                        System.out.println("Not enough money to buy this item, please select again");
                    else
                        System.out.println("Your chane is: "+(money -3)+"$");
                    break;
                case 3:
                    System.out.println("The price of Sprite is: 4$, please enter the amcunt of money: ");
                    money = sc.nextInt();
                    if(money<2)
                        System.out.println("Not enough money to buy this item, please select again");
                    else
                        System.out.println("Your chane is: "+(money -4)+"$");
                    break;
                case 4:
                    System.out.println("The price of Snack is: 5$, please enter the amcunt of money: ");
                    money = sc.nextInt();
                    if(money<2)
                        System.out.println("Not enough money to buy this item, please select again");
                    else
                        System.out.println("Your chane is: "+(money -5)+"$");
                    break;
                case 5:
                    System.out.println("Machine is shutting down");
                    break;
                default:
                    System.out.println("Please enter the  valid number");
            }

            if (n==5)   break;
            
        }  
        sc.close();       
    }
}
