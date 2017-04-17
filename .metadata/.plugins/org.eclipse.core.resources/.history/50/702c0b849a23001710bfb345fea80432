import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
public class MainApp {
	/** 
	 * <!-- begin-UML-doc -->
	 * <p>new CompressionBuilderV1();</p>
	 * <p>new CompressionBuilderV2();</p>
	 * <p>CompressionBuilder builder;</p>
	 * <p>CompressionDirector director;</p>
	 * <p>ask user to choose compression algorithm 1 or 2</p>
	 * <p>if(choice == 1) Env.compressionType = "CompressionBuilderV1";</p>
	 * <p>if(choice == 2) Env.compressionType = "CompressionBuilderV2";</p>
	 * <p>builder = CompressionBuilder.getInstance();</p>
	 * <p>director = new CompressionDirector(builder);</p>
	 * <p>ask user to enter file name</p>
	 * <p>director.compressText(fileName);</p>
	 * <p>String compressedText = builder.getResult();</p>
	 * <p>if(choice == 1) output compressedText to "fileName.Z1"</p>
	 * <p>if(choice == 2) output compressedText to "fileName.Z2"</p>
	 * <!-- end-UML-doc -->
	 * @param args
	 * @generated "UML to Java (com.ibm.xtools.transform.uml2.java5.internal.UML2JavaTransform)"
	 */
	public static void main(String[] args) {
		new CompressionBuilderV1();
		new CompressionBuilderV2();
		CompressionBuilder builder;
		CompressionDirector director;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please choose compression algorithm 1 or 2: ");
		int choice = scan.nextInt();
		
		if(choice == 1){
			Env.compressionType = "CompressionBuilderV1";
		}
		else if(choice == 2){
			Env.compressionType = "CompressionBuilderV2";
		}
		else {
			System.out.print("Please enter a valid option");
		}
		
		builder = CompressionBuilder.getInstance();
		director = new CompressionDirector(builder);
		
		System.out.print("Please enter a file name for output: ");
		String fileName = scan.nextLine();
		fileName = scan.nextLine();
		
		director.compressText(fileName);
		String compressedText = builder.getResult();
		
		String outFileName = fileName.split("\\.")[0];
		if(choice == 1){
			try {
				PrintWriter out = new PrintWriter(outFileName + ".Z1");
				out.println(compressedText);
				System.out.println("**Saved output to " + outFileName + ".Z1**");

				out.close();
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (choice == 2){
			try {
				PrintWriter out = new PrintWriter(outFileName + ".Z2");
				out.println(compressedText);
				System.out.println("**Saved output to " + outFileName + ".Z2**");

				out.close();
			} 
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			System.out.println("Please enter a valid option");
		}
		
		scan.close();
	}
}