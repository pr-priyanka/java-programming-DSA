
public class solution {

	public static int countZerosRec(int input){
		if(input<10){
			if(input==0){
				return 1;
			}
			else{
				return 0;
			}
		}
		if(input%10==0){
			return countZerosRec(input/10)+1;

		}
		else{
			return countZerosRec(input/10);
		}

	}
}
