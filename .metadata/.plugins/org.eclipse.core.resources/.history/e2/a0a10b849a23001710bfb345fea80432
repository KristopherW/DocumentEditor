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
public class CompressionBuilderV1 extends CompressionBuilder {

	private HashMap<String, Integer> hashMap = new HashMap<>();
	private int wordCount = 0;

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>wordCount++;</p>
	 * <p>if word is not in hashMap{</p>
	 * <blockquote><p>hashMap.add(key = word, value = wordCount);</p>
	 * <p>compressedText = compresseedText + word + " ";</p>
	 * </blockquote><p>}</p><p>otherwise, if word is in hashMap{</p>
	 * <blockquote><p>index = hashMap.get(key=word)</p>
	 * </blockquote
	 * <blockquote><p>compressedText = compressedText + "#" + index + " ";</p></blockquote>
	 * <p>}</p>
	 * <!-- end-UML-doc -->
	 * @param word
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildWord(String word) {
		wordCount++;
		
		if(hashMap.containsKey(word) == false){
			hashMap.put(word, wordCount);
			compressedText = compressedText + word + " ";
		}
		else{
			int index = (int)hashMap.get(word);
			compressedText = compressedText + "#" + index + " ";
		}
	}
	
	public String getResult(){
		return compressedText;
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>instanceList.add(key="CompressionBuilderV1", value=this);</p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CompressionBuilderV1() {
		instanceList.put("CompressionBuilderV1", this);
	}
}