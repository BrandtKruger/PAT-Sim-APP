package com.kruger.pat.services;

import com.kruger.pat.models.Payment;

import java.util.Set;

public interface PaymentInterface {

    public void savePayments(Set<Payment> paymentSet);
}
