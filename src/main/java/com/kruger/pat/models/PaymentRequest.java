package com.kruger.pat.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PaymentRequest {

    @SerializedName("id")
    private String PaymentRequestId = null;

    @SerializedName("invNum")
    private Integer PaymentRequestInvNum = null;

    @SerializedName("paymentAmounts")
    private List<PaymentAmounts> PaymentRequestAmounts = null;

    @SerializedName("tipAmounts")
    private List<TipAmounts> PaymentRequestTipAmounts = null;

    public PaymentRequest() {
    }

    public String getPaymentRequestId() {
        return PaymentRequestId;
    }

    public void setPaymentRequestId(String paymentRequestId) {
        PaymentRequestId = paymentRequestId;
    }

    public Integer getPaymentRequestInvNum() {
        return PaymentRequestInvNum;
    }

    public void setPaymentRequestInvNum(Integer paymentRequestInvNum) {
        PaymentRequestInvNum = paymentRequestInvNum;
    }

    public List<PaymentAmounts> getPaymentRequestAmounts() {
        return PaymentRequestAmounts;
    }

    public void setPaymentRequestAmounts(List<PaymentAmounts> paymentRequestAmounts) {
        PaymentRequestAmounts = paymentRequestAmounts;
    }

    public List<TipAmounts> getPaymentRequestTipAmounts() {
        return PaymentRequestTipAmounts;
    }

    public void setPaymentRequestTipAmounts(List<TipAmounts> paymentRequestTipAmounts) {
        PaymentRequestTipAmounts = paymentRequestTipAmounts;
    }

    @Override
    public String toString() {
        return "PaymentRequest{" +
                "PaymentRequestId='" + PaymentRequestId + '\'' +
                ", PaymentRequestInvNum=" + PaymentRequestInvNum +
                ", PaymentRequestAmounts=" + PaymentRequestAmounts +
                ", PaymentRequestTipAmounts=" + PaymentRequestTipAmounts +
                '}';
    }
}
