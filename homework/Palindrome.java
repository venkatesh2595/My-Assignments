package week1.day2.homework;

public class Palindrome {
public static void main(String[]args) {
	
	int input=54321;
	int output=0;
	
	for(int i=input;i>0;i/=10) 
	{
		
		int rem =i%10;
		output = output*10 +rem;	
		System.out.println(output);
	}
	
	if(input==output)
	{
		System.out.println("It is a Palindrome");
	}
	else
	{
		System.out.println("It is not a Palindrome");
	}
}
}
