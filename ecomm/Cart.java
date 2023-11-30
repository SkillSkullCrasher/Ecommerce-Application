package ecomm;

import java.util.ArrayList;

public class Cart  {
    
    ArrayList<product>cartList;
    ArrayList<ArrayList<product>>car=new ArrayList<>();
    
    // int n=products.length;
    private int cartproductid;
    private String CartproductName;
    private int Cartprice;
    private int CartstockQuantity;
    public Cart(){
        cartList=new ArrayList<>();
        car=new ArrayList<>();
     }

    public void AddProducts(product p){
     cartList.add(p);
     car.add(cartList);
     System.out.println("----------------- Added successfully!--------------------");

        

    } 
    public void DeleteProducts(product p){
        if(!cartList.isEmpty()){
     cartList.remove(p);
     car.remove(cartList);
     
     System.out.println("REMOVE SUCCESSFULLY!");
    //  System.out.println("Product added successfully");
       }
        

    } 
    public ArrayList<ArrayList<product>> display(){
        Cart c=new Cart();
        if(cartList.isEmpty() ){
            System.out.println();
            System.out.println("------------------------- YOUR CART IS EMPTY-------------------");
            // return new ArrayList<>();
        }
        // if(c.CartstockQuantity==0){
        //     // System.out.println("jhitjijotjnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
        // }
       return car;
    }
    public void setCartstockQuantity(int CartstockQuantity){
        this.CartstockQuantity=CartstockQuantity;
    }
     public int getCartstockQuantity(){
        return CartstockQuantity;
    }
    //  public String[] AddProducts(String p){
    //     products[n-1]=p;
    //     return products;
    } 
    
// }
