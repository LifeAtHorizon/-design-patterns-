package dp.creational;

/*
 * In software a class should be singleton if it should be protected from being created 
 * multiple classes
 */
class Session{
	private static Session session;
	private Session(){	
	}
	
	public static Session getInstance(){
		if(Session.session ==null){
		
		return Session.session = new Session();
		}
		else
		return Session.session; 
	}
}
public class Singletondp {

	public static void main(String[] args){
			Session se = Session.getInstance();
			System.out.println(se.hashCode());
			Session se1 = Session.getInstance();
			System.out.println(se1.hashCode());
	}
}
