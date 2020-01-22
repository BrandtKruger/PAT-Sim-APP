package com.kruger.pat.models;

import com.google.gson.annotations.SerializedName;

public class TipAmounts {

    @SerializedName("amount")
    private float tipAmount;

    public TipAmounts() {
    }

    public float getTipAmount() {
        return tipAmount;
    }

    public void setTipAmount(float tipAmount) {
        this.tipAmount = tipAmount;
    }

    @Override
    public String toString() {
        return "TipAmounts{" +
                "tipAmount=" + tipAmount +
                '}';
    }
}
