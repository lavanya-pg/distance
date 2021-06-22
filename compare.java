package bridgelabz.distance;

import java.util.Iterator;

public class compare {

	public static boolean compare (int line1, int line2, Object[] arr2, Object[] arr) {
		int line11 = arr. length;
		int line21 = arr2. length;
		
		if(line11 != line21)
		  return false;
		
		for (int i = 0; i < line11; i++)
		if(arr[1] != arr2[i])
			return false;
		
		else
		return true;
		return false;
	}
	
	public static <arr, arr2> void main(String[] args) {
		int arr[]= { 3,5 };
		int arr2[]= { 5,3 };
		
		if (equal (arr, arr2))
			System.out.println("Yes");
		else
			System.out.println("No");
	}		
}

