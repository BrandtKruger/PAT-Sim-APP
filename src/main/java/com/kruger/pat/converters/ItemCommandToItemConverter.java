package com.kruger.pat.converters;

import com.kruger.pat.commands.ItemCommand;
import com.kruger.pat.models.Item;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.Set;

public class ItemCommandToItemConverter implements Converter<Set<ItemCommand>, Set<Item>> {

    @Synchronized
    @Nullable
    @Override
    public Set<Item> convert(Set<ItemCommand> source) {

        if (source == null)
            return null;

        Set<Item> items = new HashSet<>();

        for (ItemCommand itemCommand: source) {

            Item item = new Item();

            item.setItemsQty(itemCommand.getItemsQty());
            item.setItemsName(itemCommand.getItemsName());
            item.setItemsLineTotal(itemCommand.getItemsLineTotal());
            item.setItemsSeatNo(itemCommand.getItemsSeatNo());
            items.add(item);
        }

        return items;

    }
}
