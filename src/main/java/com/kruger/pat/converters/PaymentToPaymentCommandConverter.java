package com.kruger.pat.converters;

import com.kruger.pat.commands.PaymentCommand;
import com.kruger.pat.models.Payment;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.Set;

public class PaymentToPaymentCommandConverter implements Converter<Set<Payment>, Set<PaymentCommand>> {

    @Synchronized
    @Nullable
    @Override
    public Set<PaymentCommand> convert(Set<Payment> source) {

        if (source == null)
            return null;

        Set<PaymentCommand> paymentCommanderList = new HashSet<>();

        for (Payment entry:source) {

            PaymentCommand payment = new PaymentCommand();

            payment.setPaymentsValue(entry.getPaymentsValue());
            payment.setPaymentsType(entry.getPaymentsType());
            payment.setPaymentsSpecial(entry.getPaymentsSpecial());
            payment.setPaymentsName(entry.getPaymentsName());
            payment.setPaymentsNo(entry.getInvoiceNo());
            paymentCommanderList.add(payment);
        }

        return paymentCommanderList;
    }
}
