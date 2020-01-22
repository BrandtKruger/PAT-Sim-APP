package com.kruger.pat.commands;

import com.google.gson.annotations.SerializedName;

public class PaymentCommand {

    @SerializedName("no")
    private Integer paymentsNo = null;

    @SerializedName("value")
    private Double paymentsValue = null;

    @SerializedName("name")
    private String paymentsName = null;

    @SerializedName("type")
    private Integer paymentsType = null;

    @SerializedName("special")
    private Boolean paymentsSpecial = false;

    public PaymentCommand() {
    }

    public Integer getPaymentsNo() {
        return paymentsNo;
    }

    public void setPaymentsNo(Integer paymentsNo) {
        this.paymentsNo = paymentsNo;
    }

    public Double getPaymentsValue() {
        return paymentsValue;
    }

    public void setPaymentsValue(Double paymentsValue) {
        this.paymentsValue = paymentsValue;
    }

    public String getPaymentsName() {
        return paymentsName;
    }

    public void setPaymentsName(String paymentsName) {
        this.paymentsName = paymentsName;
    }

    public Integer getPaymentsType() {
        return paymentsType;
    }

    public void setPaymentsType(Integer paymentsType) {
        this.paymentsType = paymentsType;
    }

    public Boolean getPaymentsSpecial() {
        return paymentsSpecial;
    }

    public void setPaymentsSpecial(Boolean paymentsSpecial) {
        this.paymentsSpecial = paymentsSpecial;
    }
}
