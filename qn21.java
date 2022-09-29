import java.util.Scanner; 
public class largesmall {    
    public static void main(String[] args) {             
        
	Scanner scan=new Scanner(System.in);     
         
        System.out.printf("Enter no. of element:");
	int n= scan.nextInt();
	int  []arr = new int[n];
        System.out.print("Elements of original array:\n ");    
        for (int i = 0; i <n; i++) {     
            System.out.printf("Enter element of %d\n",i+1);
	arr[i]=scan.nextInt();    
        }    
            int small = arr[0], large=arr[0];     
        for (int i = 1; i < n; i++) {     
         
               if(small > arr[i]) {    
                     small=arr[i];
               }  
	 if(large < arr[i]) {    
                     large=arr[i];
               }    
            
        }    
        
            System.out.printf("\nLargest no.=%d\nSmallest no.=%d",large,small);    
    }    
}    
