import java.util.*;
public class OperatorSelection {
	Scanner in=new Scanner(System.in);
	String result;
	OperatorSelection(String result){
		this.result=result;
	}
	void SelectOperator(char first,char second,char third,char fourth) {
		System.out.println("Select any values ");
		System.out.print(first+"  ");
		System.out.println(second+"  ");
		System.out.print(third+"  ");
		System.out.println(fourth+"  ");
		System.out.println(" 		OR\nSelect any of operators ");
		System.out.print(" ( ");
		System.out.print(" + ");
		System.out.print(" - ");
		System.out.print(" * ");
		System.out.print(" / ");
		System.out.print(" ) ");
		String temp=in.next();
		char operator=temp.charAt(0);
		String solution=null;
		
	}
}
