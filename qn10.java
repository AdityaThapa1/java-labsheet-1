import java.util.Scanner;
class Mark
{
public static void main(String args[])
{

Scanner scan=new Scanner(System.in);
System.out.print("Enter marks of English:");
double English=scan.nextDouble();
System.out.print("Enter marks of Maths:");
double Maths=scan.nextDouble();
System.out.print("Enter marks of C programming:");
double C=scan.nextDouble();
System.out.print("Enter marks of FIT:");
double FIT=scan.nextDouble();
System.out.print("Enter marks of FOM:");
double FOM=scan.nextDouble();


if(English<35.0 || Maths<35.0 || C<35.0 || FIT<35.0 || FOM<35.0){
System.out.print("You failed");
}
else{
System.out.printf("Congratulations!!!You passed\n");
double total=English+Maths+C+FIT+FOM;
System.out.printf("Total is %.2f\n",total);
double percentage=((total/500)*100);
System.out.printf("Percentage is %.2f\n",percentage);
if(percentage>90.0){
System.out.printf("Divison=Distinction\n");
}
else if(percentage>80.0){
System.out.printf("Divison=1st division\n");
}
else if(percentage>70.0){
System.out.printf("Divison=2nd division\n");
}
else {
System.out.printf("Divison=3rd division\n");
}

}
}
}
