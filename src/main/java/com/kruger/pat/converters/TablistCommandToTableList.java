package com.kruger.pat.converters;

import com.kruger.pat.commands.TableListCommand;
import com.kruger.pat.models.Item;
import com.kruger.pat.models.Payment;
import com.kruger.pat.models.TableList;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Component
public class TablistCommandToTableList implements Converter<List<TableListCommand>, List<TableList>> {

    @Synchronized
    @Nullable
    @Override
    public List<TableList> convert(List<TableListCommand> source) {

        if(source == null)
            return null;


        final List<TableList> tableLists = new ArrayList<>();

        for ( TableListCommand tableListCommand:source) {

            final TableList tableList = new TableList();


            Set<Item> itemList;
            ItemCommandToItemConverter itemCommandToItemConverter = new ItemCommandToItemConverter();
            itemList = itemCommandToItemConverter.convert(tableListCommand.getTableListResponseItems());
            tableList.setItems(itemList);

            Set<Payment> paymentList;
            PaymentCommanderToPaymentConverter paymentCommanderToPaymentConverter = new PaymentCommanderToPaymentConverter();
            paymentList = paymentCommanderToPaymentConverter.convert(tableListCommand.getTableListResponsePayments());
            tableList.setPayments(paymentList);


            tableList.setTableListResponseTotaled(tableListCommand.getTableListResponseTotaled());
            tableList.setTableListResponseTotal(tableListCommand.getTableListResponseTotal());
            tableList.setTableListResponsePriceLevel(tableListCommand.getTableListResponsePriceLevel());
            tableList.setTableListResponseOrderNo(tableListCommand.getTableListResponseOrderNo());
            tableList.setTableListResponseAccountNo(tableListCommand.getTableListResponseAccountNo());
            tableList.setStaffMember(tableListCommand.getTableListResponseStaffMember());
            tableList.setTableListResponseInvoiceDescription(tableListCommand.getTableListResponseInvoiceDescription());
            tableList.setTableListResponseItemCount(tableListCommand.getTableListResponseItemCount());
            tableList.setTableListResponseName(tableListCommand.getTableListResponseName());
            tableList.setId(Long.valueOf(tableListCommand.getTableListResponseInvoiceNumber()));
            tableLists.add(tableList);
        }
        return tableLists;
    }

}
