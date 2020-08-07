package com.sample.mycode;

public class methodsInAClass {

	private String name;
	private long accountNo;
	
	public String fetchName() {
		return this.name;
	}
	
	public void setName(String ipname) {
		name = ipname;
	}
	
	public long fetchAcctNo() {
		return this.accountNo;
	}
	
	public void setAcctNo(long actNo) {
		accountNo = actNo;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Details \n");
		methodsInAClass obj = new methodsInAClass();
		obj.setName("Jabeen");
		System.out.println("Print Name : "+obj.fetchName());
		
		obj.setAcctNo(987654321);
		System.out.println("Account No : "+obj.fetchAcctNo());
	}

}
