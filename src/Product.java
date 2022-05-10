public class Product {
    private double productCost;
    private double quantityofProduct;
    private String productName;

    //constructor method
    public Product(double productCost, double quantityofProduct, String productName){
        this.productCost = productCost;
        this.quantityofProduct = quantityofProduct;
        this.productName = productName;
    }

    //other methods
    //prints total cost when multiple products purchased
    public void totalCost(double productCost){
        System.out.println("Total cost is " + productCost);
    }
    //prints how much of one unit cost and how many times purchased
    public void printProduct(String productName, double productCost, double quantityofProduct ){
        System.out.println(productName + " costs " + productCost + " and " + quantityofProduct + " units were purchased");
    }

    public String toString(){
        return productName + " costs " + productCost + " and " + quantityofProduct + " units were purchased";
    }
}
