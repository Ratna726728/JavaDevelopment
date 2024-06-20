import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("rahul", 10);
		hm.put("rathod", 20);
		hm.put("amaravati", 30);
		hm.put("rahul", 50);
		System.out.println(hm);
		
	}
}
//output
//{rahul=50, amaravati=30, rathod=20}