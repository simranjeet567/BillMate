import java.util.*;

public class BillService {
    private Map<String, Customer> customers;
    private List<Service> services;

    public BillService(Map<String, Customer> customers, List<Service> services) {
        this.customers = new HashMap<>();
        this.services = new ArrayList<>();
    }

    public void addCustomer(String customerName, String contactNumber, String carNumber, String carModel)
    {
        Car car = new Car(carNumber, carModel);
        Customer customerobj = new Customer(customerName, contactNumber, car);
        customers.put(carNumber, customerobj);
        System.out.println("Customers detailed saved successfully....");
    }

    public void createInvoice(String carNumber)
    {
        if(!customers.containsKey(carNumber))
        {
            System.out.println("No Customer found with car number: "+carNumber);
            return;
        }
        System.out.println("Available Car Services Type-------");

        for(int i = 0; i < services.size(); i++)
        {
            System.out.println((i+1)+" "+services.get(i).getServiceType()+" "+services.get(i).getServiceCost());
        }

        while(true)
        {
            System.out.println("Enter Service Number to add");
        }



    }
}
