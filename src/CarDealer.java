public class CarDealer {
    private String nameDealer;
    //Mag Class CarOwner 1 of meer zelfde instance variables hebben andere class of bv deze class?
    private String address;
    private String numberOfCars;
    private String typeOfCars;
    private Car car;


    public CarDealer(String nameDealer, String address, String numberOfCars, String typeOfCars) {
        this.nameDealer = nameDealer;
        this.address = address;
        this.numberOfCars = numberOfCars;
        this.typeOfCars = typeOfCars;
    }

    public String getNameDealer() {
        return nameDealer;
    }

    public void setNameDealer(String nameDealer) {
        this.nameDealer = nameDealer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(String numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public String getTypeOfCars() {
        return typeOfCars;
    }

    public void setTypeOfCars(String typeOfCars) {
        this.typeOfCars = typeOfCars;
    }
}
