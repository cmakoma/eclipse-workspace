// Assignement CE_ElementaryST_and_Heap_CODE
// Program Mail
// Author Christian Makoma
// Created Mar 3, 2020


package heapSort;

import java.util.Random;

public class Mail implements Comparable <Mail>{
	private DeliveryType type;
	private String mailCode;
	
	public Mail(DeliveryType type, String mailCode) {
		super();
		this.type = type;
		this.mailCode = mailCode;
	}
	
	public Mail() {
		this.mailCode = randomMailCode();
		this.type = randomType();
	}
	
	private DeliveryType randomType() {
		Random rand = new Random();
		int randInt = rand.nextInt(1000)%5;
		
		switch(randInt) {
		case 0: return DeliveryType.AIR;
		case 1: return DeliveryType.GROUND;
		case 2: return DeliveryType.ONE_DAY;
		case 3: return DeliveryType.PRIORITY;
		 
		}
		return DeliveryType.TWO_DAY;
		
	}

	private String randomMailCode() {
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 5; i++) { 
			int index 
				= (int)(AlphaNumericString.length() 
						* Math.random()); 

			sb.append(AlphaNumericString 
						.charAt(index)); 
		} 
		
		return sb.toString(); 
	}
	
	public String toString() {
		return mailCode + " (" + type + ")" ;
	}

	@Override
	public int compareTo(Mail o) {
		// TODO Auto-generated method stub
		return this.type.equals(o.type) ? this.mailCode.compareTo(o.mailCode) : this.type.compareTo(o.type);
	}
}
