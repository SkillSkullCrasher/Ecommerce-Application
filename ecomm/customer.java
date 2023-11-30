package ecomm;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class customer {
    
    product p=new product();
    // Scanner sc=new Scanner(System.in);
   private int customerId;
   private String name;
   private String email;
   private Cart cart = new Cart();
   
//    int productid=101;
//    private String productName="Shoes";
//    private double price=25000;
//    private int stockQuantity=1;
 

    // ArrayList<product> cart=new ArrayList<>();
   public void Add(int customerId,String name,String email){
        customer c=new customer();
        product p=new product();
       
        // ArrayList<product>cartList=new ArrayList<>();
        // // ArrayList<ArrayList<product>>car=new ArrayList<>();
        // ArrayList<ArrayList<product>>crrlist=cart.display();
       
        // System.out.println(cart.display());
        
        c.setcustomerId(customerId);
        c.setcustomername(name);
        c.setcustomeremail(email);
        System.out.println("Registration Successful!");
        // System.out.println();
        // ArrayList<ArrayList<product>>cari=new ArrayList<>();
        // ArrayList<product>cv=new ArrayList<>();
        //   p.add(1,"shoes",25000,900);
        // // //  cv.add(p);
        // // //  cari.add(cv);
        //  cart.AddProducts(p);

    //    cart.AddProducts(cv);
    //    cart.display();
    //    System.out.println("Product added successfully");

    //     System.out.println();
    //      System.out.println("Cart");
      
    //    ArrayList<Cart>products=Cart.display();
    //    for(product i:products){
    //     System.out.println(i.getProductId()+" " + i.getProductName()+" "+i.getProductprice()+" "+i.getProductstockQuantity());
    //      System.out.println();
    //     // System.out.println(i.getProductName());
        // System.out.println(i.getProductprice());
        // System.out.println(i.getProductstockQuantity());
        
       }
        // c.setcustomerId(customerId);
        
//    }
   public void display(Cart cart){
    ArrayList<ArrayList<product>>car=cart.display();
    System.out.println();
    
    // for(ArrayList<product>i :car){
        
    // }
    if(car.isEmpty()){
        System.out.println("Your Cart is Empty---------");
    }
    
    else{
        
        for(ArrayList<product>i:car){
            for(product p:i){
                if(p.getProductstockQuantity()==0){
                    System.out.println("----------------CART-------------");
                    System.out.println("Your Cart is Empty!");break;
                }else{
                     System.out.println("----------------CART-------------");
                System.out.println(p.getProductId()+" "+ p.getProductName()+" "+ p.getProductprice()+" "+p.getProductstockQuantity());
            }}
        }
    }
    System.out.println();
    
   }
   public int getcustomerId(){
    return customerId;
   }
    public String getcustomername(){
    return name;
   }public String getcustomeremail(){
    return email;
   }
//    public void getproducts(){
//     System.out.println(productid);
//     System.out.println(productName);
//     System.out.println(price);
//     System.out.println(stockQuantity);
    
//    }
   
   
   public void setcustomerId(int customerId){
    this.customerId=customerId;
   }public void setcustomername(String name){
    this.name=name;
   }
   public void setcustomeremail(String email){
    this.email=email;
   }
   public Cart getCart(){
    return cart;
   }

  
}
