package ar.edu.unju.fi.tpfinal.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="CUSTOMERS")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)// la estrategia par agenerar el Id es detipo Identity osea toma en cuenta lso valors de la base de dato par agenerar el siguente valro del id
	@Column(name = "cust_numero", nullable = false)//le pongo id
	private Long customerNumber;//int clave principal
		
	@Size(max = 50,message = "debe ingresar maximo 50 caracteres")
	@NotBlank(message = "La celda no debe quedar vacia, igrese un Nombre de cliente, inferior a 50 caracteres")
	@Column(name = "cust_customername")
	private String customerName;
	
	@NotBlank(message = "La celda no debe quedar vacia, igrese un Nombre apellido, inferior a 50 caracteres")
	@Size(max = 50,message = "debe ingresar maximo 50 caracteres")
	@Column(name = "cust_contactlastname")
	private String contactLastName;
	
	@NotBlank(message = "La celda no debe quedar vacia, igrese el nombre de contacto, inferior a 50 caracteres")
	@Size(max = 50,message = "debe ingresar maximo 50 caracteres")
	@Column(name = "cust_contactfirstname")
	private String contactFirstName;
	
	@NotBlank(message = "La celda no debe quedar vacia, igrese el numero de telefono, inferior a 50 caracteres")
	@Size(max = 50,message = "debe ingresar maximo 50 caracteres")
	@Column(name = "cust_phone")
	private String phone;//es varchar es la variable
	
	@Size(max = 50, message = "debe ingresar un valor inferior a 50 carcteres")
	@NotBlank(message = "La celda no debe quedar vacia, igrese direcci??n, inferior a 50 caracteres")
	@Column(name = "cust_addressLine1")
	private String addressLine1;
	
	@Size(max = 50, message = "debe ingresar un valor inferior a 50 carcteres")
	@Column(name = "cust_addressLine2")
	private String addressLine2;
	
	@Size(max = 50, message = "debe ingresar un valor inferior a 50 carcteres")
	@NotBlank(message = "La celda no debe quedar vacia, igrese un Nombre de a ciudad, inferior a 50 caracteres")
	@Column(name = "cust_city")
	private String city;
	
	@Size(max = 50, message = "debe ingresar un valor inferior a 50 carcteres")
	@Column(name = "cust_state")
	private String state;
	
	@Size(max = 15, message = "debe ingresar un valor inferior a 15 carcteres")
	@Column(name = "cust_postalCode")
	private String postalCode;
	
	@Size(max = 50, message = "debe ingresar un valor inferior a 50 carcteres")
	@NotBlank(message = "La celda no debe quedar vacia, igrese un nombre de pais, inferior a 50 caracteres")
	@Column(name = "cust_coutry")
	private String coutry;
	
	@DecimalMin(value = "10000.0")
	@NotNull(message = "La celda no debe quedar vacia")
	@Column(name = "cust_creditlimit")
	private Double creditLimit;

	@ManyToOne
	@Autowired
	@JoinColumn(name="empl_employeenumber")
	private Employee employees;
	
	/**
	 * Constructor de la Clase Customer
	 */
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * Constructor de los atributos:
	 * @param customerNumber
	 * @param customerName
	 * @param contactLastName
	 * @param contactFirstName
	 * @param phone
	 * @param addressLine1
	 * @param addressLine2
	 * @param city
	 * @param state
	 * @param postalCode
	 * @param coutry
	 * @param creditLimit
	 * @param employees
	 */
	public Customer(@NotNull Long customerNumber, @NotNull String customerName, @NotNull String contactLastName,
			@NotNull String contactFirstName, @NotNull String phone, @NotNull String addressLine1, String addressLine2,
			@NotNull String city, String state, String postalCode, @NotNull String coutry, Double creditLimit,
			Employee employees) {
		super();
		this.customerNumber = customerNumber;
		this.customerName = customerName;
		this.contactLastName = contactLastName;
		this.contactFirstName = contactFirstName;
		this.phone = phone;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.coutry = coutry;
		this.creditLimit = creditLimit;
		this.employees = employees;
	}

	//Metodos accesores


	/**
	 * M??todo "getter"
	 * @return customerNumber, retorna valor tipo Long
	 */
	public Long getCustomerNumber() {
		return customerNumber;
	}

	/**
	 * M??todo "setter"
	 * @param customerNumber, carga un valor tipo Long
	 */
	public void setCustomerNumber(Long customerNumber) {
		this.customerNumber = customerNumber;
	}

	/**
	 * M??todo "getter" 
	 * @return customerName, retorna valor tipo String
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * M??todo "setter" 
	 * @param customerName, carga valor tipo String
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * M??todo "getter" 
	 * @return contactLastName, retorna valor tipo Strting
	 */
	public String getContactLastName() {
		return contactLastName;
	}

	/**
	 * M??todo "setter"
	 * @param contactLastName, "cargar un valor" tipo Strting
	 */
	public void setContactLastName(String contactLastName) {
		this.contactLastName = contactLastName;
	}

	/**
	 * M??todo "getter"
	 * @return contactFirstName, retorna tipo String
	 */
	public String getContactFirstName() {
		return contactFirstName;
	}

	/**
	 * M??todo "setter" 
	 * @param contactFirstName "carga un valor" tipo String 
	 */
	public void setContactFirstName(String contactFirstName) {
		this.contactFirstName = contactFirstName;
	}

	/**
	 * M??todo "getter"  
	 * @return phone, "retornar el valor" tipo String
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * M??todo setter
	 * @param phone, "cargar un valor" tipo Strting
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * M??todo "getter" 
	 * @return the addressLine1, tipo Strting
	 */
	public String getAddressLine1() {
		return addressLine1;
	}

	/**
	 * M??todo "setter",
	 * @param addressLine1, "cargar un valor" tipo Strting
	 */
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	/**
	 * M??todo "setter"
	 * @return addressLine2, setea un valor tipo String
	 */
	public String getAddressLine2() {
		return addressLine2;
	}

	/**
	 * M??todo "setter" 
	 * @param addressLine2, "cargar un valor" tipo Strting
	 */
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	/**
	 * M??todo "getter" 
	 * @return city, retorna valor tipo Strting
	 */
	public String getCity() {
		return city;
	}

	/**
	 * M??todo "setter" 
	 * @param city "cargar un valor" tipo Strting
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * M??todo "getter"
	 * @return state, tipo String
	 */
	public String getState() {
		return state;
	}

	/**
	 * M??todo "setter" 
	 * @param state,sirve para "cargar un valor" tipo String 
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * M??todo "getter" (usa get =obtener) 
	 * @return the postalCode, tipo String
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * M??todo "setter" 
	 * @param postalCode,cargar un valor postalCode
	 */
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	/**
	 * M??todo "getter"
	 * @return the coutry, tipo String
	 */
	public String getCoutry() {
		return coutry;
	}

	/**
	 * M??todo "setter"
	 * @param coutry, carga un valor tipo String
	 */
	public void setCoutry(String coutry) {
		this.coutry = coutry;
	}


	/**
	 * M??todo "getter"
	 * @return the creditLimit,  tipo String
	 */
	public Double getCreditLimit() {
		return creditLimit;
	}

	/**
	 * M??todo "setter" 
	 * @param creditLimit "cargar un valor" tipo Double
	 */
	public void setCreditLimit(Double creditLimit) {
		this.creditLimit = creditLimit;
	}

	/**
	 * M??todo "getter" 
	 * @return the employees, un valor de clase employees
	 */
	public Employee getEmployees() {
		return employees;
	}

	/**
	 * M??todo "setter" 
	 * @param employees carga un valor de la clase Employees
	 */
	public void setEmployees(Employee employees) {
		this.employees = employees;
	}



	/**
	 * @Override es para que pueda sobreescribiendo un m??todo de alguna clase padre
	 */
	@Override
	public String toString() {
		return "Customers [customerNumber=" + customerNumber + ", customerName=" + customerName + ", contactLastName="
				+ contactLastName + ", contactFirstName=" + contactFirstName + ", phone=" + phone + ", addressLine1="
				+ addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city + ", state=" + state
				+ ", postalCode=" + postalCode + ", coutry=" + coutry + ", creditLimit=" + creditLimit + ", employees="
				+ employees + "]";
	}
	
	

}
