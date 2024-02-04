
package com_problems.overload_override;

public class Animal {
	private String name;
	Animal(){
		
	}
	Animal(String name){
		this.name=name;
	}
	
	void bark() {
		System.out.println("Sound ");
	}
	void color() {
		System.out.println("Color");
	}
	void wild() {
		System.out.println("wild");
	}
}
