package se331.rest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.entity.AunctionItem;

import java.util.Optional;

@Service
public interface AunctionItemService{
    Page<AunctionItem> getAuctionItems(Integer pageSize, Integer page);

    Optional<AunctionItem> getAunctionItem(Long id);

    Page<AunctionItem> getAuctionItems(String description, Integer value, Pageable pageable);

    Page<AunctionItem> getAunctionItemValue(Integer value, Pageable pageable);
}
