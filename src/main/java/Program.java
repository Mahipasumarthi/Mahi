package com.qualizeal.javaapp.mainprogram;
import com.qualizeal.javaapp.arithmetic.Addition;
import com.qualizeal.javaapp.arithmetic.Subtraction;
import com.qualizeal.javaapp.arithmetic.Multiplication;
import com.qualizeal.javaapp.arithmetic.Division;
import com.qualizeal.javaapp.ecommerce.Cart;
import com.qualizeal.javaapp.ecommerce.Order;

public class Program {
	public static void main(String[] args){
	Addition addition = new Addition();
	addition.add();
	
	Subtraction subtraction = new Subtraction();
	subtraction.subtract();
	
	Multiplication multiplication = new Multiplication();
	multiplication.multiply();
	
	Division division = new Division();
	division.divide();
	
	Cart cart = new Cart();
	cart.carting();
	
	Order order = new Order();
	order.ordering();
	
	}
}





