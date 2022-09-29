package se331.rest.service;

import org.springframework.data.domain.Page;
import se331.rest.entity.AunctionItem;
import se331.rest.entity.Organizer;
import se331.rest.entity.Participant;

import java.util.List;

public interface AunctionItemService{
    List<AunctionItem> getAllAunctionItem();
    Page<AunctionItem> getAunctionItem(Integer page, Integer pageSize);
}
