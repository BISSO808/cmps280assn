package map;
import java.util.Scanner;

public class main{
	public static void main(String[] args){
		System.out.println("Welcome! What coordinates are you in now?");
		todoist();

	}



	public static void todoist(){
		Scanner get = new Scanner(System.in);
		System.out.print("Enter the X-coordiante: ");
		int x = get.nextInt();
		System.out.print("Enter the Y-coordinate: ");
		int y = get.nextInt();
		
		second newObject =new second();
		newObject.retrace(x,y);

	}


	public static void show(int x, int y){
		System.out.println("Okay, you are now at "+"("+x+","+y+")"+" position! What would you like to do now?"+"\n1. Move to the new position.\n" + 
				"2. Calculate direction of a new position.\n" + 
				"3. Make note about the current position.\n" + 
				"4. Retrace your steps.\n" + 
				"5. Exit.\n" );



		first newObj = new first();
		newObj.whichOption(x,y);
	}
	
	}



	/*
import java.util.Scanner;
public class start {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome! What coordinates are you at now?");
		goForOptions();
	}
	public static void goForOptions() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the X coordinate:");
		int xCor=sc.nextInt();
		System.out.println("Enter the Y coordinate: ");
		int yCor=sc.nextInt();
		two okay=new two();
		okay.retrace(xCor,yCor);

	}
	public static void display(int xCor,int yCor){
		System.out.println("Okay, you are at position"+"("+ xCor+","+ yCor+ ")"+ 
				" what would you like to do now?");	
		System.out.println("1. Move to a new position.\r\n" + 
				"2. Calculate the direction of a new position.\r\n" + 
				"3. Make a note about the current position.\r\n" + 
				"4. Retrace your steps.\r\n" + 
				"5. Exit.\r\n"  
				);
		one yepp=new one();
		yepp.goNext(xCor,yCor);
	}
}
	 */