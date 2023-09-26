package com.macnss.app.Models;


import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

@Data
@EqualsAndHashCode(callSuper = false)
public class Medicine {

	private String code;
	private String name;
	private String dc1;
	private double dosage;
	private String dosageUnit;
	private String form;
	private String presentation;
	private double ppv;
	private String ph;
	private double grossPrice;
	private String genericPrinciples;
	private double reimbursementRate;

	public Map<String, String> getMedicine(){

		Map<String,String> medicine = new HashMap<>();

		medicine.put("code", this.code);
		medicine.put("name", this.name);
		medicine.put("dc1", this.dc1);
		medicine.put("dosage", String.valueOf(this.dosage));
		medicine.put("dosage_unit", this.dosageUnit);
		medicine.put("form", this.form);
		medicine.put("presentation", this.presentation);
		medicine.put("ppv", String.valueOf(this.ppv));
		medicine.put("ph", this.ph);
		medicine.put("gross_price", String.valueOf(this.grossPrice));
		medicine.put("generic_principles", this.genericPrinciples);
		medicine.put("reimbursement_rate", String.valueOf(this.reimbursementRate));

		return medicine;
	}

}
