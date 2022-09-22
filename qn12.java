import java.util.Scanner;
public class week {

    
  public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        String DayName = "Unknown";
        System.out.print("Input a day number: ");
        int day = input.nextInt();

        switch (day) {
            case 1:
               DayName = "Sunday";
                break;
            case 2:
                DayName = "Monday";
                break;
            case 3:
                DayName = "Tuesday";
                break;
            case 4:
                DayName = "Wednesday";
                break;
            case 5:
                DayName = "Thursday";
                break;
            case 6:
                DayName = "Friday";
                break;
            case 7:
                DayName = "Saturday";
                break;
          default:
	  System.out.print("Invalid Input!!!");
        }
        System.out.print(DayName + " ");
    }
}
