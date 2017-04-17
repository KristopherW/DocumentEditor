
public class DocumentBuilder {
	private static DocumentBuilder docBuilder;
	
	private DocumentBuilder(){}
	
	public static DocumentBuilder getInstance(){
		if(docBuilder == null){
			docBuilder = new DocumentBuilder();
		}
		return docBuilder;
	}
	
	private TextComponent root = new TextComposite();
	
	public void buildDoc(){
		root.addChild(new DocumentRow(""));
	}
	
	public void buildRow(char c){
		DocumentCharacter character = FlyweightCharFactory.getFlyweightChar(c);
		TextComponent temp = root.getChild(root.numberOfChildren()-1);
		root.removeChild(temp);
		temp.addChild(character);
		root.addChild(temp);
	}
	
	public TextComponent getDocument(){
		return root;
	}
}
