package Exercise;
import java.util.*;
public class Bagels {
    public static void main(String[] args) {
        Scanner tp=new Scanner(System.in);
        int bagels;
        int order;
        double total;
        double charge;
        int quantity;
        total = charge*quantity;

        System.out.println("Please enter the number of bagels");
        bagels=tp.nextInt();
        if (bagels >0 && bagels < 6 ){


            cost = bagels*0.75;
            System.out.println("the cost is " + cost);

    }

        else if (bagels >=6 ){
                cost=bagels*0.60;
            System.out.println("the cost is "+ cost);

        }else {
            System.out.println("invalid bagels");
        }




    }
}
