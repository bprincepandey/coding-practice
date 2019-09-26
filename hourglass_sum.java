import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
		
		int top, middle, bottom, sum;

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        scanner.close();

		int largestSum = -54;//initilize to lowest possible. if all 6 nos are -9, then -54
		
		//stopping at 3,3 as there isn't any hourglass possible after 3,3
        for (int i = 0; i < 4; i ++) {
			for ( int j = 0; j < 4; j ++) {
				
				//top 3 elements of the hourglass
				top = arr[i][j] + arr[i][j+1] + arr[i][j+2];
				//middle element of the hourglass
				middle = arr[i+1][j+1];
				//bottom 3 elements of the hourglass
				bottom = arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
				sum = top + middle + bottom;
				
				if(sum > largestSum)
					largestSum = sum;
			}
        }
		
		System.out.print(largestSum);
    }
}
