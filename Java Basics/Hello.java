
import java.util.Scanner;

class Hello {

    public static void main(String[] args) {
        // System.out.println("Hello Tarun!");

//----------------------------------------------------------------------------------------------------
        // Scanner sc = new Scanner(System.in);
        // // String name = sc.next();//.next will stores only first word
        // String name = sc.nextLine(); // this will stores and shows entire input line
        // System.out.println("Your name is :" + name);
//------------------------------------------------------------------------------------------------------
        //BASIC CONDITIONS AND CALCULATIONS IN JAVA
//       Scanner sc = new Scanner(System.in);
//       System.out.println("Enter values one by one!");
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       int sum = a + b;
//       System.out.println("The sum is: "+ sum);
//       if(a>b){
//             System.out.println("A is greater number");
//       }
//       else{
//             System.out.println("B is greater number");
//       }
//   }
        //--------------------------------------------------------------------------------------------------
//
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter the number: ");
        // int num = sc.nextInt();
        // if(num%2==0){
        //       System.out.println("The given number is even");
        // }
        // else{
        //       System.out.println("The given number is odd");
        // }
//-------------------------------------------------------------------------------------------------------
        //BASIC CALCULATOR
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter both numbers one by one:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose number(1-5) for the opearion");
        System.out.println(" 1. Sum(+)\n 2. Sub(-)\n 3. Mul(*)\n 4. Div(/)\n 5. Modular(%)");

        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a / b);
                break;
            case 5:
                System.out.println(a % b);
                break;
            default:
                System.out.println("Please choose number from 1-5");

        }

    }
}
