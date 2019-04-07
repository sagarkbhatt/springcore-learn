package com.sagar.spring.ref;

public class Scores {

    private double maths;

    private double chem;

    private double phy;

    public double getPhy() {
        return phy;
    }

    public void setPhy(double phy) {
        this.phy = phy;
    }

    public double getChem() {
        return chem;
    }

    public void setChem(double chem) {
        this.chem = chem;
    }

    public double getMaths() {
        return maths;
    }

    public void setMaths(double maths) {
        this.maths = maths;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "maths=" + maths +
                ", chem=" + chem +
                ", phy=" + phy +
                '}';
    }
}
