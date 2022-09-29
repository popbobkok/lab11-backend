package se331.rest.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.Bid;

public interface BidService {

    Page<Bid> getBids(Integer pageSize, Integer page);

    Bid getBid(Long id);

    Page<Bid> getBids(String title, Pageable pageable);
}