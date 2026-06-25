import java.util.*;

public class BillService {
    private Map<String, Customer> customers;
    private List<Service> availableServices;

    public BillService(Map<String, Customer> customers, List<Service> availableServices) {
        this.customers = new HashMap<>();
        this.availableServices = new ArrayList<>();
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
        Scanner sc = new Scanner(System.in);
        Customer customer = customers.get(carNumber);
        Invoice invoice = new Invoice(customer);

        System.out.println("Available Car Services-------");

        for(int i = 0; i < availableServices.size(); i++)
        {
            System.out.println((i+1)+" "+ availableServices.get(i).getServiceType()+" "+ availableServices.get(i).getServiceCost());
        }

        while(true)
        {
            System.out.println("Enter the Service you want or enter -1 to exit");
            int choice = sc.nextInt();
            if(choice == -1)
            {
                break;
            }
            if(choice > -1 && choice <= availableServices.size())
            {
                invoice.addService(availableServices.get(choice));
                System.out.println("service done...");
            }
            else{
                System.out.println("Invalid choice of service");
            }
        }
        invoice.printInvoice();
    }
}
