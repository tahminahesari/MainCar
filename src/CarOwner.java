public class CarOwner {
    private String name;
    private String address;
    private String bsn;
    private String licence;
    // moet een list zijn denk ik of Array
    private Car car;

    public CarOwner(String name, String address, String bsn, String licence) {
        this.name = name;
        this.address = address;
        this.bsn = bsn;
        this.licence = licence;
    }

    // Waarom moet getters en setter buiten Constructor zijn?
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence;
    }

    ///Een CarOwner kan 0 of meerdere auto's hebben.
    public void setCar (Car car) {
        this.car = car;
    }
    public void addCar (Car car) {

    }
}
