package se331.rest.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import se331.rest.entity.AunctionItem;

import java.util.Optional;

public interface AunctionItemDao {
    Page<AunctionItem> getAunctionItem(Pageable pageRequest);
    Optional<AunctionItem> findById(Long id);

}
