// Task 2 Part 1
import java.io.File;  // Import the File class
import java.io.IOException;  // To handle errors

public class CreateWrite_File {
  public static void main(String[] args) {
    try {
      // Creates the unencrypted file for basis
      File myObj = new File("unencrypted.txt"); 
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}