
public class DBConn {

	
	private static DBConn instance;
	
	private DBConn() {
		
	}
	
	public static DBConn getInstance() {
		if(instance == null)
			instance = new DBConn();
		
		return instance;
	}

	@Override
	public String toString() {
		return "DBConn [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
}
