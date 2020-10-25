public class palindrome {
	public static void main(String[] args) {
		int N=121,temp,digit,reverse=0;
		temp=N;
		while(N>0)
		{
		    digit=N%10;
		    reverse=reverse*10+digit;
		    N=N/10;
			
		}
		if(reverse==temp)
		{
			System.out.println("number is palindrome");
		}
		else
		{
			System.out.println("number is not palindrome");
		}
		
	}

}
