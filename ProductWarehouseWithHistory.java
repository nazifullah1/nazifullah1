/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19168
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
  
      private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
   
       history = new ChangeHistory();
      
       addToWarehouse(initialBalance);
    }
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        history.add(getBalance());
        
        
    }
    @Override
    public double takeFromWarehouse(double amount){
        double recieved = super.takeFromWarehouse(amount);
        history.add(getBalance());
        return recieved;
    }
    public void printAnalysis(){
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history());
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
                
    }
    public String history(){
        return history.toString();
        
    }
    
    
}
