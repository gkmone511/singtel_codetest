package com.singtel.animal.domain.model;

/**
 * This class is the modeling of the Bird
 * 
 * @author gmone
 *
 */
public class Bird extends AnimalAbstract {
	/**
	 * This function is for flying
	 * @return
	 */
	public String fly() {
		String walk = "I am flying";
		System.out.println("I am flying");
		
		return walk;
	}
	
	/**
	 * This function is for singing
	 * @return
	 */
	public String sing() {
		String sing = "I am singing";
		System.out.println(sing);
		
		return sing;
	}
}
