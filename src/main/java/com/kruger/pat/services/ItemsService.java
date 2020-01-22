package com.kruger.pat.services;

import com.kruger.pat.models.Item;
import com.kruger.pat.repositories.ItemRepository;

import java.util.Set;

public class ItemsService implements ItemInterface {

    ItemRepository itemRepository;

    public ItemsService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void saveItems(Set<Item> items) {

    }
}
