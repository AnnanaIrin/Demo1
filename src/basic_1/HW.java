package basic_1;

import java.util.Scanner;

public class HW {
	
	public static void main(String[]args) {
		
  
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Enter your Store name");
		String Storename=scan.nextLine();
		System.out.println("Store name "+Storename); 
		
		
		System.out.println("Green Apple Qty");
		int fruit1=scan.nextInt();
		System.out.println("Green Apple : "+fruit1);
		
		System.out.println("Green Apple Price");
		double GreenApplePrice=scan.nextDouble();
		double GreenApplesPrice=GreenApplePrice*fruit1;
		System.out.println("totalPrice:"+GreenApplesPrice);
		
		
		
		System.out.println("PineApple");
		int fruit2=scan.nextInt();
		System.out.println("PineApple: "+fruit2);
		
		System.out.println("PineApple Price");
		double PineApplePrice=scan.nextDouble();
		double PineApplesPrice=PineApplePrice*fruit2;
		System.out.println("totalPrice:"+ PineApplesPrice);
		
		
		
		System.out.println("Mango Qty");
		int fruit3=scan.nextInt();
		System.out.println("Mango:"+fruit3);
				
		System.out.println("Mango Price");
		double MangoPrice=scan.nextDouble();
		double MangoPrices = MangoPrice*fruit3;
		System.out.println("totalPrice:"+MangoPrice);
		
		
				
		
		System.out.println("Avocado Qty");
		int fruit4=scan.nextInt();
		System.out.println("Avocado: "+fruit4);
		
		System.out.println("Avocado Price");
		double AvocadoPrice=scan.nextDouble();
		double AvocadoPrices=AvocadoPrice*fruit4;
		System.out.println("totalPrice:"+ AvocadoPrices);
		
		float stax = .087f;
		
		System.out.println("Banana Qty");
		int fruit5=scan.nextInt();
		System.out.println("Banana: "+fruit5);
		
		System.out.println("Banana Price");
		double Bananaprice=scan.nextDouble();
		double Bananaprices= Bananaprice*fruit5;
		System.out.println("totolPrice:"+ Bananaprices);
		
		double subtotal=(GreenApplesPrice+ PineApplesPrice+MangoPrice+AvocadoPrices+Bananaprices);
		System.out.printf("SUBTOTAL:%.2f\n",subtotal);
		
		
		double totalTax=(subtotal*(stax));
		System.out.printf("Tax:%.2f\n",totalTax);
		
		double total=(subtotal+totalTax);
		System.out.printf("Total Price:%.2f\n",total);
		
		
		
		System.out.println("                       Ideal              ");
		System.out.println("                 89-30 Sutphin Blvd     ");
		System.out.println("               www.idealfoodbasket.com ");
	    System.out.println("      	              Jamica,Ny            ");
	    System.out.println(" ***************************************************************************** ");
	    
	    System.out.println("     *Item     		Qty          Price");
	    System.out.println("                                ");
	    System.out.println("     *GreenApple "+"\t"+ fruit1+ "\t\t"+   "$"+ GreenApplesPrice);
	    System.out.println("     *PineApple  "+"\t"+ fruit2+  "\t\t"+ "$"+PineApplesPrice);
	    System.out.println("     *MangoPrice "+"\t"+ fruit3+  "\t\t"+ "$"+MangoPrices);
	    System.out.println("     *AvocadoPrice "+"\t"+ fruit4+  "\t\t"+ "$"+AvocadoPrices);                                                     
	    System.out.println("     *Bananaprice "+"\t"+ fruit5+  "\t\t"+ "$"+Bananaprices); 
	     
	    System.out.printf("                          Sub Total  =  $ %.2f ",+ total);
	    System.out.println();
	    System.out.printf("                          Sales Total=  $ %.2f", totalTax);
	    System.out.println();
	    System.out.printf("                          Total      =  $ %.2f", total);
	    System.out.println();
	    
	    System.out.println("**********************Thnk You for Shopping Ideal**********************************");
         
         
         
         
         
         
 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
         
}
	
	
	
	
	
	
	
	
	
	
	

}
