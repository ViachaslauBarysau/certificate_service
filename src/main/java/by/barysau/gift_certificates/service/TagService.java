package by.barysau.gift_certificates.service;

import by.barysau.gift_certificates.dto.TagDto;

import java.util.List;

public interface TagService {
    List<TagDto> findAll();
    TagDto findById(Long tagId);

    TagDto create(TagDto tagDto);

    TagDto update(TagDto tagDto);

    Long delete(Long tagId);
}
