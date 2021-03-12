package by.barysau.gift_certificates.service.impl;

import by.barysau.gift_certificates.dto.TagDto;
import by.barysau.gift_certificates.service.TagService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Override
    public List<TagDto> findAll() {
        return new ArrayList<>();
    }

    @Override
    public TagDto findById(Long tagId) {
        return new TagDto();
    }

    @Override
    public TagDto create(TagDto tagDto) {
        return new TagDto();
    }

    @Override
    public TagDto update(TagDto tagDto) {
        return new TagDto();
    }

    @Override
    public Long delete(Long tagId) {
        return 1L;
    }
}
