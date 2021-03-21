
public class Client {

	public static void main(String...k){
		Factory factory=new MercedesFactory();
		System.out.println(factory.toString());
		System.out.println(factory.toString());
		Factory audiFactory=new AudiFactory();
		System.out.println(audiFactory.toString());
		System.out.println(audiFactory.toString());
		
	}
}
