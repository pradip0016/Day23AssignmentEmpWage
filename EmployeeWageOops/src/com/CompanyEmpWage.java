package com;

import java.util.ArrayList;

public class CompanyEmpWage {

	public String company;
	public int empratePerHr;
	public int numberofWorkingDay;
	public int max_Hr_per_Month;
	public int TotalEmpwage;
	ArrayList<Integer> dailywage = new ArrayList<Integer>();

	public CompanyEmpWage(String company, int empratePerHr, int numberofWorkingDay, int max_Hr_per_Month) {
		super();
		this.company = company;
		this.empratePerHr = empratePerHr;
		this.numberofWorkingDay = numberofWorkingDay;
		this.max_Hr_per_Month = max_Hr_per_Month;
	}

	public void setTotalEmpwage(int totalEmpwage) {
		TotalEmpwage = totalEmpwage;
	}

	public String toString() {
		return "Total Employee wage for : " + company + " is " + TotalEmpwage;
	}

}
