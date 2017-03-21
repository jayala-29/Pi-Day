import java.util.Scanner;

public class PiDay2016Encryptor {

  public static void main(String[] args) {
  
    // encrypts message only containing letters and spaces
    Scanner input = new Scanner(System.in);
    
    int n = input.nextInt();
    
    String message = input.nextLine();
    message.toLowerCase();
    
    char[] cMessage = char[n];
    
    // a b -> 3.14 3.143.14
    // ab ba -> 3.14|3.143.14 3.143.14|3.14
    // ...
    for (int i = 0; i < n; i++) {
    
      char[i] = message.charAt(i);
      
      // if a space in the message, just print a space
      if (char[i] != 32) {
        
        // print π-position-in-the-alphabet number of times
        // a -> 3.14
        // b -> 3.143.14
        // c -> 3.143.143.14
        // ...
        for (int j = 96; j < char[i]; j++) {
      
          System.out.print("3.14");
        }
      
        System.out.print("|");
    
      else {
    
        System.out.print(" ");
      }
    }
  }
}
