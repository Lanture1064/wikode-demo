package com.wikode.data.demo.mapper;

import com.wikode.data.demo.entity.Entry;
import org.springframework.data.repository.CrudRepository;

public interface EntryRepository extends CrudRepository<Entry,Integer> {

}
