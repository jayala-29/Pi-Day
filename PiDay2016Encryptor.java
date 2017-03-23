import java.util.Scanner;

public class PiDay2016Encryptor {

  public static void main(String[] args) {
  
    // encrypts message only containing letters and spaces
    System.out.print("Please enter a message to encrypt (first put in length including spaces): ");
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    
    String message = input.nextLine();
    message.toLowerCase();
    
    char[] cMessage = new char[n];
    
    // 4 a b ->  3.14 3.143.14
    // 6 ab ba ->  3.14|3.143.14 3.143.14|3.14
    // ...
    for (int i = 0; i < n; i++) {
    
      cMessage[i] = message.charAt(i);
      
      // if a space in the message, just print a space
      if (cMessage[i] != 32) {
        
        // print π-position-in-the-alphabet number of times
        // 2 a ->  3.14
        // 2 b ->  3.143.14
        // 2 c ->  3.143.143.14
        // ...
        for (int j = 96; j < cMessage[i]; j++) {
      
          System.out.print("3.14");
        }
        
        System.out.print("|");
      }
    
      else {
    
        System.out.print(" ");
      }
    }
  }
}
