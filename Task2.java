// Task 2 Part 2
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // To handle errors
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner; 

public class Task2 {
  public static void main(String[] args) throws IOException{
    try {
      // Reads from the file created
      File myObj = new File("unencrypted.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();

        // Input shift size 
        Scanner shiftScanner = new Scanner(System.in);  
        System.out.print("Enter Shift size: ");
        int shiftSize = shiftScanner.nextInt();  

        // Reads file
        System.out.print("Message read from the file: ");
        System.out.println(data);

        // Simple encryption algorithm that shifts the character array
        char[] chars = data.toCharArray();      
        System.out.print("Encrypted message: ");
        for(char c : chars){
        c += shiftSize;
        // Display encrypted message  
        System.out.print(c);
        }

        try
        {
        FileWriter fw = new FileWriter("encrypted.txt");
        fw.write("Encrypted message: "+data);
        fw.close();
        }catch (Exception ex)
        {
            System.out.println(ex);
        }      
      }
      myReader.close();

    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}