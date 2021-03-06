package com.safdar.medicento.salesappmedicento;

class OrderedMedicine {
    private String mMedicineName;
    private String mMedicineCompany;
    private int mQty;
    private float mRate;
    private float mCost;


    public OrderedMedicine(){

    }

    public OrderedMedicine(String name, String company, int qty, float rate, float cost){
        mMedicineName = name;
        mMedicineCompany = company;
        mQty = qty;
        mRate = rate;
        mCost = cost;
    }

    public String getMedicineName() {
        return mMedicineName;
    }

    public String getMedicineCompany() {
        return mMedicineCompany;
    }

    public int getQty() {
        return mQty;
    }

    public float getRate() {
        return mRate;
    }

    public float getCost(){return mCost;}

    public void setMedicineCompany(String company) {
        this.mMedicineCompany = company;
    }

    public void setMedicineName(String name) {
        this.mMedicineName = name;
    }

    public void setQty(int qty) {
        this.mQty = qty;
    }

    public void setRate(float rate) {this.mRate = rate;}

    public void setCost(float cost){
        this.mCost = cost;
    }
}
