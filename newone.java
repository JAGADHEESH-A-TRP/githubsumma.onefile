import java.util.Scanner;

class newone{
    public static void main(String[] args) {
        System.out.println("Hi!JAGADHEESH WELCOME!..");
        System.out.println("This is your first Java program.");
        
    } 
}


class Main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Hi! Welcome to Java Programming  " + userName);  
    
  }
}

