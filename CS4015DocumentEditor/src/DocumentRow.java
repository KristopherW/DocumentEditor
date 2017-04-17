
public class DocumentRow extends TextComponent{
	private List<Character> row = new ArrayListAdapter();
	
	public DocumentRow(char c){
		row.append(c);
	}
	
	public void printValue(){
		for(int i=0; i<row.count()-1; i++){
			System.out.println(row.getAt(i));
		}
	}
}