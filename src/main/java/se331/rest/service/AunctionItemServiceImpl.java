package se331.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import se331.rest.dao.AunctionItemDao;
import se331.rest.dao.OrganizerDao;
import se331.rest.entity.AunctionItem;
import se331.rest.entity.Organizer;

import java.util.List;

@Service
public class AunctionItemServiceImpl implements AunctionItemService{
    @Autowired
    AunctionItemDao aunctionItemDao;
    @Override
    public List<AunctionItem> getAllAunctionItem() {
        return aunctionItemDao.getAunctionItem(Pageable.unpaged()).getContent();
    }

    @Override
    public Page<AunctionItem> getAunctionItem(Integer page, Integer pageSize) {
        return aunctionItemDao.getAunctionItem(PageRequest.of(page,pageSize));
    }
}

