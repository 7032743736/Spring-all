package com.Emp.Student;

public class Marks {
         private int telugumarks;
         private int hindimarks;
         private int englishmarks;
         private int mathsmarks;
         private int sciencemarks;
         private int socialmarks;
	public Marks(int telugumarks,int hindimarks,int englishmarks,int mathsmarks,int sciencemarks,int socialmarks) {
		this.telugumarks=telugumarks;
		this.hindimarks=hindimarks;
		this.englishmarks=englishmarks;
		this.mathsmarks=mathsmarks;
		this.sciencemarks=sciencemarks;
		this.socialmarks=socialmarks;
	}
	
	void setTelugumarks(int telugumarks) {
		this.telugumarks=telugumarks;
	}
	int getTelugumarks() {
		return this.telugumarks;
	}
	
	void setHindimarks(int hindimarks) {
		this.hindimarks=hindimarks;
	}
	int getHindimarks() {
		return this.hindimarks;
	}
	
	void setEnglishmarks(int englishmarks) {
		this.englishmarks=englishmarks;
	}
	int getEnglishmarks() {
		return this.englishmarks;
	}
	void setMathsmarks(int mathsmarks) {
		this.mathsmarks=mathsmarks;
	}
	int getMathsmarks() {
		return mathsmarks;
	}
	
	void setSciencemarks(int sciencemarks) {
		this.sciencemarks=sciencemarks;
	}
	int getSciencemarks() {
		return this.sciencemarks;
	}
	 void setSocialmarks(int socialmarks) {
		 this.socialmarks=socialmarks;
	 }
	 int getSocialmarks() {
		 return this.socialmarks;
	 }
	 
	 

}
