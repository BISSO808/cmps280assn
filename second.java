package map;
import java.util.*;


public class second{
	static ArrayList<String> storage = new ArrayList<String>();
	
	public void askDetail(int x,int y) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Any note about this place ?");
      
		String note= sc.nextLine();
      
		storage.add("Note about this place: "+note);
		main word = new main();
		word.show(x,y);
	}
	public void retrace(int x,int y){
		storage.add("("+x+","+y+")");	
		main word = new main();
		word.show(x,y);
	}
	public void show(int x,int y) {
		for(String a:storage) {
			System.out.println(a);
		}
		main word = new main();
		word.show(x,y);
	}
}






