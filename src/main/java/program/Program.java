package program;

import model.Document;
import model.User;
import org.hibernate.Session;
import util.HibernateSessionFactory;

public class Program {
    public static void main(String[] args) {
        try (Session session = new HibernateSessionFactory().getSession()){
            session.beginTransaction();

            User u1 = new User("Rob", 18);
            session.save(u1);

            Document document1 = new Document();
            document1.setName("Passport");
            document1.setNumber(232323);
            u1.setDocument(document1);
            session.save(document1);


            Document document2 = new Document("Passport", 67657657);
            session.save(document2);

            User u2 = new User("Bob", 50);
            u2.setDocument(document2);
            session.save(u2);

            session.getTransaction().commit();
        }
    }
}
