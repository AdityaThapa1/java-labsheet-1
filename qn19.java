import java.util.Scanner; 
public class SortAsc {    
    public static void main(String[] args) {        
            
        //Initialize array     
        
	Scanner scan=new Scanner(System.in);     
        int temp = 0;    
        System.out.printf("Enter no. of element:");
	int n= scan.newInt();
	int  arr[];
        //Displaying elements of original array    
        System.out.println("Elements of original array: ");    
        for (int i = 0; i <n; i++) {     
            System.out.print(arr[i] + " ");    
        }    
            
        //Sort the array in ascending order    
        for (int i = 0; i < n; i++) {     
            for (int j = i+1; j < n; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        System.out.println();    
            
        //Displaying elements of array after sorting    
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < n; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    
