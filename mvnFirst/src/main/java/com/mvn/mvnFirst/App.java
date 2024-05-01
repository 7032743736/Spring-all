package com.mvn.mvnFirst;


public class App 
{
    public static void main( String[] args )
    {
    	//Product p=new Product(1,"vivo t2x",15999.99,1);
    	Product p=new Product();
//        Order o=new Order(1,"clothes",p);
    	Order o=new Order();
    	  
    	o.setOrderid(1011);
    	o.setName("pksclothes");
        o.setProduct(p);
         p.setProductid(101);
         p.setPname("manu fabrics");
         p.setPrice(1200.87);
         p.setQuantity(1);
         o.print();
    }
}
