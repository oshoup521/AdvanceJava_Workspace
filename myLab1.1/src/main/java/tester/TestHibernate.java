package tester;

import org.hibernate.SessionFactory;
import static utils.HibernateUtils.getFactory;

public class TestHibernate {

	public static void main(String[] args) {

		try(SessionFactory sf = getFactory()){
			System.out.println("Hibernate started");
		}catch(Exception e) {
			
		}
	}

}
