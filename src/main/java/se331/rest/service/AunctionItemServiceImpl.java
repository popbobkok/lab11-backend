package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.AunctionItemDao;
import se331.rest.entity.AunctionItem;

import java.util.List;
import java.util.Optional;

@Service
public class AunctionItemServiceImpl implements AunctionItemService{
    @Autowired
    AunctionItemDao aunctionItemDao;


    @Override
    public Page<AunctionItem> getAuctionItems(Integer pageSize, Integer page) {
        return aunctionItemDao.getAunctionItems(pageSize, page);
    }

    @Override
    public Optional<AunctionItem> getAunctionItem(Long id) {
        return aunctionItemDao.getAunctionItem(id);
    }

    @Override
    public Page<AunctionItem> getAuctionItems(String description, Integer value, Pageable pageable) {
        return aunctionItemDao.getAunctionItems(description , value ,pageable);
    }

    @Override
    public Page<AunctionItem> getAunctionItemValue(Integer value, Pageable pageable) {
        return aunctionItemDao.getAunctionItemValue(value, pageable);
    }

}

