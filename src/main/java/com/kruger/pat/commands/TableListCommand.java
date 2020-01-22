package com.kruger.pat.commands;

import com.google.gson.annotations.SerializedName;

import java.util.HashSet;
import java.util.Set;

public class TableListCommand {

    @SerializedName("name")
    private String TableListResponseName = null;

    @SerializedName("itemCount")
    private Integer TableListResponseItemCount = null;

    @SerializedName("invNo")
    private Integer TableListResponseInvoiceNumber = null;

    @SerializedName("total")
    private String TableListResponseTotal = null;

    @SerializedName("subTotaled")
    private Integer TableListResponseTotaled = null;

    @SerializedName("staffMember")
    private Integer TableListResponseStaffMember = null;

    @SerializedName("accountNo")
    private Integer TableListResponseAccountNo = null;

    @SerializedName("orderNo")
    private Integer TableListResponseOrderNo = null;

    @SerializedName("priceLevel")
    private Integer TableListResponsePriceLevel = null;

    @SerializedName("invDescr")
    private Integer TableListResponseInvoiceDescription = null;

    @SerializedName("items")
    private Set<ItemCommand> TableListResponseItems = new HashSet<>();

    @SerializedName("payments")
    private Set<PaymentCommand> TableListResponsePayments = new HashSet<>();

    public TableListCommand() {
    }

    public String getTableListResponseName() {
        return TableListResponseName;
    }

    public void setTableListResponseName(String tableListResponseName) {
        TableListResponseName = tableListResponseName;
    }

    public Integer getTableListResponseItemCount() {
        return TableListResponseItemCount;
    }

    public void setTableListResponseItemCount(Integer tableListResponseItemCount) {
        TableListResponseItemCount = tableListResponseItemCount;
    }

    public Integer getTableListResponseInvoiceNumber() {
        return TableListResponseInvoiceNumber;
    }

    public void setTableListResponseInvoiceNumber(Integer tableListResponseInvoiceNumber) {
        TableListResponseInvoiceNumber = tableListResponseInvoiceNumber;
    }

    public String getTableListResponseTotal() {
        return TableListResponseTotal;
    }

    public void setTableListResponseTotal(String tableListResponseTotal) {
        TableListResponseTotal = tableListResponseTotal;
    }

    public Integer getTableListResponseTotaled() {
        return TableListResponseTotaled;
    }

    public void setTableListResponseTotaled(Integer tableListResponseTotaled) {
        TableListResponseTotaled = tableListResponseTotaled;
    }

    public Integer getTableListResponseStaffMember() {
        return TableListResponseStaffMember;
    }

    public void setTableListResponseStaffMember(Integer tableListResponseStaffMember) {
        TableListResponseStaffMember = tableListResponseStaffMember;
    }

    public Integer getTableListResponseAccountNo() {
        return TableListResponseAccountNo;
    }

    public void setTableListResponseAccountNo(Integer tableListResponseAccountNo) {
        TableListResponseAccountNo = tableListResponseAccountNo;
    }

    public Integer getTableListResponseOrderNo() {
        return TableListResponseOrderNo;
    }

    public void setTableListResponseOrderNo(Integer tableListResponseOrderNo) {
        TableListResponseOrderNo = tableListResponseOrderNo;
    }

    public Integer getTableListResponsePriceLevel() {
        return TableListResponsePriceLevel;
    }

    public void setTableListResponsePriceLevel(Integer tableListResponsePriceLevel) {
        TableListResponsePriceLevel = tableListResponsePriceLevel;
    }

    public Integer getTableListResponseInvoiceDescription() {
        return TableListResponseInvoiceDescription;
    }

    public void setTableListResponseInvoiceDescription(Integer tableListResponseInvoiceDescription) {
        TableListResponseInvoiceDescription = tableListResponseInvoiceDescription;
    }

    public Set<ItemCommand> getTableListResponseItems() {
        return TableListResponseItems;
    }

    public void setTableListResponseItems(Set<ItemCommand> tableListResponseItems) {
        TableListResponseItems = tableListResponseItems;
    }

    public Set<PaymentCommand> getTableListResponsePayments() {
        return TableListResponsePayments;
    }

    public void setTableListResponsePayments(Set<PaymentCommand> tableListResponsePayments) {
        TableListResponsePayments = tableListResponsePayments;
    }
}
