package org.app.selfservice;


public class Bonjour {

	public static void main(String[] args) {
		//affichage message
		System.out.println("Bonjour tout le monde");
		int a=10, b=15;
		System.out.println(a+" + "+b+" = "+getSumAB(a, b));
		
	}
	//ajout fct sum
	public static int getSumAB(int a, int b){
		return a+b;
	}

}
