package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.*;
import se331.rest.repository.AunctionItemRepository;
import se331.rest.repository.BidRepository;
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

    @Autowired
    BidRepository bidRepository;

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


        AunctionItem items = null;

        Bid bid1, bid2, bid3, bid4, bid5, bid6, bid7, bid8, bid9, bid10, bid11, bid12, bid13, bid14, bid15, success1, success2, success3;

        bid1 = bidRepository.save(Bid.builder().amount(5000).date("5-30-2020").build());
        bid2 = bidRepository.save(Bid.builder().amount(10000).date("5-30-2020").build());
        bid3 = bidRepository.save(Bid.builder().amount(15000).date("5-30-2020").build());
        bid4 = bidRepository.save(Bid.builder().amount(3000).date("6-30-2020").build());
        bid5 = bidRepository.save(Bid.builder().amount(4500).date("6-30-2020").build());
        bid6 = bidRepository.save(Bid.builder().amount(8000).date("6-30-2020").build());
        bid7 = bidRepository.save(Bid.builder().amount(2000).date("7-30-2020").build());
        bid8 = bidRepository.save(Bid.builder().amount(4500).date("7-30-2020").build());
        bid9 = bidRepository.save(Bid.builder().amount(10000).date("7-30-2020").build());
        bid10 = bidRepository.save(Bid.builder().amount(2500).date("8-30-2020").build());
        bid11 = bidRepository.save(Bid.builder().amount(7000).date("8-30-2020").build());
        bid12 = bidRepository.save(Bid.builder().amount(12000).date("8-30-2020").build());
        bid13 = bidRepository.save(Bid.builder().amount(1500).date("9-30-2020").build());
        bid14 = bidRepository.save(Bid.builder().amount(20000).date("9-30-2020").build());
        bid15 = bidRepository.save(Bid.builder().amount(30000).date("9-30-2020").build());

        success1 = bidRepository.save(Bid.builder().amount(15000).build());
        success2 = bidRepository.save(Bid.builder().amount(10000).build());
        success3 = bidRepository.save(Bid.builder().amount(30000).build());

        items = aunctionItemRepository.save(AunctionItem.builder()
                .description("Goldern Apple")
                .type("Gold")
                .successfulBid(success1)
                .build());
        items.getBid().add(bid1);
        items.getBid().add(bid2);
        items.getBid().add(bid3);

        items = aunctionItemRepository.save(AunctionItem.builder()
                .description("Goldern Apple")
                .type("Gold")
               // .successfulBid(success1)
                .build());
        items.getBid().add(bid4);
        items.getBid().add(bid5);
        items.getBid().add(bid6);

        items = aunctionItemRepository.save(AunctionItem.builder()
                .description("Goldern Apple")
                .type("Gold")
                .successfulBid(success2)
                .build());
        items.getBid().add(bid7);
        items.getBid().add(bid8);
        items.getBid().add(bid9);

        items = aunctionItemRepository.save(AunctionItem.builder()
                .description("Goldern Apple")
                .type("Gold")
                //.successfulBid(success1)
                .build());
        items.getBid().add(bid10);
        items.getBid().add(bid11);
        items.getBid().add(bid12);

        items = aunctionItemRepository.save(AunctionItem.builder()
                .description("Goldern Apple")
                .type("Gold")
                .successfulBid(success3)
                .build());
        items.getBid().add(bid13);
        items.getBid().add(bid14);
        items.getBid().add(bid15);



        /*
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
*/

        Event tempEvent = null;


        /*
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
        */

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


    }
}
