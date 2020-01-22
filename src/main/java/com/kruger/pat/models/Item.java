package com.kruger.pat.models;

import com.google.gson.annotations.SerializedName;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "item")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    @SerializedName("no")
    private Long id;

    @Column(name = "item_name")
    @SerializedName("name")
    private String itemsName = null;

    @Column(name = "item_qty")
    @SerializedName("qty")
    private Integer itemsQty = null;


    @SerializedName("lineTotal")
    private Double itemsLineTotal = 0.00;

    @SerializedName("seatNo")
    private Integer itemsSeatNo = 0;

    @ManyToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private Set<TableList> tableLists = new HashSet<>();


    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemsName() {
        return itemsName;
    }

    public void setItemsName(String itemsName) {
        this.itemsName = itemsName;
    }

    public Integer getItemsQty() {
        return itemsQty;
    }

    public void setItemsQty(Integer itemsQty) {
        this.itemsQty = itemsQty;
    }

    public Double getItemsLineTotal() {
        return itemsLineTotal;
    }

    public void setItemsLineTotal(Double itemsLineTotal) {
        this.itemsLineTotal = itemsLineTotal;
    }

    public Integer getItemsSeatNo() {
        return itemsSeatNo;
    }

    public void setItemsSeatNo(Integer itemsSeatNo) {
        this.itemsSeatNo = itemsSeatNo;
    }

    public Set<TableList> getTableLists() {
        return tableLists;
    }

    public void setTableLists(Set<TableList> tableLists) {
        this.tableLists = tableLists;
    }
}
