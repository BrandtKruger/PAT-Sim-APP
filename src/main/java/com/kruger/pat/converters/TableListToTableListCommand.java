package com.kruger.pat.converters;

import com.kruger.pat.commands.ItemCommand;
import com.kruger.pat.commands.PaymentCommand;
import com.kruger.pat.commands.TableListCommand;
import com.kruger.pat.models.TableList;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class TableListToTableListCommand implements Converter<Set<TableList>, Set<TableListCommand>> {

    @Synchronized
    @Nullable
    @Override
    public Set<TableListCommand> convert(Set<TableList> source) {

        if(source == null)
            return null;

        final Set<TableListCommand> tableListCommands = new HashSet<>();

        for (TableList entry: source) {
            final TableListCommand tableListCommand = new TableListCommand();

            tableListCommand.setTableListResponseAccountNo(entry.getTableListResponseAccountNo());
            tableListCommand.setTableListResponseInvoiceDescription(entry.getTableListResponseInvoiceDescription());
            tableListCommand.setTableListResponseInvoiceNumber(Math.toIntExact(entry.getId()));
            tableListCommand.setTableListResponseItemCount(entry.getTableListResponseItemCount());

            ItemToItemCommandConverter itemToItemCommandConverter = new ItemToItemCommandConverter();
            Set<ItemCommand> itemCommandList;
            itemCommandList = itemToItemCommandConverter.convert(entry.getItems());
            tableListCommand.setTableListResponseItems(itemCommandList);

            tableListCommand.setTableListResponseName(entry.getTableListResponseName());
            tableListCommand.setTableListResponseOrderNo(entry.getTableListResponseOrderNo());

            PaymentToPaymentCommandConverter paymentToPaymentCommandConverter = new PaymentToPaymentCommandConverter();
            Set<PaymentCommand> tableListCommandList = paymentToPaymentCommandConverter.convert(entry.getPayments());
            tableListCommand.setTableListResponsePayments(tableListCommandList);

            tableListCommand.setTableListResponsePriceLevel(entry.getTableListResponsePriceLevel());
            tableListCommand.setTableListResponseStaffMember(entry.getStaffMember());
            tableListCommand.setTableListResponseTotal(entry.getTableListResponseTotal());
            tableListCommand.setTableListResponseTotaled(entry.getTableListResponseTotaled());
            tableListCommands.add(tableListCommand);
        }

        return tableListCommands;
    }

}
