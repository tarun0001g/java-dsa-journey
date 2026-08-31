public class DistributeStudents {
  public static void main(String args[]){

    int students = 75;
    int rooms[] = {23, 25, 10, 35};
    int remaining = students;
    
    for(int i=0; i<rooms.length; i++){
      if(remaining >= rooms[i]){
        remaining -= rooms[i];
        System.out.println("Room "+(i+1)+ ":" + rooms[i]);
      }
      else{
        rooms[i] = remaining;
        System.out.println("Room "+(i+1)+ ":" + rooms[i]);
        remaining = 0;
      }
    }

  }
}
