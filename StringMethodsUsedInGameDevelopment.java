public class StringMethodsUsedInGameDevelopment {
    public static void main(String[] args) {
        
        String a = "apples";
        String b = "bucky";
        String c = "BUCKY";
        System.out.println(a.length());

        if (a.equals("apples")){ //The equals method is used to compare objects in Strings
            System.out.println("it equals apples!");
        }
        if (b.equalsIgnoreCase(c)){
          System.out.println("bucky's match");
        }
    }
} 
    

