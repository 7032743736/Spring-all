package spr.app.application;
     
public class BeanClass {
	private int num1;
	private int num2;
	//setters,getters,constructor, parameterized constructor
	
	// Default constructor
	public BeanClass() {}
	
	public BeanClass(int num1,int num2) {
		this.num1=num1;
		this.num2=num2;
	}
	
	public void setNum1(int num1) {
		this.num1=num1;
	}
	public int getNum1() {
		return this.num1;
	}
	public void setNum2(int num2) {
		this.num2=num2;
	}
	public int getNum2() {
		return this.num2;
	}
         public void printadd() {
        	 int add=num1+num2;
        	 System.out.println("addition of two numbers: "+add);
         }
         
}
