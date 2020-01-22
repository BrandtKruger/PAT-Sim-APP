package com.kruger.pat.repositories;

import com.kruger.pat.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {

}
