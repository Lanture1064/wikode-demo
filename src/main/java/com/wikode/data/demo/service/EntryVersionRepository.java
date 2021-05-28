package com.wikode.data.demo.service;

import com.wikode.data.demo.entity.EntryVersion;
import org.springframework.data.repository.CrudRepository;

public interface EntryVersionRepository extends CrudRepository<EntryVersion, Integer> {
    String findEntryVersionByBelongedEntryID();
}
