public class Service {
    private String serviceType;
    private double serviceCost;

    public Service(String serviceType, double serviceCost) {
        this.serviceType = serviceType;
        this.serviceCost = serviceCost;
    }

    public String getServiceType() {
        return serviceType;
    }

    public double getServiceCost() {
        return serviceCost;
    }
}
