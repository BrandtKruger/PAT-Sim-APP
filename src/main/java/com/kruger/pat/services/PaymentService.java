package com.kruger.pat.services;

import com.kruger.pat.models.Payment;
import com.kruger.pat.repositories.PaymentRepository;

import java.util.Set;

public class PaymentService implements PaymentInterface {

    PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public void savePayments(Set<Payment> paymentSet) {

    }
}
