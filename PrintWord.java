import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zoho {
	public static void main(String []args) {
		Scanner scanner =new Scanner(System.in);
		String inputString =scanner.next();
		int halflen = inputString.length()/2;
		String s = inputString.substring(halflen) 
				+ inputString.substring(0, halflen);
		for(int i=0;i<=s.length();i++) {
			String temp = s.substring(0, i);
			for(int j=0; j<temp.length();j++) {
				System.out.print(temp.charAt(j) + " ");
			}
			System.out.println();
		}
	}
}
