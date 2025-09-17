package week1.day2.homework;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int input =13;
		boolean isprime= true;
		for(int i=2; i<input;i++)
		{
			if(input%i==0) 
			{
				isprime= false;
				break;
			}
		}
		if(isprime && input>1 ) 
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is not a Prime Number");
		}
	}

}
