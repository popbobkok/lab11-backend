package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import se331.rest.entity.AunctionItem;

import java.util.List;

@Service
public interface AunctionItemRepository extends JpaRepository<AunctionItem,Long> {
    List<AunctionItem> findAll();

    Page<AunctionItem> findByDescriptionContainingOrSuccessfulBid_AmountContaining(
            String description, Integer successfulBidValues, Pageable page);
    Page<AunctionItem> findByDescriptionContainingOrTypeContainingOrSuccessfulBid_AmountLessThanEqual(String description, String type, Integer value, Pageable pageRequest);

    Page<AunctionItem> findBySuccessfulBid_AmountLessThanEqual(Integer value, Pageable pageRequest);
}

