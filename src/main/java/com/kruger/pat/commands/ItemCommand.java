package com.kruger.pat.commands;

import com.google.gson.annotations.SerializedName;

public class ItemCommand {


    @SerializedName("no")
    private Integer itemsNo;

    @SerializedName("name")
    private String itemsName = null;

    @SerializedName("qty")
    private Integer itemsQty = null;

    @SerializedName("lineTotal")
    private Double itemsLineTotal = null;

    @SerializedName("seatNo")
    private Integer itemsSeatNo = null;

    public ItemCommand() {
    }

    public Integer getItemsNo() {
        return itemsNo;
    }

    public void setItemsNo(Integer itemsNo) {
        this.itemsNo = itemsNo;
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
}
