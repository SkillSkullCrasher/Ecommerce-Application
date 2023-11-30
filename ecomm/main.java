package ecomm;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

            product p=new product();
        Cart cart=new Cart();
        customer c=new customer();
       static Scanner sc=new Scanner(System.in);
       static int ch;
       static boolean flag;
    
       public void   func(int ch){
        ArrayList<ArrayList<product>>cartList=new ArrayList<>();
        switch (ch) {
            case 1:
                System.out.println("-----------------------HOME---------------------");
    
    //            System.out.println("List of Products: ");
                System.out.print("Enter product-id:");
                int pid=sc.nextInt();
                // System.out.println();
                 System.out.print("Enter product-name:");
                String pname=sc.next();
                //  System.out.println();
                 System.out.print("Enter product-price:");
                double pri=sc.nextDouble();
                //  System.out.println();
                 System.out.print("Enter product-quantity:");
                int st=sc.nextInt();
                 System.out.println();
                //  product p=new product();
                p.add(pid,pname,pri,st);
                // p.add(2,"cloths",5000,400);
                // p.add(8,"accessories",35000,140);
                // p.add(9,"beauty",55000,120);
                System.out.println("-------------Added Successfully!-------------");
                System.out.println();
                 System.out.print("Do you wanna continue true/false :");
                flag=sc.nextBoolean();
                
                break;
            case 2:
                    //  p=new product();
                  ArrayList<product>pArrayList= p.display();
                //   System.out.println("hello");
                if(pArrayList.isEmpty()){
                    System.out.println("-----------------Nothing Available----------------");
                    
                }
                    for(product i:pArrayList){
                        System.out.println(i.getProductId() + "  "+i.getProductName()+ "  "+i.getProductprice()+" "+i.getProductstockQuantity());
                        // System.out.println(i.getProductName());
                        // System.out.println(i.getProductprice());
                        // System.out.println(i.getProductstockQuantity());
                         
                        
                    }
                    System.out.println();
                    System.out.print("Do you wanna continue true/false :");
                        flag=sc.nextBoolean();
                    break;
            case 3:
                    System.out.println();
                    System.out.println("CUSTOMER DETAILS PLEASE");
                    System.out.println();
                    System.out.print("Enter customer-id: ");
                       
                    int cid=sc.nextInt();
                    // System.out.println();
                    System.out.print("Enter customer-name: ");
                    String cname=sc.next();
                    // System.out.println();
                    System.out.print("Enter customer-email: ");
                    String email=sc.next();
                    System.out.println();
                    // System.out.print("Enter customer-id: ");
                    c.Add(cid, cname, email);
                     System.out.print("Do you wanna continue true/false :");
                    flag=sc.nextBoolean();
                    break;
            case 4:
                    System.out.println();
                    System.out.println("ADD To Cart");
                    // System.out.println();
                    System.out.print("Please enter product-id: ");
                    int pi=sc.nextInt();
                    //   p=new product();
                    cart.AddProducts(p.getProductById(pi));
                     System.out.print("Do you wanna continue true/false :");
                    flag=sc.nextBoolean();
                        // c.display(cart);
                    break;
            case 5:
                     System.out.println("-------------------------------------------Remove From Cart-----------------------------------");
                     cartList=cart.display();
                     if(cartList.isEmpty()){
                        System.out.println("-------------------Oops! Nothing in Cart------------");
                     }else{
                      System.out.print("Please enter product-id: ");

                     int i=sc.nextInt();
                     ArrayList<ArrayList<product>>removepr=new ArrayList<>();
                    for(ArrayList<product> k:cartList){
                        for(product l:k){
                            if(l.getProductId()==i){
                                removepr.add(k);
                                break;
                            }
                            else{
                                    System.out.println("-------------------------------------------Inavlid Id-----------------------------------");
                                    
                                }
                        }
                    }
                     cartList.removeAll(removepr);
                    }
                    
                     System.out.println();
                     System.out.print("Do you wanna continue true/false :");
                    flag=sc.nextBoolean();
                     break;
            case 6: 
                         c.display(cart);
                         if(cartList.isEmpty()){
                            System.out.println("---------------------------- Ooops Nothing in Cart-----------------------");
                         }
                     
                    
                     System.out.print("Do you wanna continue true/false :");
                    flag=sc.nextBoolean();
                    break;
            case 7:
                    //   p=new product();
                     System.out.println("------------------PROCEED TO ORDER----------------");
                    order o=new order(cart,p);
                    //    System.out.println();
                    System.out.println("Total Bill-: "+ o.bill());
                    System.out.println("Your Order Details:");
                    c.display(cart);
                    System.out.println();
                     System.out.print("Do you wanna continue true/false :");
                    flag=sc.nextBoolean();
                    break;
            case 8:break;
            // case 6:
             default:
                    System.out.println("Atleast choose right option!");
                    System.out.print("Do you wanna continue true/false :");
                    flag=sc.nextBoolean();
                break;
        }
        
           while(flag==true){
             
             System.out.println("1.Add Products");
        System.out.println("2.Available Products");
        System.out.println("3.Customer Registration");
        System.out.println("4.Add To Cart");
        System.out.println("5.Remove From Cart");
        
        System.out.println("6.My Cart");
        
        System.out.println("7.ORDER");
        System.out.println("8.Exit");
         System.out.print("Please Select! ");
        //  main m=new main();
       
        // boolean flag;
        
         ch=sc.nextInt();
        //  main m=new main();
         func( ch);
       
        }
        if(flag==false){
            System.out.println("EXIT SUCCESSFULLY");
            
        }
    }
     
    public static void main(String[] args) {

        System.out.println("1.Add Products");
        System.out.println("2.Available Products");
        System.out.println("3.Customer Registration");
        System.out.println("4.Add To Cart");
       System.out.println("5.Remove From Cart");
        
        System.out.println("6.My Cart");
        
        System.out.println("7.ORDER");
        System.out.println("8.Exit");
        //  System.out.print("Please Select! ");
        
        
        boolean flag=false;
        System.out.println();
         System.out.print("Please Select! ");
         ch=sc.nextInt();
        main m=new main();
        m.func(ch);
        // while(ch!=6){
        //         if(ch==1){

        //         }
        //         if(ch==1){

        //         }
        //         if(ch==1){

        //         }
        //         if(ch==1){

        //         }
                
        // }
       

        
    //     System.out.println("-----------------------HOME---------------------");
    
    //     System.out.println("List of Products: ");
    //     product p=new product();

    //     p.add(1,"shoes",25000,900);
    //     p.add(2,"cloths",5000,400);
    //     p.add(8,"accessories",35000,140);
    //     p.add(9,"beauty",55000,120);
    //    ArrayList<product>products=p.display();
    //    ArrayList<product>pArrayList= p.display();
    // for(product i:pArrayList){
    //     System.out.println(i.getProductId() + "  "+i.getProductName()+ "  "+i.getProductprice()+" "+i.getProductstockQuantity());
    //     // System.out.println(i.getProductName());
    //     // System.out.println(i.getProductprice());
    //     // System.out.println(i.getProductstockQuantity());
        
        
    // }
    //    System.out.println();
    //    System.out.println("CUSTOMER DETAILS PLEASE");
    //    customer c=new customer();
    //    int cid=sc.nextInt();
    //    String cname=sc.nextLine();
    //    String email=sc.nextLine();
    //    c.Add(cid, cname, email);
    //    Cart cart=new Cart();
    //    p.add(1,"shoes",25000,900);
        //  cv.add(p);
        //  cari.add(cv);
        //  cart.AddProducts(p);
    //    cart.AddProducts(p.getProductId(2));
    // System.out.println();
    //  System.out.println("$$$$$$$$$$   ADDED $$$$$$$$$$");
     
    //  System.out.print("Please enter product-id: ");
    //  int pid=sc.nextInt();
    //    cart.AddProducts(p.getProductById(pid));
    //     c.display(cart);
    // //     System.out.println("$$$$$$$$$$   REMOVE $$$$$$$$$$");
    //    cart.DeleteProducts(p.getProductById(2));
    //    c.display(cart);

    //  System.out.println("------------------PROCEED TO ORDER----------------");
    //    order o=new order(cart,p);
    // //    System.out.println();
    //   System.out.println("Proceed To Payment: "+ o.bill());
    //   c.display(cart);
    //   System.out.println();
    //    System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");

    //   System.out.println();

//        System.out.println("List of Products: ");
//        System.out.println("--------------Products--------------------");
//     //    for(product i:products){
        
//     //     System.out.println(i.getProductId()+" " + i.getProductName()+" "+i.getProductprice()+" "+i.getProductstockQuantity());
//     //     // System.out.println(i.getProductName());
//     //     // System.out.println(i.getProductprice());
//     //     // System.out.println(i.getProductstockQuantity());
        
// //     //    }
// product p=new product();
//    ArrayList<product>pArrayList= p.display();
//     for(product i:pArrayList){
//         System.out.println(i.getProductId() + "  "+i.getProductName()+ "  "+i.getProductprice()+" "+i.getProductstockQuantity());
//         // System.out.println(i.getProductName());
//         // System.out.println(i.getProductprice());
//         // System.out.println(i.getProductstockQuantity());
        
        
//     }
//         System.out.println("------------------------------------------");

//     //    c.getCart();
        // p.display();
    }
}
