public class primecheck {
	public static void main(String[] args) {
		int N =13,prime=1;
		for(int i=2;i<N;i++)
		{	
			if(N%i==0)
			{
			 prime=0;
			 break;
			}
		}	 
		if(prime==0)
		{	
			System.out.println("number is not prime ");
		}	
		else
		{	
			System.out.println("number is prime");
		}	
	}
}	
		