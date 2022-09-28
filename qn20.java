import java.util.Scanner; 
public class sum {    
    public static void main(String[] args) { 
		
        
	Scanner scan=new Scanner(System.in);     
        int add=0;   
        System.out.printf("Enter no. of element:");
	int n= scan.nextInt();
	int  []arr = new int[n];
        System.out.print("Elements of original array:\n ");    
        for (int i = 0; i <n; i++) {     
            System.out.printf("Enter element of %d\n",i+1);
	arr[i]=scan.nextInt();    
        }    
              
        for (int i = 0; i < n; i++) {     
            add+=arr[i];   
               }         
        
            System.out.printf("Sum is %d",add);      
    }    
}    
