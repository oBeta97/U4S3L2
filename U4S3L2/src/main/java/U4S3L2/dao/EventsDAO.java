package U4S3L2.dao;

import U4S3L2.entities.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventsDAO {

    private final EntityManager entityManager;

    public EventsDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Event event){

        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(event);

        transaction.commit();

        System.out.println("Evento " + event.getTitle() + " inserito con successo!");

    }

    public Event getEventById (long id) throws Exception {

        Event found = entityManager.find(Event.class, id);
        if (found == null) throw new Exception("Evento non trovato");

        return found;
    }

    public void delete (long id) throws Exception {
        Event e = this.getEventById(id);

        EntityTransaction t = entityManager.getTransaction();

        t.begin();

        entityManager.remove(e);

        t.commit();

        System.out.println("Evento " + e.getTitle() + " eliminato con successo!");

    }

}
