import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		System.out.println("5�� ����");
		//5. �޴��� ����ϰ�, ����ڷκ��� �Է��� �޾� ���õ� �޴��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//choose one of the following.
		//apple
		//orange
		//banana
		//peach
		//enter your choice here : (����� �Է�)orange
		//--------------
		//Your choice is ��orange��.

		System.out.println("�޴� ����: 1.apple, 2.orange, 3.banana, 4.peach");
		
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
	    System.out.println("===========���α׷� ����============");
	    }
	}