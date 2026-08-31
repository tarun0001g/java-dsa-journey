public class ReverseString {
  public static void main(String args[]){
    String word = "Hello";
    String reverse = "";
    for(int i=word.length()-1; i>=0; i--){
      reverse = reverse + word.charAt(i);
    }
    System.out.println(reverse);
  }
}


//Note
// arr.length; used for only array
// str.length();  method used for string
// list.size() method used for getting size of arrayList

