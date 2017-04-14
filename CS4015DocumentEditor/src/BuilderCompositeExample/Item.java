/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <p><span style="font-size:18pt;">print value;</span></p>
 * <!-- end-UML-doc -->
 * @author kwilmot
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class Item extends ListComponent {

	private int value;

	public Item(int number){
		value = number;
	}
	
	public void printValue() {
		System.out.print(value+" ");
	}
}