
public class solution {

	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		 return splitArray(input ,0,0,0);
	}
    
    private static boolean splitArray(int input[] ,int si,int lsum ,int rsum){
        if(input.length == si){
            return  lsum==rsum;
        }
        
        if(input[si] % 3 == 0){
            lsum += input[si];
        }
		else if(input[si] % 5 == 0){
            rsum += input[si];
        }
		else{
            return splitArray(input,si+1,lsum+input[si],rsum) || splitArray(input,si+1,lsum,rsum+input[si]) ;
        }
        
        return splitArray(input,si+1,lsum,rsum) ;
		
	}
	

}
