package com.kruger.pat.models;

import com.google.gson.annotations.SerializedName;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "payment")
public class Payment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    @SerializedName("no")
    private Long id = null;

    @Column(name = "invoice_no")
    private Integer invoiceNo;

    @Column(name = "payment_value")
    @SerializedName("value")
    private Double paymentsValue = null;

    @Column(name = "payment_name") // "cash or Tip
    @SerializedName("name")
    private String paymentsName = null;

    @Column(name = "payment_type") // Is set to zero at this stage
    @SerializedName("type")
    private Integer paymentsType = null;

    @Column(name = "special") // true of false
    @SerializedName("special")
    private Boolean paymentsSpecial = false;

    @ManyToMany(mappedBy = "payments", fetch = FetchType.LAZY)
    private List<TableList> tableLists = new ArrayList<>();

    public Payment() {
    }

    public Integer getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Integer invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<TableList> getTableLists() {
        return tableLists;
    }

    public void setTableLists(List<TableList> tableLists) {
        this.tableLists = tableLists;
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
