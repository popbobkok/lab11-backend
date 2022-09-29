package se331.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import se331.rest.entity.Bid;

import java.util.List;

@Service
public interface BidRepository extends JpaRepository<Bid, Long> {

}