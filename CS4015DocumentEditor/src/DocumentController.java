
public class DocumentController {
	private Director director;
	
	public void documentText(String s){
		director = new Director();
		System.out.println(director.buildDocument(s));
	}
}
