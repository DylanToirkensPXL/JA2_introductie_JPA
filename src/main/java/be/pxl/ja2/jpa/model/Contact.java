package be.pxl.ja2.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contacts") // Deze annotatie zorgt ervoor dat er naar de table "contacts" wordt gezocht
public class Contact { // en niet de default table "contact"
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int phone;
	private String email;

	public Contact() {
	}

	public Contact(String name, int phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Contact{" +
				"id=" + id +
				", name='" + name + '\'' +
				", phone=" + phone +
				", email='" + email + '\'' +
				'}';
	}
}
