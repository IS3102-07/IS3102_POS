package POS;

import PointOfSalesUI.MemberEntity;
import java.util.ArrayList;
import java.util.List;

public class Transaction {

    private List<LineItem> lineItems;
    private double totalPrice;
    private int discountRate;
    private double discountPrice;
    private double netPrice;
    private int pointsToDeduct;
    private int totalItems;
    private MemberEntity member;

    public Transaction() {
        lineItems = new ArrayList<LineItem>();
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = totalItems;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public void setNetPrice(double netPrice) {
        this.netPrice = netPrice;
    }

    public int getPointsToDeduct() {
        return pointsToDeduct;
    }

    public void setPointsToDeduct(int pointsToDeduct) {
        this.pointsToDeduct = pointsToDeduct;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public MemberEntity getMember() {
        return member;
    }

    public void setMember(MemberEntity member) {
        this.member = member;
    }

}
