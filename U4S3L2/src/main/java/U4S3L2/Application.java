package U4S3L2;

import U4S3L2.dao.EventsDAO;
import U4S3L2.entities.Event;
import U4S3L2.entities.EventType;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory U4S3L2Factory = Persistence.createEntityManagerFactory("u4s3l2");

    public static void main(String[] args) {
        System.out.println("Hello World!");

        EntityManager em = U4S3L2Factory.createEntityManager();

        EventsDAO ed = new EventsDAO(em);

//        Event e = new Event("test2", "test2", LocalDate.now(), EventType.PUBLIC, 100);
//        ed.save(e);

//        try {
//        System.out.println(ed.getEventById(2));
//
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }


        try{
            ed.delete(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println("END! :(");

    }
}
