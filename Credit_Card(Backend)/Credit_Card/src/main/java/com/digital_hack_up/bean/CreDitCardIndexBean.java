package com.digital_hack_up.bean;



import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;



@Document(indexName="pranav",type="creditcard",shards=2)
public class CreDitCardIndexBean {

	@Id
	private Integer id;
	private String name;
	private String limit_BAL;
	private String sex;
	private String education;
	private String marriage;
	private String age;	
	private String pay_0;
	private String pay_2;
	private String pay_3;
	private String pay_4;
	private String pay_5;
	private String pay_6;
	private String bill_AMT1;	
	private String bill_AMT2;
	private String bill_AMT3;
	private String bill_AMT4;
	private String bill_AMT5;
	private String bill_AMT6;
	private String pay_AMT1	;
	private String pay_AMT2;
	private String pay_AMT3;
	private String pay_AMT4;
	private String pay_AMT5;
	private String pay_AMT6;
	private String defaultPayment;
	
	public CreDitCardIndexBean() {
		
	}
	
	public CreDitCardIndexBean(Integer id, String name, String limit_BAL, String sex, String education, String marriage,
			String age, String pay_0, String pay_2, String pay_3, String pay_4, String pay_5, String pay_6,
			String bill_AMT1, String bill_AMT2, String bill_AMT3, String bill_AMT4, String bill_AMT5, String bill_AMT6,
			String pay_AMT1, String pay_AMT2, String pay_AMT3, String pay_AMT4, String pay_AMT5, String pay_AMT6,
			String defaultPayment) {
	
		this.id = id;
		this.name = name;
		this.limit_BAL = limit_BAL;
		this.sex = sex;
		this.education = education;
		this.marriage = marriage;
		this.age = age;
		this.pay_0 = pay_0;
		this.pay_2 = pay_2;
		this.pay_3 = pay_3;
		this.pay_4 = pay_4;
		this.pay_5 = pay_5;
		this.pay_6 = pay_6;
		this.bill_AMT1 = bill_AMT1;
		this.bill_AMT2 = bill_AMT2;
		this.bill_AMT3 = bill_AMT3;
		this.bill_AMT4 = bill_AMT4;
		this.bill_AMT5 = bill_AMT5;
		this.bill_AMT6 = bill_AMT6;
		this.pay_AMT1 = pay_AMT1;
		this.pay_AMT2 = pay_AMT2;
		this.pay_AMT3 = pay_AMT3;
		this.pay_AMT4 = pay_AMT4;
		this.pay_AMT5 = pay_AMT5;
		this.pay_AMT6 = pay_AMT6;
		this.defaultPayment = defaultPayment;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLimit_BAL() {
		return limit_BAL;
	}
	public void setLimit_BAL(String limit_BAL) {
		this.limit_BAL = limit_BAL;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getMarriage() {
		return marriage;
	}
	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPay_0() {
		return pay_0;
	}
	public void setPay_0(String pay_0) {
		this.pay_0 = pay_0;
	}
	public String getPay_2() {
		return pay_2;
	}
	public void setPay_2(String pay_2) {
		this.pay_2 = pay_2;
	}
	public String getPay_3() {
		return pay_3;
	}
	public void setPay_3(String pay_3) {
		this.pay_3 = pay_3;
	}
	public String getPay_4() {
		return pay_4;
	}
	public void setPay_4(String pay_4) {
		this.pay_4 = pay_4;
	}
	public String getPay_5() {
		return pay_5;
	}
	public void setPay_5(String pay_5) {
		this.pay_5 = pay_5;
	}
	public String getPay_6() {
		return pay_6;
	}
	public void setPay_6(String pay_6) {
		this.pay_6 = pay_6;
	}
	public String getBill_AMT1() {
		return bill_AMT1;
	}
	public void setBill_AMT1(String bill_AMT1) {
		this.bill_AMT1 = bill_AMT1;
	}
	public String getBill_AMT2() {
		return bill_AMT2;
	}
	public void setBill_AMT2(String bill_AMT2) {
		this.bill_AMT2 = bill_AMT2;
	}
	public String getBill_AMT3() {
		return bill_AMT3;
	}
	public void setBill_AMT3(String bill_AMT3) {
		this.bill_AMT3 = bill_AMT3;
	}
	public String getBill_AMT4() {
		return bill_AMT4;
	}
	public void setBill_AMT4(String bill_AMT4) {
		this.bill_AMT4 = bill_AMT4;
	}
	public String getBill_AMT5() {
		return bill_AMT5;
	}
	public void setBill_AMT5(String bill_AMT5) {
		this.bill_AMT5 = bill_AMT5;
	}
	public String getBill_AMT6() {
		return bill_AMT6;
	}
	public void setBill_AMT6(String bill_AMT6) {
		this.bill_AMT6 = bill_AMT6;
	}
	public String getPay_AMT1() {
		return pay_AMT1;
	}
	public void setPay_AMT1(String pay_AMT1) {
		this.pay_AMT1 = pay_AMT1;
	}
	public String getPay_AMT2() {
		return pay_AMT2;
	}
	public void setPay_AMT2(String pay_AMT2) {
		this.pay_AMT2 = pay_AMT2;
	}
	public String getPay_AMT3() {
		return pay_AMT3;
	}
	public void setPay_AMT3(String pay_AMT3) {
		this.pay_AMT3 = pay_AMT3;
	}
	public String getPay_AMT4() {
		return pay_AMT4;
	}
	public void setPay_AMT4(String pay_AMT4) {
		this.pay_AMT4 = pay_AMT4;
	}
	public String getPay_AMT5() {
		return pay_AMT5;
	}
	public void setPay_AMT5(String pay_AMT5) {
		this.pay_AMT5 = pay_AMT5;
	}
	public String getPay_AMT6() {
		return pay_AMT6;
	}
	public void setPay_AMT6(String pay_AMT6) {
		this.pay_AMT6 = pay_AMT6;
	}
	public String getDefaultPayment() {
		return defaultPayment;
	}
	public void setDefaultPayment(String defaultPayment) {
		this.defaultPayment = defaultPayment;
	}
	
	
	
}
