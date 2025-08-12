package loops;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c;

        String operation ;
        Scanner sc = new Scanner(System.in);
        String answer;

        do {


            System.out.println("Enter a = ");
            a = sc.nextInt();

            System.out.println("Enter b = ");
            b = sc.nextInt();

            System.out.println("Enter Operation = ");
            operation = sc.next();

            switch (operation) {
                case "add":
                    c = a + b;
                    System.out.println("Addition=" + c);
                    break;

                case "sub":
                    c = a - b;
                    System.out.println("Subtraction=" + c);
                    break;

                case "mult":
                    c = a * b;
                    System.out.println("Multiplication=" + c);
                    break;

                case "div":
                    c = a / b;
                    System.out.println("Division=" + c);
                    break;

                default:
                    System.out.println("wrong option");
                    break;
            }

            System.out.println("Do you want to continue(yes/no) ? : ");
            answer = sc.next();

        } while(answer.equals("yes"));
    }

}
