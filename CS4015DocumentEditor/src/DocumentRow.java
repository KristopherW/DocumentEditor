
public class DocumentRow extends TextComponent{
	private List<String> row = new ArrayListAdapter();
	
	public DocumentRow(String s){
		row.append(s);
	}
	
	public void printValue(){
		System.out.print(row);
	}
}
