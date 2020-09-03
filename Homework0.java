/**
 * @autor Jie GuO
 * @since 07/14/2020
 * @version 1.0
 *
 * Description; This project will input user's first name and last name and put
 * them into the premade welcome message.
 */
package homework0;

import java.util.Scanner;

public class Homework0 {

    public static void main(String[] args) {
        String first, last;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your first and last name");
        System.out.println("Do not to forget the Enter key");

        first = sc.next();
        last = sc.next();
        
        System.out.println("\nWelcome to computer science world "+first+" "+last+" !");

    }

}
