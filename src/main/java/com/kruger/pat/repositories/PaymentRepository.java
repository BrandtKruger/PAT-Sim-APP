package com.kruger.pat.repositories;

import com.kruger.pat.models.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRepository extends CrudRepository<Payment, Long> {
}
