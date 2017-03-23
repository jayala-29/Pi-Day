import java.util.Scanner;

public class PiDay2016Decryptor {

  public static void main(String[] args) {
  
    // encrypts message only containing letters and spaces
    System.out.print("Please enter a message to decrypt: ");
    Scanner input = new Scanner(System.in);
    
    String message = input.nextLine();
    
    char[] cMessage = new char[message.length()];
    
    int counter = 96;
    
    // 3.14| 3.143.14| -> a b
    // 3.143.14|3.14| -> ab
    // ...
    for (int i = 0; i < message.length(); i++) {
    
      char c = message.charAt(i);
      
      if (c == ' ') {
      
        System.out.print(" ");
        continue;
      }
      
      if (c == '4') {
      
        counter++;
      }
      
      if (c == '|') {
      
        char d = (char) counter;
        System.out.print(d);
        counter = 96;
      }
    }
  }
}
