package ecomm;

import java.util.ArrayList;
import java.util.Scanner;

public class product {
    ArrayList<product> pArrayList=new ArrayList<>();
   int productid;private String productName;private double price;private int stockQuantity;
    // product p=new product();
    public void add(int productid,String productName,double price,int stockQuantity){

        product p=new product();
        p.setProductId(productid);
        p.setProductName(productName);
        p.setProductprice(price);
        p.setProductstockQuantity(stockQuantity);
        pArrayList.add(p);
        // System.out.println("done");
        // p.setProductId(productid);
        

       
    }
    
    public int getProductId(){
        return productid;
    }
    public  void setProductId(int productid){
        this.productid=productid;
    }
     public String getProductName(){
        return productName;
    }
    public  void setProductName(String productName){
        this.productName=productName;
    } 
    public double getProductprice(){
        return price;
    }
    public  void setProductprice(double price){
        this.price=price;
    }
    public int getProductstockQuantity(){
        return stockQuantity;
    }
    public  void setProductstockQuantity(int stockQuantity){
        this.stockQuantity=stockQuantity;
    }
    public product getProductById(int productid){
        product p=new product();
        for(product i:pArrayList){
        if(i.getProductId()==productid){
            // p.stockQuantity--;
            return i;
        }
    }
        return p;
    }
    public void remove(product p){
        pArrayList.remove(p);
    }
    public ArrayList<product> display(){
        ArrayList<product>prod=new ArrayList<>();
       for(product i: pArrayList){
        // System.out.println("jwfuhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+i);
        if(i.getProductstockQuantity()==0){
            // pArrayList.remove(i);
            prod.add(i);
            // System.out.println("jwfuhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh"+i);
        }
       }
       pArrayList.removeAll(prod);
      if( pArrayList.removeAll(prod) ==true && pArrayList.isEmpty()){
        System.out.println("------Removed Successfully--------------");
      }
        return pArrayList;
    }
   

    
}
/**
 * Innerproduct
 */

