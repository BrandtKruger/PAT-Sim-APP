package com.kruger.pat.models;

import com.google.gson.annotations.SerializedName;
import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tablelist")
public class TableList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    @SerializedName("invNo")
    private Long id = null;

    @Column(name = "table_name")
    @SerializedName("name")
    private String TableListResponseName = null;

    @Column(name = "item_count")
    @SerializedName("itemCount")
    private Integer TableListResponseItemCount = null;

    @Column(name = "invoice_total")
    @SerializedName("total")
    private String TableListResponseTotal = null;

    @Column(name = "sub_total_of_invoice")
    @SerializedName("subTotaled")
    private Integer TableListResponseTotaled = null;

    @Column(name = "staff_member")
    @SerializedName("staffMember")
    private Integer staffMember = null;

    @Column(name = "account_number")
    @SerializedName("accountNo")
    private Integer TableListResponseAccountNo = null;

    @Column(name = "order_no")
    @SerializedName("orderNo")
    private Integer TableListResponseOrderNo = null;

    @Column(name = "price_level")
    @SerializedName("priceLevel")
    private Integer TableListResponsePriceLevel = null;

    @Column(name = "invoice_description")
    @SerializedName("invDescr")
    private Integer TableListResponseInvoiceDescription = null;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tableList_item",
            joinColumns = {
                    @JoinColumn(name = "tableList_id", referencedColumnName = "id", nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false, updatable = false)})
    @SerializedName("items")
    private Set<Item> items = new HashSet<>();


    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "tableList_payment",
            joinColumns = {
                    @JoinColumn(name = "tablelist_id", referencedColumnName = "id", nullable = false, updatable = false)
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "payment_id", referencedColumnName = "id", nullable = false, updatable = false)})
    @SerializedName("payments")
    private Set<Payment> payments = new HashSet<>();

    public TableList() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getStaffMember() {
        return staffMember;
    }

    public void setStaffMember(Integer staffMember) {
        this.staffMember = staffMember;
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

    public Set<Item> getItems() {
        return items;
    }

    public void setItems(Set<Item> items) {
        this.items = items;
    }

    public Set<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Set<Payment> payments) {
        this.payments = payments;
    }
}


