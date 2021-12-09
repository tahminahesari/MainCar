public class Car {
    private String licence;
    private String brand;
    private String subtype;
    private int numberOfKmDrove;

    public Car(String licence, String brand, String subtype, int numberOfKmDrove) {
        this.licence = licence;
        this.brand = brand;
        this.subtype = subtype;
        this.numberOfKmDrove = numberOfKmDrove;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public int getNumberOfKmDrove() {
        return numberOfKmDrove;
    }

    public void setNumberOfKmDrove(int numberOfKmDrove) {
        this.numberOfKmDrove = numberOfKmDrove;
    }
}
