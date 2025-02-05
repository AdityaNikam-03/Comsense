package com.tbc.Encapsulation;

public class Studentt {
	private String name;
	private String PRN;
	
	private int phyMarks;
	private int chemMarks;
	private int bioMarks;
	private int mathMarks;
	private int engMarks;
	private int marMarks;
	private double percentage;
	private String result;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPRN() {
		return PRN;
	}
	public void setPRN(String pRN) {
		PRN = pRN;
	}
	public int getPhyMarks() {
		return phyMarks;
	}
	public void setPhyMarks(int phyMarks) {
		this.phyMarks = phyMarks;
	}
	public int getChemMarks() {
		return chemMarks;
	}
	public void setChemMarks(int chemMarks) {
		this.chemMarks = chemMarks;
	}
	public int getBioMarks() {
		return bioMarks;
	}
	public void setBioMarks(int bioMarks) {
		this.bioMarks = bioMarks;
	}
	public int getMathMarks() {
		return mathMarks;
	}
	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}
	public int getEngMarks() {
		return engMarks;
	}
	public void setEngMarks(int engMarks) {
		this.engMarks = engMarks;
	}
	public int getMarMarks() {
		return marMarks;
	}
	public void setMarMarks(int marMarks) {
		this.marMarks = marMarks;
	}
	
	void calculatePercentage() {
		this.percentage=(double)(((phyMarks+bioMarks+chemMarks+mathMarks+engMarks+marMarks)/600.0)*100);
	}
	
	void getResult() {
		if(this.percentage>=35.0 && this.phyMarks>=35 && this.chemMarks>=35 && this.mathMarks>=35 && this.bioMarks>=35 && this.engMarks>=35 && this.marMarks>=35) {
			this.result="Pass";
		}else {
			this.result="Fail";
		}
	}
	
	void display() {
		System.out.println();
		System.out.println("--"+"Student Result Sheet"+"---------------------");
		System.out.println("Student Name : "+this.name);
		System.out.println("Student PRN : "+this.PRN);
		System.out.println("-------------------------------------------");
		System.out.println("Subject Name"+"   "+"Obtained Marks"+"     "+"Out of");
		System.out.println();
		System.out.println("Physics"+"             "+this.phyMarks+"              "+100);
		System.out.println("Chemistry"+"           "+this.chemMarks+"              "+100);
		System.out.println("Biology"+"             "+this.bioMarks+"              "+100);
		System.out.println("Mathematics"+"         "+this.mathMarks+"              "+100);
		System.out.println("English"+"             "+this.engMarks+"              "+100);
		System.out.println("Marathi"+"             "+this.marMarks+"              "+100);
		System.out.println("-------------------------------------------");
		System.out.println("Percentage : "+this.percentage+"%");
		System.out.println("Student Result: "+this.result);
		System.out.println("-------------------------------------------");
	}
}
