import java.util.Scanner;  // Import the Scanner class

class main {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("Enter username");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Enter your gender");
    String gender = myObj.nextLine();  // Read user input
    System.out.println("Enter your dob");
    String dob = myObj.nextLine();  // Read user input
	System.out.println("Details are:" );  // Output user input
    System.out.println("Name: " + userName);  // Output user input
	System.out.println("Gemder: " + gender);  // Output user input
	System.out.println("DOB: " + dob);  // Output user input

  }
}
