import java.util.*;

public class BillService {
    private Map<String, Customer> customers;
    private List<Service> services;

    public BillService(Map<String, Customer> customers, List<Service> services) {
        this.customers = new HashMap<>();
        this.services = new ArrayList<>();
    }
}
