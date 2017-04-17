
public class DocumentCharacter extends TextComponent{
	private char character;
	
	public DocumentCharacter(char c){
		character = c;
	}
	
	public void printValue(){
		System.out.print(character);
	}
	
	public String getVal(){
		String s = "" + character;
		return s;
	}
}