

public class StringBuilder {
  public static void main(String[] args) {
      StringBuilder sb = new StringBuilder("Alex");
      System.out.println(sb);

      //.charAt Property
      System.out.println(sb.charAt(2));

      //Set char at index x
      sb.setCharAt(0, 'D');
      sb.setCharAt(2, 'u');
      System.out.println(sb); //Dlux

      //Add char at index x
      sb.insert(1, 'e');//Delux
      System.out.println(sb);

      //Delete char at index or between index
      sb.delete(1, 2);
      System.out.println(sb);

      //Append char
      sb.append(" ");
      sb.append("P");
      sb.append("A");
      sb.append("N");
      System.out.println(sb);

      //length of String
      System.out.println(sb.length());
  }
}
