import java.util.HashMap;

public class FirstNonRepeatChar {
  public static void main(String[] args) {
      
    //To solve string problems we will convert it into char array
    String s = "swiss";

    HashMap<Character, Integer> map = new HashMap<>();

    //We use for loop and tocharArray() to put string values in hashmap
    for(char c  : s.toCharArray()){
        map.put(c, map.getOrDefault(c, 0)+1);
    }

    //To check value of string we also used for loop and toCharArray() method
    for(char c : s.toCharArray()){
      if(map.get(c)==1){
        System.out.println("The first non repeating charachter is: "+c);
        break;
      }
    }
    

  }
}
