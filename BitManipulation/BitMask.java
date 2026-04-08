package BitManipulation;


public class BitMask {
  public static void main(String[] args) {
    
      // int n=5; //Given Number //Binary:0101 (5)
      // int pos=1; //Given Position
      // int bitMask = 1<<pos; //Always use left shift in bit masking ops

      //Get - Bit Masking
      // if((bitMask & n) == 0) { //Binary Multiplication: 0100 AND 0101
      //   System.out.println("The number was zero(0)");
      // }
      // else{
      //   System.out.println("The number was one(1)");
      // }

      //Set - Bit Masking : sets 1 at given position(pos) (i)
      // int newNumber = n | bitMask; //0101 OR 0010 ---> 0111
      // System.out.println(newNumber); 

      //Clear - Bit Masking (Makes 0 at given position)
      // int n=5; //0101
      // int pos=2;
      // int bitMask = 1<<pos; //0001 --> 0100
      // int notBitMask = ~(bitMask); // 0100 --> 1011
      // int newNumber = n & notBitMask;// 0101 AND 1011 ==> 0001=1
      // System.out.println(newNumber);

      //Update = Set + Clear --> Bit Masking (1-->0 & 0-->1)
      // int n=5; //0101
      // int pos = 0; 
      // int bitMask = 1 << pos; //0001 --> 0001
      // //make 0 (clear)
      // int notBitMAsk = ~bitMask;//1110
      // int newNumber = n & notBitMAsk; // 0101 * 1110 = 0100(4)
      // System.out.println(newNumber);
      //make 1 (set) to position 3
      int n=5; //0101
      int pos = 3; 
      int bitMask = 1 << pos;
      int newNumber = n | bitMask ;
      System.out.println(newNumber);

  }
}
