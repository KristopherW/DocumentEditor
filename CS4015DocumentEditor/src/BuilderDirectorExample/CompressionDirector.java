import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 */

/** 
 * <!-- begin-UML-doc -->
 * <!-- end-UML-doc -->
 * @author kwilmot
 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
 */
public class CompressionDirector {
	
	private CompressionBuilder compressionBuilder;

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>open file</p>
	 * <p>loop</p>
	 * <p>input a word from open file</p>
	 * <p>compressionBuilder.buildWord(word);</p>
	 * <p>until end of file</p><p></p>
	 * <!-- end-UML-doc -->
	 * @param fileName
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public void compressText(String fileName) {
		File fileIn = new File(fileName);
		
		try {
			Scanner scan = new Scanner(fileIn).useDelimiter(" ");
			
			while(scan.hasNext()){
				String nextWord = scan.next();
				compressionBuilder.buildWord(nextWord);
				//System.out.println(nextWord);
			}
			
			scan.close();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	/** 
	 * <!-- begin-UML-doc -->
	 * <p>this.compressionBuilder = builder;</p>
	 * <!-- end-UML-doc -->
	 * @param builder
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public CompressionDirector(CompressionBuilder builder) {
		this.compressionBuilder = builder;
	}
}