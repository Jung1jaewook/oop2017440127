
public class Twentythree {

	public static void main(String[] args) {
		// 23.***** *
		    //*** ***
		    //* *****
            //를 출력하시오(반복문 써서!)

		int i, j=0;
		int k;
		
		while(j<3)
		{
			i = 0;
			k=5-2*j;
			while(i<7)
			{
				if(i==k)
					System.out.print(" ");	
				else if(i<6)
					System.out.print("*");
				else
					System.out.println("*");	
				i++;
			}
			j++;
		}
	}
}