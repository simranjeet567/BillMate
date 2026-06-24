import java.util.List;

public class Invoice {
    private Customer customerObj;
    private List<Service> serviceList;
    private double totalCost;

    public Invoice(Customer customerObj, List<Service> serviceList, double totalCost) {
        this.customerObj = customerObj;
        this.serviceList = serviceList;
        this.totalCost = totalCost;
    }

    public void addService(Service serviceObj)
    {
        serviceList.add(serviceObj);
        totalCost += serviceObj.getServiceCost();
    }

    public void printInvoice()
    {
        System.out.println("----------Invoice-----------");
        System.out.println("Customer Name: "+customerObj.getName()+" "+"Contact Number: "+customerObj.getContactNumber());
        System.out.println("Car Model: "+customerObj.getCarObj().getCarModel()+" "+"Car Number: "+customerObj.getCarObj().getCarNumber());
        System.out.println("Services: ");
        for(Service service: serviceList)
        {
            System.out.println(service.getServiceType()+" "+service.getServiceCost());
        }

    }
}