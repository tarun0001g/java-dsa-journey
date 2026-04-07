
package Arrays.Basics;

import java.util.Scanner;

public class Practice{
  public static void main(String[] args) {

  //     System.out.println("Tarun");

  //   //Declaration of an array
  //  // int marks[] = new int[3];
  //   int marks[] = {99, 97, 90};
  //   //Assigning Values
  //   // marks[0]=99;
  //   // marks[1]=97;
  //   // marks[2]=90;

  //   //System.out.println(marks);//This will not actually shows the values of an array 
  //   //System.out.println(marks[2]);
  //   //Print all Values;
  //   for(int i=0; i<3; i++){
  //     System.out.println(marks[i]);
  //   }

  //---------------------------------------------------------------------------------------------------------
  //TAKING INPUT IN AN ARRAY
  // Scanner sc = new Scanner(System.in);
  // System.out.print("Enter size of an array: ");
  // int size = sc.nextInt();
  // int marks[] = new int[size];
  
  // System.out.println("Enter values in array: ");
  // //Input in array
  // for(int i=0; i<size; i++){
  //   marks[i] = sc.nextInt();
  // }

  // //Printitng the array
  // for(int i=0; i<marks.length; i++){
  //   System.out.print(marks[i]+ " ");
  // }
  //--------------------------------------------------------------------------------------------------------
  //SEARCHING AN ELEMENT IN ARRAY
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter size of an array: ");
  int size = sc.nextInt();
  int marks[] = new int[size];
  System.out.println("Enter values in array: ");
  //Input in array
  for(int i=0; i<size; i++){
    marks[i] = sc.nextInt();
  }

  System.out.print("Enter the target element : ");
  int n = sc.nextInt();

  //Searching an element
  for(int i=0; i<marks.length ; i++){
    if(n == marks[i]){
      System.out.println("The element found at index: "+i);
    }
  }
  }
}