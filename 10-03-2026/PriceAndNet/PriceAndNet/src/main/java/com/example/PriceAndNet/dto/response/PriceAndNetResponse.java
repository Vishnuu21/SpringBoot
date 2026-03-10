package com.example.PriceAndNet.dto.response;

public class PriceAndNetResponse {
    private String customerName;
    private int id, total;
    private double netTotal, gst,gstAmount;

    public PriceAndNetResponse(String customerName, int id, int total,  double gst, double gstAmount,double netTotal) {
        this.customerName = customerName;
        this.id = id;
        this.total = total;
        this.gst = gst;
        this.netTotal = netTotal;
        this.gstAmount=gstAmount;

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double getGst() {
        return gst;
    }

    public void setGst(double gst) {
        this.gst = gst;
    }

    public double getNetTotal() {
        return netTotal;
    }

    public void setNetTotal(double netTotal) {
        this.netTotal = netTotal;
    }

    public double getGstAmount() {
        return gstAmount;
    }

    public void setGstAmount(double gstAmount) {
        this.gstAmount = gstAmount;
    }

}
