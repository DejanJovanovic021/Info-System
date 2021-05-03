
package perzistencija;

import java.io.Serializable;


public class Worker implements Serializable {
    
    private String name;
    private int numberOfYears;
    private String address;
    private int amountOfIncome;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAmountOfIncome() {
        return amountOfIncome;
    }

    public void setAmountOfIncome(int amountOfIncome) {
        this.amountOfIncome = amountOfIncome;
    }
    

    public Worker(int id, String name, int numberOfYears, String address, int amountOfIncome) {
        this.id = id;
        this.name = name;
        this.numberOfYears = numberOfYears;
        this.address = address;
        this.amountOfIncome = amountOfIncome;
        
    }

    public Worker() {
        
    }

    @Override
    public String toString() {
        
        return "ID: " + id + " ; " + "Name: " + name + " ; " + "Number of years: " + numberOfYears + " ; " + "Address: " + address + " ; " + "Amount of income: " + amountOfIncome;
    }
    
    
    
    
    
}
