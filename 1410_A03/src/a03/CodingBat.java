// Assignement 1410_A03
// Program CodingBat
// Author Christian Makoma
// Created Nov 30, 2019


package a03;

public class CodingBat {
	public String zipZap(String str) {
		String newS = "";

        if (str.length() < 2)
        return str;

    String result = str.substring(0, 1);

    for (int i = 1; i < (str.length() - 1); i++)
    {
        if ((str.charAt(i - 1) != 'z') || (str.charAt(i + 1) != 'p'))
            result += str.charAt(i);
    }

    result += str.substring(str.length() - 1);

    return result;
	}
}
