
public class main {

	public static void main(String[] args) {
		
		FlyWeightFactory factory = new FlyWeightFactory();
		PrintableDigit[] pdigits = new PrintableDigit[100];
		for (int i = 0; i < 100; i++) {
		    int n = (int) (Math.random() * 9.9999);
		    PrintableDigit pd = factory.getFlyweight(n);
		    pdigits[i] = pd;
		}
		Context currentContext = new Context();
		for (int i = 0; i< 100; i++) {
		     PrintableDigit pd = pdigits[i];
		     pd.printSelf(currentContext);
		     currentContext.incIndex();
		}
	}
}
