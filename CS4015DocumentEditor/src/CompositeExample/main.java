import java.util.Scanner;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListBuilder builder = new ListBuilder();
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your list: ");
		
		String input = scan.nextLine();
		
		scan.close();
		
		for(char token : input.toCharArray()){
			if(token == '('){
				builder.buildOpenBracket();
			}
			else if(token == ')'){
				builder.buildCloseBracket();
			}
			else if(Character.isDigit(token)){
				
				builder.buildElement(Character.getNumericValue(token));
			}
		}
		
		ListComponent list = builder.getList();
		list.printValue();
	}

}
