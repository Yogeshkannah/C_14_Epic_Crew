package com.yogeshkannah.CertificateService;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="certi")
public class Certificate {

	@Id
	@Column(name = "cid")
	private int certificate_id;

	@Column(name = "name")
	private String Student_name;

	@Column(name = "address")
	private String Student_address;

	public int getCid() {
		return certificate_id;
	}

	public void setCid(int certificate_id) {
		this.certificate_id = certificate_id;
	}

	public String getName() {
		return Student_name;
	}

	public void setName(String Student_name) {
		this.Student_name = Student_name;
	}

	public String getAddress() {
		return Student_address;
	}

	public void setAddress(String Student_address) {
		this.Student_address = Student_address;
	}

	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Certificate(int certificate_id, String Student_name, String Student_address) {
		super();
		this.certificate_id = certificate_id;
		this.Student_name = Student_name;
		this.Student_address = Student_address;
	}

	@Override
	public String toString() {
		return "Certificate [certificate_id=" + certificate_id + ", Student_name=" + Student_name + ", Student_address=" + Student_address + "]";
	}

}
