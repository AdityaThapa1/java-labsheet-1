
public class prime	 {
    
  public static void main(String args[]) {
	int i,j,count;
	System.out.print("Prime numbers from 20 to 100 are:\n");
	for(i=20;i<=100;i++){
	count=0;
		for(j=1;j<=i;j++){
			if(i%j==0){
			count++;
	}         
		}
	if(count==2){
	
		 System.out.printf("%d\t",i);
	}
  
    }
}
}
	
	
