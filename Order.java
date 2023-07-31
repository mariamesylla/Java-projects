import java.util.ArrayList;
import java.util.Random;

// OrderInterface isWeekend Issue
public class Order implements OrderInterface, Comparable<Order> {
	
    private int orderTime;
    
    private DAY orderDay;
    
    private int orderNo;

    private Customer customer;
        
    private ArrayList<Beverage> beverages;
        
public Order(int ot, DAY od, Customer c) {
                
customer = c;
orderNo = genOrderNum();
orderTime = ot;
orderDay = od;
beverages = new ArrayList<>();
        }

public int genOrderNum() {
	
 Random rand = new Random();
        

 int randInt = rand.nextInt(90_000-10_000)+10_000;
 
return randInt;
        }

public String toString() {

String s = "__________________________________" +orderDay.toString() +", " +orderTime +"\n" +customer.toString() +" Order Num: " +orderNo;
                
 for (Beverage b : beverages) {
 s += "\n" +b.toString();
 }
 s += "\n Order Total: " +calcOrderTotal();
 return s;
        }

public boolean isWeekend() {

 if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {

  return true;
}

 return false;
        }

public Beverage getBeverage(int itemNum) {
                return beverages.get(itemNum);
        }

public int compareTo(Order o) {

 if (orderNo == o.getOrderNo()) {

 return 0;
                }

 else if (orderNo > o.getOrderNo()) {
 return 1;
                }
 else {
 return -1;
   }
        }
public double calcOrderTotal() {
 double orderTotal = 0;
                
 for (Beverage b : beverages) {
  orderTotal += b.calcPrice();
  }
 return orderTotal;
        }

 public int findNumOfBeveType(TYPE type) {
  int count = 0;
                
 for (Beverage b : beverages) {
  if (b.getType() == type) {
  count++;
 }
  }
return count;
        }

 public int getTotalItems() {

return beverages.size();
        }
public void addNewBeverage(String name, SIZE size, int numOfFruits, boolean proteinPowder) {
     Smoothie s = new Smoothie(name, size, numOfFruits, proteinPowder);
     beverages.add(s);
}
public void addNewBeverage(String name, SIZE size) {
     boolean isWeekend = false;
     if (orderDay == DAY.SATURDAY || orderDay == DAY.SUNDAY) {
             isWeekend = true;
     }
     Alcohol a = new Alcohol(name, size, isWeekend);
     beverages.add(a);
}

public void addNewBeverage(String name, SIZE size, boolean extraShot, boolean extraSyrup) {
 Coffee c = new Coffee(name, size, extraShot, extraSyrup);
 beverages.add(c);
}

public int getOrderNo() {
return orderNo;
        }
 public int getOrderTime() {
  return orderTime;
        }
public DAY getOrderDay() {
 return orderDay;
        }
 public Customer getCustomer() {
 return new Customer(customer);
        }
public ArrayList<Beverage> getBeverages() {
 return beverages;
        }
public void setOrderDay(DAY od) {
    orderDay = od;
}
public void setCustomer(Customer c) {
    customer = c;
}      
public void setOrderNum(int on) {
orderNo = on;
        }
public void setOrderTime(int ot) {
                orderTime = ot;
        }

}