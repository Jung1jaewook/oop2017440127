import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("5번 문제");
		//5. 메뉴를 출력하고, 사용자로부터 입력을 받아 선택된 메뉴를 출력하는 프로그램을 작성하시오.
		//choose one of the following.
		//apple
		//orange
		//banana
		//peach
		//enter your choice here : (사용자 입력)orange
		//--------------
		//Your choice is “orange”.

		System.out.println("메뉴 종류: 1.apple, 2.orange, 3.banana, 4.peach");
		
		String a;
        Scanner input = new Scanner(System.in);
	    System.out.print("enter your choice here:  ");
	    a = input.nextLine();

	    if(a.length()==5) {
	    	if(a.charAt(0)=='a')
	    		System.out.println("Your choice is" + " apple");
	    	else
	    		System.out.println("Your choice is" + " peach");
	    }
	    if(a.length()==6) {
	    	if(a.charAt(0)=='b')
		    	System.out.println("Your choice is" + " banana");
	    	else
		    	System.out.println("Your choice is" + " orange");
	    }
	    System.out.println("===========프로그램 종료============");
	    }
	}
