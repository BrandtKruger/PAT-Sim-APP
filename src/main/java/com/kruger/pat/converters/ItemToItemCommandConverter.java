package com.kruger.pat.converters;

import com.kruger.pat.commands.ItemCommand;
import com.kruger.pat.models.Item;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.Set;

public class ItemToItemCommandConverter implements Converter<Set<Item>, Set<ItemCommand>> {

    @Synchronized
    @Nullable
    @Override
    public Set<ItemCommand> convert(Set<Item> items) {

        if (items == null)
            return null;

        Set<ItemCommand> itemCommandList = new HashSet<>();

        for (Item item: items) {
            ItemCommand itemCommand = new ItemCommand();

            itemCommand.setItemsLineTotal(item.getItemsLineTotal());
            itemCommand.setItemsName(item.getItemsName());
            itemCommand.setItemsSeatNo(item.getItemsSeatNo());
            itemCommand.setItemsQty(item.getItemsQty());
            itemCommandList.add(itemCommand);
        }

        return itemCommandList;
    }
}
