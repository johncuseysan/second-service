package org.cusey.john.dto;

public class Purchase {
	
	public Double cost;    						//9 Length 15 Allowed values: 0-9, Format "############.##"
	public String period;						//8 YYYYMM
	public String transactionDate;				//10 YYYYMMDD
	public String startDate;					//14 YYYYMMDD

	public String productCode;					//7 Length 5 Allowed values: 0-9, A-Z,
	public String studentId;				    //1  Format UUID

	public CreditCard creditCardType;		    //11 Length  ENUM
	public String forwardTo;				    //13 Length 3 Min and max length are 3.
	public String holdDate;						//12 YYYYMMDD

	public String collegeName;				    //2 Length 15 Allowed values: 0-9, A-Z,
	public String collegeCatolog;				//4 Length 9  Allowed values: 0-9, A-Z,
	public String collegeType;					//6 Length 1  Private=P, Community=C
	
	public String method;						//3 
	public Boolean isAction;					//15
	

}
