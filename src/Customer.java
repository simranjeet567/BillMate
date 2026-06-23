public class Customer {
    private String customerName;
    private String customerContactNumber;
    private Car carObj;

    public Customer(String customerName, String customerContactNumber, Car carObj) {
        this.customerName = customerName;
        this.customerContactNumber = customerContactNumber;
        this.carObj = carObj;
    }

    public String getName() {
        return customerName;
    }

    public String getContactNumber() {
        return customerContactNumber;
    }

    public Car getCarObj() {
        return carObj;
    }
}
