public class fibonacci {
	public static void main(String[] args) {
		int N=15;
		int F=0,S=1,T;
		for(int i=0;i<N;i++)
		{
			System.out.println(F);
			T=F+S;
			F=S;
			S=T;
		}
		
	}

}
