package spr.app.application2;

public class BeanClass2{
          private int number1;
          private int number2;
	public BeanClass2() {
	}
	public BeanClass2(int number1,int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	
	void setNum1(int number1) {
		this.number1=number1;
	}
	void setNum2(int number2) {
		this.number2=number2;
	}
	
	int getNum1() {
		return this.number1;
	}
	int getNum2() {
		return this.number2;
	}
    void printmul() {
    	int mul=number1*number2;
    	System.out.println(mul);
    }
}
