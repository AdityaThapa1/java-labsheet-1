import java.util.Scanner; 
public class SortAsc {    
    public static void main(String[] args) {             
        
	Scanner scan=new Scanner(System.in);     
        int temp = 0;    
        System.out.printf("Enter no. of element:");
	int n= scan.nextInt();
	int  []arr = new int[n];
        System.out.print("Elements of original array:\n ");    
        for (int i = 0; i <n; i++) {     
            System.out.printf("Enter element of %d\n",i+1);
	arr[i]=scan.nextInt();    
        }    
              
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
            
         
        System.out.println("Elements of array sorted in ascending order: ");    
        for (int i = 0; i < n; i++) {     
            System.out.printf("%d\t",arr[i]);    
        }   
    }    
}    
