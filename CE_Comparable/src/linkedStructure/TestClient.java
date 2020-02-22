// Assignement CE_Comparable
// Program TestClient
// Author Christian Makoma
// Created Jan 30, 2020


package linkedStructure;

public class TestClient {

	public static void main(String[] args) {
		WordList list = new WordList();
		System.out.println("size: " + list.size());
//		System.out.println(list.size() == 0 ? "List is empty" :"List is not empty\n");
		System.out.println(list.isEmpty() ? "List is empty" :"List is not empty\n");
		System.out.println();
		 
		list.append("ant");
		list.append("bat");
		list.append("cow");
		list.append("dog");
		System.out.println("size: " + list.size());
		System.out.println(list.size() == 0 ? "List is empty" :"List is not empty");
		System.out.println("list: " + list);

		for(int i = 0; i < list.size(); i++ ) {
			System.out.print("["+i+"]\n");
		}

	}

}
