import java.util.HashMap;

public class FlyweightCharFactory{
	private static HashMap<Character, DocumentCharacter> flyweightPool = new HashMap<>();
	
	public static DocumentCharacter getFlyweightChar(char key){
		if(!flyweightPool.containsKey(key)){
			flyweightPool.put(key, new DocumentCharacter(key));
		}
		return flyweightPool.get(key);
	}
}