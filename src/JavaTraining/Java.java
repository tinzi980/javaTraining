package JavaTraining;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Java {

    public static void main(String[] args) {
        int num1, num2, product;
        Scanner tp = new Scanner(System.in);
        System.out.println("enter num1");
        num1 = tp.nextInt();
        System.out.println("enter num2");
        num2 = tp.nextInt();
        product = num1*num2;
        System.out.println("the product is " + product);


    }


}
