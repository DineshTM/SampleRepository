package newProject;
import java.util.*;
interface Ticket{
   //source is implicitly final variable
   String source = new String("Chennai Central");
   void getInfo();	
   void printTicket();
}

public class TicketReservation implements Ticket{
	String passengerName = new String();
	String address = new String();
	int adhaarNumber=0;
	String destination =  new String();
	int age =0;
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
      // TODO Auto-generated method stub
      TicketReservation reservation = new TicketReservation();
      reservation.getInfo();
      reservation.printTicket();
	}
    public void getInfo() {
    	System.out.println("Enter passenger name");
    	passengerName = sc.next();
    	System.out.println("Enter passenger age");
    	age = sc.nextInt();
    	System.out.println("Enter passenger address");
    	address = sc.next();
    	System.out.println("Enter passenger adhaar number");
    	adhaarNumber= sc.nextInt();
    	System.out.println("Enter passenger destination");
    	destination = sc.next();
    }
    public void printTicket() {
     	System.out.println("--------------------------------------------------------------");
     	System.out.println("Passenger name: "+passengerName);
    	System.out.println("age: "+age);
    	System.out.println("Address: "+address);
     	System.out.print("Source: "+source+"\t\t\t");
     	System.out.println("Destination: "+destination);
     	System.out.println("Train Number: "+TicketReservation.getTrainNumber());
    	System.out.println("---------------------------------------------------------------");
    }
    static int getTrainNumber() {
    	int  trainNumber =(int)(Math.random()*10000000);
    	return trainNumber;
    }
}
