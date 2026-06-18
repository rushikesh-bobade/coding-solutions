import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		while(T-- > 0)
		{
		    int R = sc.nextInt();

		    // Budget is in thousand rupees
		    // Maximum for each event = (R * 1000 / 2) / 5
		    
		    int ans = (R * 1000) / 10;

		    System.out.println(ans);
		}
	}
}