import java.util.*;

public class CreatingFiles {
  public static void main(String[] args) {
    
    final Formatter X;

    try{
        X = new Formatter("fred.txt");
        System.out.println("You created a file");
    }
    catch(Exception e){
        System.out.println("You got an error");
    }
  }
}
