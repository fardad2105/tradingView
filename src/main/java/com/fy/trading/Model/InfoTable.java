package com.fy.trading.Model;

public class InfoTable {

    private Long id;
    private String Name;
    private String value;
    private String Change;
    private String PercentChange;
    private String Open;
    private String High;
    private String Low;
    private String Prev;

    public InfoTable() {
    }

    public InfoTable(Long id, String name, String new_value, String change, String percentChange, String open, String high, String low, String prev) {
        this.id = id;
        Name = name;
        value = new_value;
        Change = change;
        PercentChange = percentChange;
        Open = open;
        High = high;
        Low = low;
        Prev = prev;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getChange() {
        return Change;
    }

    public void setChange(String change) {
        Change = change;
    }

    public String getPercentChange() {
        return PercentChange;
    }

    public void setPercentChange(String percentChange) {
        PercentChange = percentChange;
    }

    public String getOpen() {
        return Open;
    }

    public void setOpen(String open) {
        Open = open;
    }

    public String getHigh() {
        return High;
    }

    public void setHigh(String high) {
        High = high;
    }

    public String getLow() {
        return Low;
    }

    public void setLow(String low) {
        Low = low;
    }

    public String getPrev() {
        return Prev;
    }

    public void setPrev(String prev) {
        Prev = prev;
    }
}
