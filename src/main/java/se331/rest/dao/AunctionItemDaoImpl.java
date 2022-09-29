package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.AunctionItem;
import se331.rest.entity.AunctionItemDTO;
import se331.rest.entity.Organizer;
import se331.rest.repository.AunctionItemRepository;
import se331.rest.repository.OrganizerRepository;

import java.util.Optional;

@Repository
public class AunctionItemDaoImpl implements AunctionItemDao {
    @Autowired
    AunctionItemRepository aunctionitemRepository;

    @Override
    public Page<AunctionItem> getAunctionItem(Pageable pageRequest) {
        return aunctionitemRepository.findAll(pageRequest);
    }

    @Override
    public Optional<AunctionItem> findById(Long id) {
        return aunctionitemRepository.findById(id);

    }

}
