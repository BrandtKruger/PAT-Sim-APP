package com.kruger.pat.models;

import com.google.gson.annotations.SerializedName;

public class PaymentAmounts {

    @SerializedName("amount")
    private float amount;

    public PaymentAmounts() {
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "PaymentAmounts{" +
                "amount=" + amount +
                '}';
    }
}
