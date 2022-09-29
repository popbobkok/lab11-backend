package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.AunctionItem;

import java.util.Optional;

public interface AunctionItemDao {

    Page<AunctionItem> getAunctionItems(Integer pageSize, Integer page);


    Optional<AunctionItem> getAunctionItem(Long id);

    Page<AunctionItem> getAunctionItems(String description, Integer value, Pageable page);

    Page<AunctionItem> getAunctionItemValue(Integer value, Pageable page);

}

