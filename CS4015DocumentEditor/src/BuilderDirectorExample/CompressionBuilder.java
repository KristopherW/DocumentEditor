/**
 * 
 */

import java.util.HashMap;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kwilmot
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CompressionBuilder {

	private CompressionDirector compressionDirector;
	protected String compressedText = "";
	private static CompressionBuilder singleInstance = null;
	protected static HashMap<String, CompressionBuilder> instanceList = new HashMap<>();

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>empty behavior</p>
	 * <!-- end-UML-doc -->
	 * @param word
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildWord(String word) {

	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>return compressedText;</p>
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public String getResult() {
		return singleInstance.getResult();
	}

	protected CompressionBuilder() {
		// begin-user-code
		// TODO Auto-generated constructor stub
		// end-user-code
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>if (singleInstance == null){</p>
	 * <blockquote><p>singleInstance = instanceList.get(Env.compressionType);</p>
	 * <p>if(singleInstance == null){ singleInstance = new CompressionBuilder(); }</p></blockquote><p>}</p>
	 * <p>return singleInstance;</p>
	 * <!-- end-UML-doc -->
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static CompressionBuilder getInstance() {
		if(singleInstance == null){
			singleInstance = (CompressionBuilder) instanceList.get(Env.compressionType);
			
			if(singleInstance == null){
				singleInstance = new CompressionBuilder();
			}
		}
		return singleInstance;		
	}
}