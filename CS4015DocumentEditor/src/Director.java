
public class Director {
	private DocumentBuilder docBuilder = DocumentBuilder.getInstance();
	
	public String buildDocument(String s){
		String textIn = s;
		docBuilder.nukeList();
		docBuilder.buildDoc();
		
		String[] rows = textIn.split(System.getProperty("line.separator"));
		
		for(String row : rows){
			char[] chars = row.toCharArray();
			for(int i=0; i<chars.length-1; i++){
				docBuilder.buildRow(chars[i]);
			}
		}
		
		docBuilder.buildDoc();
		
		List<TextComposite> temp = docBuilder.getDocument();
		String result = "";
		for(int i=0; i<temp.count()-1; i++){
			result = result + temp.getAt(i).getVal();
		}
		
		return result;

	}
	
}