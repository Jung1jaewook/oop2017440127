
public class Five {

	public static void main(String[] args) {
		// 1부터 100사이의 숫자(정수) 중에서 3의 공배수(3,6,9,12,..)들의 총합을 출력하는 프로그램을 작성하시오.(do-while문 사용)
		int i = 1;
		int sum = 0;
		do
		{
			if(i%3==0)
				sum = sum + i;
				i++;
		}while(i<=100);
			System.out.println("100이하의 3의 공배수의 합: " + sum);
	}

}
