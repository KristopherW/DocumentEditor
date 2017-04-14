/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kwilmot
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class FlyWeightFactory {
	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	private PrintableDigit[] flyweightPool = new PrintableDigit[10];

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">if (flyweightPool[key] = null) {</span></p>
	 * <p><span style="font-size:18pt;">
	 * </span><span style="font-size:18pt;">    flyweightPool[key] = new PrintableDigit(key);</span>
	 * </p><p><span style="font-size:18pt;">}</span>
	 * </p><p><span style="font-size:18pt;">return flyweightPool[key];
	 * </span><span style="font-size:18pt;"></span></p>
	 * <!-- end-UML-doc -->
	 * @param key
	 * @return
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public PrintableDigit getFlyweight(int key) {
		if(flyweightPool[key] == null){
			flyweightPool[key] = new PrintableDigit(key);
		}
		return flyweightPool[key];
	}
}