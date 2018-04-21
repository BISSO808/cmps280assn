package map;
import java.util.Scanner;
public class first{
	public void whichOption(int x, int y){
		Scanner get = new Scanner(System.in);
		int choice = get.nextInt();

		if(choice == 1){
			move();
		}
		else if (choice == 2){
			calculate(x, y);
		}
		else if (choice == 3){
			note(x,y);
		}
		else if(choice == 4){
			retrace(x, y);
		}
		else if (choice == 5){
			System.out.println("Thank you for playing!");
			System.exit(0);
		}
		else {
			System.out.print("That is not an option!");
			whichOption(x,y);
		}
	}

	public void note(int x,int y){
		second objCreated = new second() ;
		objCreated.askDetail(x, y);
	}

	public void retrace(int x,int y) {
		second objCreated = new second();
		objCreated.show(x,y);
	}

	public void move() {
		main again =new main();
		again.todoist();
	}


	public void calculate(int x,int y) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter X - coordinate of the position you’d like to find the direction to:");
		int p= sc.nextInt();
		System.out.println("Enter the Y - coordinate of the position you’d like to find the direction to:");
		int q = sc.nextInt();

		if((p-x)<0&& (q-y)<0) {
			System.out.println("South West");
		}
		else if((p-x)>0&& (q-y)<0) {
			System.out.println("South East");
		}
		else if((p-x)>0&& (q-y)>0) {
			System.out.println("North East");
		}
		else if(((p-x)<0)&& ((q-y)>0)) {
			System.out.println("North West");
		}

		else if(((p-x)==0)&&((q-y)==0)){
			System.out.println("This is your current position. Please select an option");
		}
		else if ((p-x)==0||(q-y)==0) {
			if((p-x)>0) {
				System.out.println("East");
			}
			else if((q-y)>0) {
				System.out.println("North");
			}
			else if((p-x)<0) {
				System.out.println("West");
			}

			else if((q-y)<0) {
				System.out.println("South");
			}
		}


		x=p;
		y=q;
		second newObject =new second();
		newObject.retrace(p,q);

		main Objectnew= new main();
		Objectnew.show(x,y);
	}



}