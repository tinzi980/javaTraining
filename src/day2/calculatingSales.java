package day2;
import java.util.*;
public class calculatingSales {
    public static void main(String[] args) {

            double price =0.0;
            double totalAll = 0.0;
            double total = 0.0;
            double totalValue = 0.0;
            int product = 0;
            int quantity = 0;

            Scanner tp = new Scanner(System.in);
            System.out.println("Please enter the product number");
            product=tp.nextInt();

            if(product == -999){
                System.out.println("Thank you for using the application");
                System.exit(0);
            } else{
                while (product != -999 && product >=1 && product <=5 ){

                    System.out.println("Please enter the quantity");
                    quantity =  tp.nextInt();

                    switch (product){
                        case 1:
                            price = 2.98;
                            totalValue = price * quantity;
                            System.out.println("The total value is" + totalValue);
                            break;
                        case 2:
                            price = 4.50;
                            totalValue = price * quantity;
                            System.out.println("The total value is" + totalValue);
                            break;
                        case 3:
                            price = 9.98;
                            totalValue = price * quantity;
                            System.out.println("The total value is" + totalValue);
                            break;

                        case 4:
                            price = 4.49;
                            totalValue = price * quantity;
                            System.out.println("The total value is" + totalValue);
                            break;
                        case 5:
                            price = 6.87;
                            totalValue = price * quantity;
                            System.out.println("The total value is" + totalValue);
                            break;
                        default:
                            System.out.println("Invalid product number, enter between 1 and 5");


                            System.out.println("Please enter the product number");
                            product=tp.nextInt();

                    }
                    totalAll = totalAll + totalValue;
                    System.out.println("The overal total is" + totalAll);

                }

            }


        }

    }
