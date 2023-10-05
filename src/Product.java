public class Product {
    private int id;
    private String Name;
    private double price;
    private int quantity;
    private Date mfcdate;
    static int counter = 1;
    public Product(String Name, double price, int quantity, Date mfcdate) {
        this.id = counter++;
        this.Name = Name;
        this.price = price;
        this.quantity = quantity;
        this.mfcdate = mfcdate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return mfcdate;
    }

    public void setDate(Date mfcdate) {
        this.mfcdate = mfcdate;
    }

    public String toString(){
        String display = String.format("%d\t%-10s\t%-10f\t%-10d \t %s",id,Name,price,quantity,mfcdate);
        return display;

    }

    public Product recentProduct(Product obj1,Product obj2)
    {
        Date latest = mfcdate.Recent(obj1.mfcdate,obj2.mfcdate);
        if (latest == obj1.mfcdate)
            return obj1;
        else
            return obj2;
    }

    }

