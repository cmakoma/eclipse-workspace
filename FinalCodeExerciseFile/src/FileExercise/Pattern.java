package FileExercise;
// Assignement FinalCodeExerciseFile
// Program Pattern
// Author Christian Makoma
// Created Dec 9, 2019

/**
 * 
 * @author christianmakoma
 * this Class will creates Diamond2 shape 
 *
 */

public class Pattern {
	private final String name;
	public Pattern(String n)
    {
        name = n;
    }

    public String getName() {
        return name;
    }
    
    /**
     * this method recreate the new String that will replace x with o
     */
    @Override
    public String toString() {
        return name.replace("x", "o") ;
    }
}
