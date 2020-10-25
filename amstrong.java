public class amstrong {
	public static void main(String[] args) {
		int N=153,cube=0,digit,temp;
		temp=N;
		while(N>0)
		{
			digit=N%10;
			cube+=(digit*digit*digit);
			N=N/10;
		}
		if(cube==temp)
			System.out.println("number is amstrong");
		else
			System.out.println("number is not amstrong");
	}

}
