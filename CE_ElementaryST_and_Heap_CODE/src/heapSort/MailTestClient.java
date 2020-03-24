// Assignement CE_ElementaryST_and_Heap_CODE
// Program MailTestClient
// Author Christian Makoma
// Created Mar 3, 2020


package heapSort;

import java.util.Arrays;



public class MailTestClient {

	public static void main(String[] args) {
		Mail[] allMail = {
				new Mail(DeliveryType.AIR, "YTWEW"),
				new Mail(DeliveryType.GROUND, "ASDFF"),
				new Mail(DeliveryType.AIR, "ASDFG"),
				new Mail(DeliveryType.TWO_DAY, "UIOPY"),
				new Mail(DeliveryType.ONE_DAY, "ASDFG"),
				new Mail(DeliveryType.GROUND, "ZXCVB"),
				new Mail(DeliveryType.GROUND, "AAABB"),
				new Mail(DeliveryType.AIR, "IUYTR"),
				new Mail(DeliveryType.TWO_DAY, "SKDIU"),
				new Mail(DeliveryType.PRIORITY, "PQOWI"),
		};
		
		System.out.println("Original array allMail:");
		for (Mail m : allMail) {
			System.out.println(m);
		}
		System.out.println();
		
		System.out.println("Sorted array allMail:");
		Arrays.sort(allMail);
		for (Mail m : allMail) {
			System.out.println(m);
		}
		System.out.println();
	}

}
