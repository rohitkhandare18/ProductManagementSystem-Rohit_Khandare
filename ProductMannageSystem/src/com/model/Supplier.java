package com.model;

import java.util.Scanner;

public class Supplier implements Buyer{
	
	Supplier s = new Supplier();
 Scanner sc = new Scanner(System.in);
	
	public void AddNewProduct() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Add the product from list");
		String a = sc.next();
		 
		
		
		
		
		
	}

	
	public void ViewAllProduct() {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		 
		System.out.println("Our product are:");

		
	}

	
	public void UpdateProductDetail() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter  the name to Update of a product");
		String a = sc.next();
		
		System.out.println("ENter the price  to update of a product");
		Double a1 = sc.nextDouble();
		 
		System.out.println("ENter the category  to update  of  a product");
		String a2 = sc.next();
		 

	}

	
	public void DeleteProduct() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the product  to delete");
		String a = sc.next();
		 
	
	}

}
