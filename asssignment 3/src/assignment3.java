import java.util.Scanner;

public class assignment3 {

	public static void main(String[] args) {
		
						Scanner input = new Scanner (System.in);
						
						System.out.println("****************Welcome to MSZ STORE*******************");
												
						System.out.print("What is  your name: ");
						String name = input.nextLine();
						System.out.println("Name: " + name);
									
					    System.out.print("What type of phone u want to buy: ");
						String type = input.nextLine();
						System.out.println("Type: " + type);
									
						System.out.print("how much u want to buy: ");
						String HowMuch = input.nextLine();
						System.out.println("How much: " + HowMuch);
						System.out.println();
						
						System.out.println("**Phone list**");
						System.out.println("**************************");
						System.out.println("**Iphone**");
						System.out.println("Iphone 12 Pro Max");
						System.out.println("Iphone 12 Pro");
						System.out.println("Iphone 12");
						System.out.println("Iphone 12 mini");
						System.out.println("Iphone SE 2nd Gen");
						System.out.println("Iphone 11 ");
						System.out.println("Iphone 11 Pro Max");
					    System.out.println("Iphone 11 Pro");
						System.out.println("Iphone 11");
						System.out.println("Iphone XS Max");
						System.out.println("Iphone XS");
						System.out.println("Iphone XR");
						System.out.println("Iphone X");
						System.out.println("Iphone 8 Plus");
						System.out.println("Iphone 8");
						System.out.println("Iphone 7 Plus");
						System.out.println("Iphone 7");
						System.out.println("**************************");
						System.out.println("**Asus**");
						System.out.println("Asus Zenfone 2");
						System.out.println("Asus Zenfone 2 Deluxe");
						System.out.println("Asus Zenfone Go");
						System.out.println("Asus Zenfone 5");
						System.out.println("Asus Zenfone 3");
						System.out.println("Asus Zenfone 2 Laser");
						System.out.println("Asus Zenfone Max");
						System.out.println("Asus Zenfone C");
						System.out.println("Asus Zenfone ROG");
						System.out.println("Asus Zenfone 4");
						System.out.println("Asus Zenfone 6");
						System.out.println("**************************");
						System.out.println("**Vivo**");
						System.out.println("Vivo Y20A ");
						System.out.println("Vivo Y20 ");
						System.out.println("Vivo Y11S ");
						System.out.println("Vivo X60 5G ");
						System.out.println("Vivo X60 PRO 5G ");
						System.out.println("Vivo Y31S 5G ");
						System.out.println("Vivo Y52S ");
						System.out.println("Vivo Y51 ");
						System.out.println("Vivo YS7E ");
						System.out.println("Vivo Y12S ");
						System.out.println("Vivo Y3S ");
						System.out.println("**************************");
						System.out.println();
						
						int number ,price , quantity;
									
						System.out.println("Enter the number of mobile phone :");
					    quantity = input.nextInt();
						if (quantity==3) {
								    	
						double quantity1,quantity2,quantity3,total_price;
						double price1,price2,price3,discount,price_to_paid;
								    
								      
						System.out.println("Enter the price of iphone : Rm");
						 price1= input.nextInt();
									
						System.out.println("Enter the quantity of iphone :");
						 quantity1 = input.nextInt();
						 System.out.println();
									 
						System.out.println("Enter the price of asus : Rm");
						 price2= input.nextInt();
									
						System.out.println("Enter the quantity of asus :");
						 quantity2 = input.nextInt();
						 System.out.println();

						System.out.println("Enter the price of vivo : Rm");
						 price3= input.nextInt();
									
						System.out.println("Enter the quantity of vivo :");
						 quantity3 = input.nextInt();
						 System.out.println();
									 
					    System.out.println("Total price buying the phone");
						 total_price =(price1*quantity1)+(price2*quantity2)+(price3*quantity3);
						 System.out.println("Total price: "+ total_price);
						 System.out.println();
									 
						if (total_price>5000) {
						 discount = total_price*0.2;
						 }
									 
						else {
						 discount=total_price*0.1;
					     }
						 System.out.println("Discount get after buying");
						 System.out.println("Discount: "+ discount);
						 
									
						 System.out.println("Before you go back, You can get your coupon at the counter after u paided");
							String [] coupon = {"Cable phone", "Casing", "Tinted phone"};
							
							int index =0;
							while (index<coupon.length) {
								System.out.println(coupon[index]);
								index++;
							}
							System.out.println();
							System.out.println("***************THANK YOU COME TO MSZ STORE, HOPE U ENJOYED BUYING IN MSZ STORE!***************");
							System.out.println();
							
							System.out.println("Name list customers in MSZ Store");

							String [] customers = {"Name", "No.Phone","Residence"};
							
							for (int i=0; i<3;i++) {
								System.out.println(customers[i]);
							}
							System.out.println("---------------");

							int c=0;
							while(c<customers.length) {
								System.out.println(customers[c]);
								c++;
							}
							System.out.println("---------------");

							int count=0;
							do {
								System.out.println(customers[count]);
								count++;
							}while(count<3);
							
							}
						}			
									
									
									
									

								
								}
					


	


