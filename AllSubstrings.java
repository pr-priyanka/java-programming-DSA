
public class Solution {

	public static void printSubstrings(String str) {
	
		for(int start=0; start< str.length(); start++)
		{
            for(int end=start; end<str.length(); end++)
			{
				System.out.println(str.substring(start,end+1));
				 
			}
		    
		}
		
	}

}
