/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java2assignment1;

import java.util.Scanner;

/**
 *
 * @author Muthaiah
 */
public class Java2Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*GregorianCalendar date=new GregorianCalendar();
        //System.out.println(date.toZonedDateTime().toString());
        DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(formatter.format(new Date()));*/
        toCheck();
    }
    
    public static void toOrder(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Customer Name");
        String customerName=scan.nextLine();
        System.out.println("Enter the Customer Id:");
        String customerId=scan.nextLine();
        /*System.out.println("Enter the Product Id which you want to buy:");
        int productId=scan.nextInt();
        System.out.println("Enter the Quantity you need:");
        int quantity=scan.nextInt();*/
        Order order=new Order(customerId,customerName);
        //order.setListOfPurchase(productId, quantity);
        if(order.customerId.isEmpty() || order.customerName.isEmpty()){
            try {
                throw new RuntimeException("Need Customer Id or Customer Name");
            } catch (RuntimeException e) {
                System.err.println(e.getMessage());
            }
            

        } if(order.productId_quantity.isEmpty()){
            try {
                throw new RuntimeException("Purchase Order List should not be ZERO");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
    
    public static void toCheck(){
        OrderList o=new OrderList();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Customer Name");
        String customerName=scan.nextLine();
        System.out.println("Enter the Customer Id:");
        String customerId=scan.nextLine();
        Order order=new Order(customerId,customerName);
        System.out.println("Enter the Quantity");
        int quantity=scan.nextInt();
        System.out.println("Enter the Product Id:");
        int productId=scan.nextInt();
        order.setListOfPurchase(productId, quantity);
        
        System.out.println(order.toJSON());
        System.out.println(o.orderList.size());
    }
    
}
