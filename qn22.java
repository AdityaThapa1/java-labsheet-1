import java.util.Scanner; 
public class sumarray{    
    public static void main(String[] args) {             
        
	Scanner scan=new Scanner(System.in);     
         
        
	int  [][]arr = new int[2][2];
        System.out.print("Elements of original array:\n ");    
        for (int i = 0; i <2; i++) {
	for (int j = 0; j <2; j++) {     
            System.out.printf("Enter element of [%d][%d]\n",i,j);
	arr[i][j]=scan.nextInt();    
        }   
	} 
            int sum = 0;     
        for (int i = 0; i < 2; i++) {     
         for (int j = 0; j <2; j++) {
               sum+=arr[i][j];  
            
        }    
        }
            System.out.printf("\nArray sum=%d",sum);    
    }    
}    
