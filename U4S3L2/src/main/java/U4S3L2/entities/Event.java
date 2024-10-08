package U4S3L2.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;
    private String description;

    @Column(name = "event_dt", nullable = false)
    private LocalDate eventDt;

    @Column(name = "event_type")
    @Enumerated(EnumType.STRING)
    private EventType eventType;

    @Column(name = "nr_max_participants", nullable = false)
    private int nrMaxParticipants;



    public Event() {}

    public Event(String title, String description, LocalDate eventDt, EventType eventType, int nrMaxParticipants) {
        this.title = title;
        this.description = description;
        this.eventDt = eventDt;
        this.eventType = eventType;
        this.nrMaxParticipants = nrMaxParticipants;
    }


    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getEventDt() {
        return eventDt;
    }

    public void setEventDt(LocalDate eventDt) {
        this.eventDt = eventDt;
    }

    public int getNrMaxParticipants() {
        return nrMaxParticipants;
    }

    public void setNrMaxParticipants(int nrMaxParticipants) {
        this.nrMaxParticipants = nrMaxParticipants;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", eventDt=" + eventDt +
                ", eventType=" + eventType +
                ", nrMaxParticipants=" + nrMaxParticipants +
                '}';
    }
}
