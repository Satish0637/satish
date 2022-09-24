package org.company;

public class CompanyInfo {
//method creation
	private void companyName() {
		System.out.println("sha engineering");
	}
	private void companyId() {
		System.out.println("1234565");
	}
	private void companyAddress() {
		System.out.println("Aralvaimozhi");
	}
	//main method
	public static void main(String args[]) {
		//object creation
		CompanyInfo companyDetails=new CompanyInfo();
		//method call
		companyDetails.companyName();
		companyDetails.companyId();
		companyDetails.companyAddress();
		
	}
}
