import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kwilmot
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CompressionBuilderV2 extends CompressionBuilder {

	private HashMap<String, ArrayList<Integer>> hashMap = new HashMap<>();
	private ArrayList<String> wordList = new ArrayList<>();
	private int wordCount = 0;

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>add word to wordList;</p>
	 * <p>if word is not in hashMap{</p>
	 * <blockquote><p>add word as key to hashMap, with wordCount as its first index;</p>
	 * </blockquote><p>}</p>
	 * <p>if word (existing Key) is in hashMap{</p>
	 * <blockquote><p>add wordCount to this word's index</p>
	 * </blockquote><p>}</p>
	 * <!-- end-UML-doc -->
	 * @param word
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildWord(String word) {
		wordCount++;
		if(!wordList.contains(word))
			wordList.add(word);
		
		if(hashMap.containsKey(word) == false){
			ArrayList<Integer> list = new ArrayList<>();
			list.add(wordCount);
			hashMap.put(word, list);
		}
		else{
			ArrayList<Integer> list = new ArrayList<>();
			list = hashMap.get(word);
			list.add(wordCount);
			hashMap.put(word, list);
		}
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>for each word in wordList{</p>
	 * <blockquote><p>compressedText = compressedText + word + " ";</p>
	 * <p>for each index in the word's indexList in hashMap{</p>
	 * </blockquote><blockquote>
	 * <blockquote><p>compressedText = compressedText + index + " ";</p>
	 * <p>compressedText = compressedText + "#";</p></blockquote><p>}</p>
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getResult() {
		for(String word : wordList){
			
			compressedText = compressedText + word;
			
			ArrayList<Integer> list = new ArrayList<>();
			list = hashMap.get(word);
			list.remove(0);
			
			for(int index : list){
				compressedText = compressedText + " " + index;
			}
			
			compressedText = compressedText + "#";
			
		}
		return compressedText.substring(0, compressedText.length()-1);
	}
	
	public CompressionBuilderV2() {
		instanceList.put("CompressionBuilderV2", this);
	}
}