package ecomm;

import java.util.ArrayList;

public class order {
    private int TotalPayment=0;
    private int quantityOrder;
    private Cart c;
    private product pro;

    public order(Cart c,product pro){
        this.c=c;
        this.pro=pro;
        quantityOrder=0;
    }
    public int bill(){
        ArrayList<ArrayList<product>>car=c.display();
       int cartpid=0;
       int cartqnt=0;
        if(car.isEmpty()){
            System.out.println("Please select Something!");
        }else{
       for(ArrayList<product>i:car){
        for(product p: i){
            TotalPayment+=p.getProductprice();
            quantityOrder+=p.getProductstockQuantity();
            p.setProductstockQuantity(quantityOrder-c.getCartstockQuantity());
            // System.out.println("buhjhhy"+ p.getProductstockQuantity());
            // if(p.getProductstockQuantity()==0){
            //    System.out.println("buhjhhy"+ p.getProductstockQuantity());
            // }
             cartpid=p.productid;
             cartqnt=p.getProductstockQuantity();
             
            // System.out.println("quantityOrder" + pro.getProductstockQuantity());
            // quantityOrder+=p.getProductstockQuantity();
            
        //    p.setProductId(p)=;
        // p.setProductstockQuantity(TotalPayment);
       //    p.getProductstockQuantity()--;
        //    p.setProductstockQuantity(pro.getProductstockQuantity()-quantityOrder);
        //     // System.out.println(TotalPayment);
        // product remove=p.getProductById(p.getProductId());
        }
       

       }
    
    }
      
    //    for()
       ArrayList<product>products=pro.display();
       boolean flag=true;
       for(product i:products){
        if(i.getProductId()==cartpid){
            // System.out.println("getProductstockQuantity"+i.getProductstockQuantity());
            i.setProductstockQuantity(i.getProductstockQuantity()-quantityOrder);
            // if(i.getProductstockQuantity()==0){
            //     // pro.remove(i);Sysou
            //     flag=false;
            // }

        }
       }
    //    if(flag==false){
    //     System.out.println(" Sorry but your cart is empty");
    //     // c.display()=none;
    //    }
    //    pro.setProductstockQuantity(pro.getProductstockQuantity()-quantityOrder);

        return TotalPayment;

    }
    

    
}
