package se331.rest.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import se331.rest.entity.AunctionItem;
import se331.rest.repository.AunctionItemRepository;

import java.util.Optional;

@Repository
public class AunctionItemDaoImpl implements AunctionItemDao {
    @Autowired
    AunctionItemRepository aunctionitemRepository;



    @Override
    public Optional<AunctionItem> getAunctionItem(Long id) {
        return aunctionitemRepository.findById(id);
    }

    @Override
    public Page<AunctionItem> getAunctionItems(Integer pageSize, Integer page) {
        return aunctionitemRepository.findAll(PageRequest.of(page-1,pageSize));
    }


    @Override
    public Page<AunctionItem> getAunctionItems(String description, Integer value, Pageable page) {
        return aunctionitemRepository.findByDescriptionContainingOrTypeContainingOrSuccessfulBid_AmountLessThanEqual
                (description, description, value, page);
    }

    @Override
    public Page<AunctionItem> getAunctionItemValue(Integer value, Pageable page) {
        return aunctionitemRepository.findBySuccessfulBid_AmountLessThanEqual(value, page);
    }
}
