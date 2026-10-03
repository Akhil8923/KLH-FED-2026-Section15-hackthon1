import java.util.Scanner;
public class WasteDemo1{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the amount of waste collected in KGs: ");
double waste=sc.nextDouble();
if(waste>=100){
System.out.println("Collection Target Achieved");}
else{
System.out.println("More Waste Collection is Required");}
}

}

