package com.model;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Buyer b = new Buyer();
		Product  p = new Product();
		 while (true) {
		System.out.println("Enter 1 for Add the product, Enter 2 for view product, Enter 3 for update the product, Enter 4 for  delete the product");
		int no = sc.nextInt();
		
		Switch(no){
			case 1:
				b.AddNewProduct();
				System.out.println("add a product name");
				break;
		
			
			case 2:
				b.ViewAllProduct();
				System.out.println("view all the product");
				break;
				
			case 3:
				b.UpdateProductDetail();
			
				System.out.println("update the product details");
				break;
				
				
			case 4:
				b.DeleteProduct();
				System.out.println("enter the name of product to delete");
				break;
		}
		
		 }
		 
	}
		
		
	}



