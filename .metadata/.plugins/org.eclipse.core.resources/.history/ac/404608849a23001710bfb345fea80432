/**
 * 
 */

import java.util.ArrayList;

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kwilmot
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ListComposite extends ListComponent {

	private ArrayList<ListComponent> childrenList = new ArrayList<>();

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">print "(";</span></p>
	 * <p><span style="font-size:18pt;">for each child in children list in reverse order</span></p>
	 * <p><span style="font-size:18pt;">child.printValue</span></p>
	 * <p><span style="font-size:18pt;">end of for</span></p>
	 * <p><span style="font-size:18pt;">print ")"</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void printValue() {

		System.out.print("( ");
		
		for(int i=childrenList.size() - 1; i>=0; i--){
			childrenList.get(i).printValue();
		}
		
		System.out.print(") ");
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void addChild(int index, ListComponent child) {
		childrenList.add(index, child);
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void removeChild(int index) {
		childrenList.remove(index);
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public ListComponent getChild(int index) {
		return childrenList.get(index);
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public int numberOfChildren() {
		return childrenList.size();
	}
}