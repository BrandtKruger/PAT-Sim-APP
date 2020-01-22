package com.kruger.pat.converters;

import com.kruger.pat.commands.PaymentCommand;
import com.kruger.pat.models.Payment;
import lombok.Synchronized;
import org.springframework.core.convert.converter.Converter;
import org.springframework.lang.Nullable;

import java.util.HashSet;
import java.util.Set;

public class PaymentCommanderToPaymentConverter implements Converter<Set<PaymentCommand>, Set<Payment>> {

    @Synchronized
    @Nullable
    @Override
    public Set<Payment> convert(Set<PaymentCommand> source) {

        if (source == null)
            return null;

        Set<Payment> payments = new HashSet<>();

        for (PaymentCommand paymentCommander:source) {

            Payment payment = new Payment();

            payment.setPaymentsName(paymentCommander.getPaymentsName());
            payment.setPaymentsSpecial(paymentCommander.getPaymentsSpecial());
            payment.setPaymentsType(paymentCommander.getPaymentsType());
            payment.setPaymentsValue(paymentCommander.getPaymentsValue());
            payment.setInvoiceNo(paymentCommander.getPaymentsNo());
            payments.add(payment);
        }

        return payments;
    }
}
