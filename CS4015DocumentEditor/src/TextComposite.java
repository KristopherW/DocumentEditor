
public class TextComposite extends TextComponent{
	private List<TextComponent> childrenList = new ArrayListAdapter();
	
	public void printValue(){
		for(int i=childrenList.count() - 1; i>=0; i--){
			childrenList.getAt(i).printValue();
		}
	}
	
	public void addChild(TextComponent child){
		childrenList.append(child);
	}
	
	public void removeChild(TextComponent child){
		childrenList.delete(child);
	}
	
	public TextComponent getChild(int index){
		return childrenList.getAt(index);
	}
	
	public int numberOfChildren(){
		return childrenList.count();
	}
}
