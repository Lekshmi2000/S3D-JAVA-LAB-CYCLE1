public class factorial {
	public static void main(String[] args) {
		int N=8,fact=1;
		for(int i=1;i<=N;i++)
		{
			fact=1;
			for(int j=1;j<=i;j++) {
				fact*=j;
			}	
				System.out.println(fact);
		}
	}

}
