package org.cusey.john.dto;

import java.util.ArrayList;
import java.util.List;

public class StoreResponse {
	
	public String details;		    								//5
	public int count;												//6
	public String studentId;										//4 Format UUID
	public List<ProductCategory> code = new ArrayList<>(); 			//7
	public List<Purchase> product = null;	 						//3
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public List<ProductCategory> getCode() {
		return code;
	}
	public void setCode(List<ProductCategory> code) {
		this.code = code;
	}
	public List<Purchase> getProduct() {
		return product;
	}
	public void setProduct(List<Purchase> product) {
		this.product = product;
	}
	
	@Override
	public String toString() {
		return "StoreResponse [details=" + details + ", count=" + count + ", studentId=" + studentId + ", code=" + code
				+ "]";
	}
	
	
	

	

	
	
	
	

}
