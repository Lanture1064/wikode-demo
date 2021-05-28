package com.wikode.data.demo.mapper;

import com.wikode.data.demo.entity.EntryVersion;
import org.springframework.data.repository.CrudRepository;

public interface EntryVersionRepository extends CrudRepository<EntryVersion, Integer> {
    Integer findEntryVersionByBelongedEntryID(Integer entryID);
}
