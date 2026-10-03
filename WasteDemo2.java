import java.util.Scanner;
public class WasteDemo2{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter vehicle number: ");
int vehicle = sc.nextInt();
System.out.println("Enter the amount of waste collected in KGs: ");
double waste=sc.nextDouble();
System.out.println("Enter the number of collection points: ");
int points = sc.nextInt();
System.out.println("Enter the status of Vehicle- Active(A) and Inactive(I): ");
String status =sc.next();
System.out.println("Vehicle Number: "+vehicle);
System.out.println("Waste collected: "+waste+" "+"Kgs");
System.out.println("No of Collection points: "+points);
System.out.println("Status of the vehicle: "+status);
}}