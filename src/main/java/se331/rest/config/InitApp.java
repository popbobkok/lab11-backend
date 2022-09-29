package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.AunctionItem;
import se331.rest.entity.AunctionItemDTO;
import se331.rest.entity.Event;
import se331.rest.entity.Organizer;
import se331.rest.repository.AunctionItemRepository;
import se331.rest.repository.EventRepository;
import se331.rest.repository.OrganizerRepository;

import javax.transaction.Transactional;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    EventRepository eventRepository;

    @Autowired
    OrganizerRepository organizerRepository;

    @Autowired
    AunctionItemRepository aunctionItemRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        Organizer org1, org2, org3;
        org1 = organizerRepository.save(Organizer.builder()
                .name("CAMT").build());
        org2 = organizerRepository.save(Organizer.builder()
                .name("CMU").build());
        org3 = organizerRepository.save(Organizer.builder()
                .name("ChiangMai").build());

        AunctionItem item1, item2, item3, item4, item5;

        item1 = aunctionItemRepository.save(AunctionItem.builder()
                .succesfulBid("10").location("Chiangmai").date("9-29-2022").build());
        item2 = aunctionItemRepository.save(AunctionItem.builder()
                .succesfulBid("100").location("Nan").date("5-31-2022").build());
        item3 = aunctionItemRepository.save(AunctionItem.builder()
                .succesfulBid("5").location("Burirum").date("9-6-2022").build());
        item4 = aunctionItemRepository.save(AunctionItem.builder()
                .succesfulBid("7").location("Nongkai").date("3-3-2022").build());
        item5 = aunctionItemRepository.save(AunctionItem.builder()
                .succesfulBid("999").location("Bankok").date("7-19-2022").build());

        Event tempEvent = null;

        tempEvent = eventRepository.save(Event.builder()
                .category("Academic")
                .title("Midterm Exam")
                .description("A time for taking the exam")
                .location("CAMT Building")
                .date("3rd Sept")
                .time("3.00-4.00 pm.")
                .petAllowed(false)
                .organizer(org1)
                .build());
        org1.getOwnEvents().add(tempEvent);
        item1.getOwnEvents().add(tempEvent);
        item2.getOwnEvents().add(tempEvent);
        item3.getOwnEvents().add(tempEvent);
        item4.getOwnEvents().add(tempEvent);
        item5.getOwnEvents().add(tempEvent);

        tempEvent = eventRepository.save(Event.builder()
                .category("Academic")
                .title("Commencement Day")
                .description("A time for celebration")
                .location("CMU Convention hall")
                .date("21th Jan")
                .time("8.00am-4.00 pm.")
                .petAllowed(false)
                .organizer(org1)
                .build());
        org1.getOwnEvents().add(tempEvent);
        item1.getOwnEvents().add(tempEvent);
        item2.getOwnEvents().add(tempEvent);
        item3.getOwnEvents().add(tempEvent);


        tempEvent = eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Loy Krathong")
                .description("A time for Krathong")
                .location("Ping River")
                .date("21th Nov")
                .time("8.00-10.00 pm.")
                .organizer(org2)
                .petAllowed(false)
                .build());
        org2.getOwnEvents().add(tempEvent);
        item3.getOwnEvents().add(tempEvent);
        item4.getOwnEvents().add(tempEvent);
        item5.getOwnEvents().add(tempEvent);

        tempEvent = eventRepository.save(Event.builder()
                .category("Cultural")
                .title("Songkran")
                .description("Let's Play Water")
                .location("Chiang Mai Moat")
                .date("13th April")
                .time("10.00am - 6.00 pm.")
                .petAllowed(true)
                .organizer(org3)
                .build());
        org3.getOwnEvents().add(tempEvent);
        item2.getOwnEvents().add(tempEvent);
        item3.getOwnEvents().add(tempEvent);
        item4.getOwnEvents().add(tempEvent);
    }
}
