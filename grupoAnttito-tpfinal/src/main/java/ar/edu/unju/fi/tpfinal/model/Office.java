package ar.edu.unju.fi.tpfinal.model;
/**
 * @author RCGS
 */
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import javax.validation.constraints.Size;


import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="OFFICES")
public class Office {	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "offic_officeCode")
	private Long officeCode;//varchar clave principal
	
	
	@Size(max = 50, message = " ingrese un valor inferior o igual a 50 caracteres")
	@NotBlank(message = "La casilla no debe quedar vacia")
	@Column(name = "offic_city")
	private String city;
	
	@Min(value = 1,message = "debe ingresar un valor inferior o igual a 1 carcteres" )
	@Max(value = 1000000000,message = "debe ingresar un valor inferior o igual a 50 carcteres" )
	@Column(name = "offic_phone")
	private int phone;
    
	@Size(max = 50, message = " ingrese un valor inferior o igual a 50 caracteres")
	@NotBlank(message = "La casilla no debe quedar vacia")
	@Column(name = "offic_addressLine1")
	private String addressLine1;
	

	@Size(max = 50, message = " ingrese un valor inferior o igual a 50 caracteres")
	@Column(name = "offic_addressLine2")
	private String addressLine2;
	
	@Size(max = 50, message = " ingrese un valor inferior o igual a 50 caracteres")
	@Column(name = "offic_state")
	private String state;//creo q es string
	
	@Size(max = 50, message = " ingrese un valor inferior o igual a 50 caracteres")
	@NotBlank(message = "La casilla no debe quedar vacia")
	@Column(name = "offic_country")
	private String country;

	@Size(max = 15, message = " ingrese un valor inferior o igual a 15 caracteres")
	@NotBlank(message = "La casilla no debe quedar vacia")
	@Column(name = "offic_postalCode")
	private String postalCode;

	@Size(max = 10, message = " ingrese un valor inferior o igual a 10 caracteres")
	@NotBlank(message = "La casilla no debe quedar vacia")
	@Column(name = "offic_territory")
	private String territory;
	/**
	 * Constructor de la clase OFFICE
	 */
	public Office() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Constructor de Atirbutos de la clase OFFICE
	 * @param officeCode
	 * @param city
	 * @param phone
	 * @param addressLine1
	 * @param addressLine2
	 * @param state
	 * @param country
	 * @param postalCode
	 * @param territory
	 */
	public Office(Long officeCode, String city, int phone, String addressLine1,
			String addressLine2, String state,  String country, String postalCode,
			 String territory) {
		super();
		this.officeCode = officeCode;
		this.city = city;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.state = state;
		this.country = country;
		this.postalCode = postalCode;
		this.territory = territory;
	}


	/**
	 * M??todo "getter", mostramos OfficeCode
	 * @return officeCode, de tipo Long
	 */
	public Long getOfficeCode() {
		return officeCode;
	}


	/**
	 * M??todo Setter: establecemos OfficeCode
	 * @param officeCode, carga un valor de tipo Long
	 */
	public void setOfficeCode(Long officeCode) {
		this.officeCode = officeCode;
	}
	/**
	 * M??todo "getter"
	 * @return city,mostramos un valor tipo String
	 */
	public String getCity() {
		return city;
	}
	/**
	 * M??todo Setter
	 * @param city, establecemos un valor tipo String
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * M??todo "getter"
	 * @return the phone,mostramos un valor tipo int
	 */
	public int getPhone() {
		return phone;
	}
	/**
	 * M??todo Setter
	 * @param phone, establecemos un valor tipo int
	 */
	public void setPhone(int phone) {
		this.phone = phone;
	}
	/**
	 * M??todo "getter"
	 * @return the addressLine1, mostramos un valor tipo  String
	 */
	public String getAddressLine1() {
		return addressLine1;
	}
	/**
	 * M??todo Setter
	 * @param addressLine1, establecemos un valor tipo String 
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	/**
	 * M??todo "getter"
	 * @return addressLine2, mostramos un valor tipo String
	 */
	public String getAddressLine2() {
		return addressLine2;
	}
	/**
	 * M??todo Setter
	 * @param addressLine2,establecemos un valor tipo String
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	/**
	 * M??todo getter
	 * @return state,mostramos un valor tipo String 
	 */
	public String getState() {
		return state;
	}
	/**
	 * M??todo "setter"
	 * @param state,establecemos un valor tipo String
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * M??todo "getter"
	 * @return country,mostramos un valor tipo String
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * M??todo "setter"
	 * @param country, establecemos un valor tipo String
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * M??todo "getter"
	 * @return postalCode,mostramos un valor tipo String
	 */
	public String getPostalCode() {
		return postalCode;
	}
	/**
	 * M??todo "setter"
	 * @param postalCode,establecemos un valor tipo String
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	/**
	 * M??todo "getter"
	 * @return territory, mostramos un valor tipo String
	 */
	public String getTerritory() {
		return territory;
	}
	/**
	 * M??todo "setter"
	 * @param territory,establecemos un valor tipo String
	 */
	public void setTerritory(String territory) {
		this.territory = territory;
	}

	/**
	 /**
	 * es Metodo para que pueda sobreescribiendo un m??todo de alguna clase padre
	 */
	@Override
	public String toString() {
		return "Offices [officeCode=" + officeCode + ", city=" + city + ", phone=" + phone + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", state=" + state + ", country=" + country
				+ ", postalCode=" + postalCode + ", territory=" + territory + "]";
	}
	
	
	
	}