import java.awt.Color;
import java.awt.Font;

/**
 * 
 */


/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kwilmot
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class PrintableDigit {

	private int digit = 0;

	private String color = "";
	
	
	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">font = context.getIndex()%2==0?"Times":"Arial";</span>
	 * </p><p><span style="font-size:18pt;">size = context.getOccurence(digit) + 5;</span>
	 * </p><p><span style="font-size:18pt;">context.incOccurence(digit);</span>
	 * </p><p><span style="font-size:18pt;">print("digit=" + digit + " color=" + color + " font=" + font + " size=" + size);</span></p>
	 * <!-- end-UML-doc -->
	 * @param context
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printSelf(Context context) {
		String font = "";
		int fontSize = 0;
		
		font = context.getIndex()%2==0?"Times":"Arial";
		fontSize = context.getOccurence(digit) + 5;
		context.incOccurence(digit);
		System.out.println("digit=" + digit + " color=" + color + " font=" + font + " size=" + fontSize);
		
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">digit = n;</span></p><p><span style="font-size:18pt;">color = digit%2==0?"red":"black";</span></p>
	 * <!-- end-UML-doc -->
	 * @param n
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public PrintableDigit(int n) {
		digit = n;
		color = digit%2==0?"red":"black";
	}
}