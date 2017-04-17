import java.util.Stack;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kwilmot
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class ListBuilder {

	private ListComponent root = new ListComposite();
	private Stack<ListComposite> stack = new Stack<>();

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">create a new ListComposite object/node;</span></p>
	 * <p><span style="font-size:18pt;">if (stack is not empty) {</span></p>
	 * <p><span style="font-size:18pt;">get the listComposite from top of stack (do not remove it)</span></p>
	 * <p><span style="font-size:18pt;">int size = top.numberOfChildren()</span></p>
	 * <p><span style="font-size:18pt;">top.addChild(size, newListComposite);</span></p>
	 * <p><span style="font-size:18pt;">}</span></p>
	 * <p><span style="font-size:18pt;">push newListComposite onto stack;</span>
	 * </p><p><span style="font-size:18pt;"></span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildOpenBracket() {
		ListComposite newListComposite = new ListComposite();
		
		if(!stack.empty()){
			ListComposite top = stack.peek();
			int size = top.numberOfChildren();
			top.addChild(size, newListComposite);			
		}
		
		stack.push(newListComposite);
		
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">pop stack</span></p>
	 * <!-- end-UML-doc -->
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildCloseBracket() {
		root = stack.pop();				
				
//		root.printValue();
//		System.out.println("");
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p><span style="font-size:18pt;">create newItem;</span></p>
	 * <p><span style="font-size:18pt;">top.addChild(newItem);</span></p>
	 * <!-- end-UML-doc -->
	 * @param number
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void buildElement(int number) {
		Item newItem = new Item(number);
		ListComposite top = stack.peek();
		top.addChild(top.numberOfChildren(), newItem);
	}

	public ListComponent getList() {
		return root;
	}

}