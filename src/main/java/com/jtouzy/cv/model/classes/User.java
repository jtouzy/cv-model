package com.jtouzy.cv.model.classes;

import java.time.LocalDate;

import com.jtouzy.dao.annotations.DAOTable;
import com.jtouzy.dao.annotations.DAOTableField;
import com.jtouzy.dao.db.DBType;

@DAOTable(tableName = "usr")
public class User {
	@DAOTableField(id = true, autoGenerated = true, name = "numusr", required = true, type = DBType.INTEGER)
	private Integer identifier;
	@DAOTableField(name = "maiusr", length = 100, type = DBType.VARCHAR)
	private String mail;
	@DAOTableField(name = "nomusr", length = 50, required = true, type = DBType.VARCHAR)
	private String name;
	@DAOTableField(name = "preusr", length = 50, required = true, type = DBType.VARCHAR)
	private String firstName;
	@DAOTableField(name = "pwdusr", length = 130, required = true, type = DBType.VARCHAR)
	private String password;
	@DAOTableField(name = "dnsusr", type = DBType.DATE)
	private LocalDate birthDate;
	@DAOTableField(name = "telusr", length = 20, type = DBType.VARCHAR)
	private String phone;
	@DAOTableField(name = "admusr", required = true, type = DBType.BOOLEAN)
	private boolean administrator;
	
	public Integer getIdentifier() {
		return identifier;
	}
	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isAdministrator() {
		return administrator;
	}
	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [identifier=");
		builder.append(identifier);
		builder.append(", mail=");
		builder.append(mail);
		builder.append(", name=");
		builder.append(name);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", password=");
		builder.append(password);
		builder.append(", birthDate=");
		builder.append(birthDate);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", administrator=");
		builder.append(administrator);
		builder.append("]");
		return builder.toString();
	}
}
