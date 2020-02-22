// Assignement FinalCodeExerciseSerialize
// Program Serialize
// Author Christian Makoma
// Created Dec 9, 2019


package SerializeExercise;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Serialize {
	public static void serializedCollection() {
		int[] n = new int[20];       
	    //Generates 20 Random Numbers 
	    for(int i = 0; i < n.length; i++) {
	      n[i] = (int)(Math.random() * 9)*5 + 10;
	    }//end for loop
	    System.out.println("numbers : " + Arrays.toString(n));
		
	    ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 0; i < n.length; i++) {
			arrayList.add(n[i]);
				
		}
		Collections.sort(arrayList);
		System.out.println("numbers2: "+arrayList);
		
		// Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream file = new FileOutputStream("NumberList.ser"); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(arrayList); 
              
            out.close(); 
            file.close(); 
              

  
        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
        
        // Deserialization 
        try
        {    
            // Reading the object from a file 
            FileInputStream file = new FileInputStream("NumberList.ser"); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            // Method for deserialization of object 
            ArrayList<?> number2 = (ArrayList<?>)in.readObject(); 
              
            in.close(); 
            file.close(); 
              

            Collections.shuffle(number2);
            System.out.println("numbers2: " + number2); 

        } 
          
        catch(IOException ex) 
        { 
            System.out.println("IOException is caught"); 
        } 
          
        catch(ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
  
	}
}
