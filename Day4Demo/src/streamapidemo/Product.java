package streamapidemo;

public class Product {
    private  int productId;
    private String productName;
    private String productCatagory;
    private long cost;
    public Product(){

    }

    public Product(int productId, String productName, String productCatagory, long cost) {
        this.productId = productId;
        this.productName = productName;
        this.productCatagory = productCatagory;
        this.cost = cost;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCatagory() {
        return productCatagory;
    }

    public void setProductCatagory(String productCatagory) {
        this.productCatagory = productCatagory;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productCatagory='" + productCatagory + '\'' +
                ", cost=" + cost +
                '}';
    }
}
