
public class Twentyfive {

	public static void main(String[] args) {
	//*********** 54321012345
	//********* 432101234
	//******* 3210123
	//***** 21012
	//*** 101
	//* 0
	//*** 101 
	//***** 21012 
	//******* 3210123 
	//********* 432101234 
	//*********** 54321012345

	int i, j=0;
	int k;
	
	while(j<=5)
	{
		i = 0;
		k = -2*j+11;

		while(i<=k)
		{
			if(i<k)
				System.out.print("*");	
			else {
				System.out.print(" ");
				for(int a=5-j;a>=1;a--)
					System.out.print(a);
				for(int b=0;b<=5-j;b++) {
					System.out.print(b);
					if(b==5-j)
						System.out.println(" ");
				}
			}
			i++;
			}
		j++;
		}
	/////////////////////////////////////
	j=6;
	while(j<=10)
	{
		i = 0;
		k = 2*j-9;

		while(i<=k)
		{
			if(i<k)
				System.out.print("*");	
			else {
				System.out.print(" ");
				for(int a=j-5;a>=1;a--)
					System.out.print(a);
				for(int b=0;b<=j-5;b++) {
					System.out.print(b);
					if(b==j-5)
						System.out.println(" ");
				}
			}
			i++;
			}
		j++;
		}
	}
  }