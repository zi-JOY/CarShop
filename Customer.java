public class Customer extends Car_Shop  {
    private String NID;
    private String name;
    private String phone;
    private String address;
    private String profession;
    private double purchasePrice;
    private String paymentMethod;
    private double price;
    public void showinfo() {
        System.out.println("\nCustomer Information:");
        System.out.println("____________________________");
    }

    public Customer(String NID,String name,String phone,String address,String profession,double purchasePrice,String paymentMethod,double price) {
        this.NID = NID;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.profession = profession;
        this.purchasePrice = purchasePrice;
        this.paymentMethod = paymentMethod;
        this.price = price;
    }
    public String getNID() {
        return NID;
    }

    public void setNID(String NID) {
        this.NID = NID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}

