
public class DocumentBuilder {
	private static DocumentBuilder docBuilder;
	
	private DocumentBuilder(){}
	
	public static DocumentBuilder getInstance(){
		if(docBuilder == null){
			docBuilder = new DocumentBuilder();
		}
		return docBuilder;
	}
	
	private List<TextComposite> rowList = new ArrayListAdapter();
	
	public void buildDoc(){
		rowList.append(new TextComposite());
	}
	
	public void buildRow(char c){
		DocumentCharacter character = FlyweightCharFactory.getFlyweightChar(c);
		TextComposite temp = rowList.last();
		rowList.delete(temp);;
		temp.addChild(character);
		rowList.append(temp);
	}
	
	public List<TextComposite> getDocument(){
		return rowList;
	}
}
