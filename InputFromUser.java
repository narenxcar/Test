import java.util.*;
public class InputFromUser {
	String result,temp;
	char first,second,third,fourth;
	Scanner in=new Scanner(System.in);
	
	void input() {

		System.out.print("Enter the result value ");
		 result=in.next();
		 System.out.println("Enter the four inputs : ");
		 temp=in.next();
		 first=temp.charAt(0);
		 temp=in.next();
		 second=temp.charAt(0);
		 temp=in.next();
		 third=temp.charAt(0);
		 temp=in.next();
		 fourth=temp.charAt(0);
		 OperatorSelection operator=new OperatorSelection();
		 operator.SelectOperator(first,second,third,fourth);
	}
	
}
