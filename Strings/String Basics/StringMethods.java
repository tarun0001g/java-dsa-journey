public class StringMethods {
  public static void main(String[] args) {
      String firstName = "Tarun";
      String lastName = "Tarun";

      //Concatenation of Strings
      // String fullName = firstName + " " + lastName;
      // System.out.println(fullName);

      // System.out.println(fullName.length()); //Shoes the length of String

      //CharAt() method to get the character at a specific index
      // System.out.println(fullName.charAt(3));

      // for(int i=0; i<fullName.length(); i++){
      //   System.out.print(fullName.charAt(i) + " ");
      // }

      //Comparison of strings
      // if(firstName.compareTo(lastName)==0){
      //   System.out.println("Strings are equal");
      // }
      // else if(firstName.compareTo(lastName)>0){
      //   System.out.println("First name is greater");
      // }
      // else if(firstName.compareTo(lastName)<0){
      //   System.out.println("Last name is greater");
      // }
      //.compareTo()compares strings alphabetically & gives three values: 1. 0 (equal) 2. +ve(first is greater) 3. -ve (second is greater)
      // num1.equals(num2):- also check equality but it return only true or false
      
      //NOTE:- if( firstName == lastName) not gives always correct answers. because string are the non primitive objects(in java)
      //NOTE:- in java, normal data(variables) and data(objects have different functionality)

      //SUBSTRINGS IN JAVA
      // String sentence = "My name is Tarun";
      // String name = sentence.substring(11, sentence.length());//.substring(BeginIndex, EndIndex) (Note:Exclusive endIndex)
      // System.out.println(name);
      // String sentence = "TarunMakavana";
      // System.out.println(sentence.substring(5)); //ByDefault it assume the last one as a end Index

      //NOTE:- Strings are immutable(once it declared, it cannot be change in memory)

      //ParseInt Method of Integer class:-
      //  String str = "123";
      //  int number = Integer.parseInt(str); //It is used to convert a String into an int (integer)
      //  System.out.println(number+10);
      
      //ToString Method of String class
      int number = 123;
      String str = Integer.toString(number); //converts Int -> String
      System.out.println(str);// toString(): returns a string representation of an object
      System.out.println(str.length()); //Also used to count digits of a number
      
      
   



  }
}
