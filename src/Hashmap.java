import java.util.*;
public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> myMap = new HashMap<Integer, String>();
		boolean answer = true;
		
		//System.out.println("Enter the values in Hashmap");
		Scanner sc = new Scanner (System.in);
		
		//while (answer) {
		
		for(int i=0; i<=10;i++){
			System.out.println("Enter the key and Value");
			myMap.put(i, sc.next());
			
		}
			for (int j=0; j<=10;j++){
				String value = myMap.get(j);
				System.out.println(value);


		
			
			
			
		
		}
		
        }
}



