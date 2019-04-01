package sv.com.webService.rest.entity;

import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Cliente {
	private Long cod_cliente;
	private String nombre;
	private String apellidos;
	private String dui;
	private Date fecha_registro;
	@XmlTransient
	private ArrayList<Cuenta> cuentas;
	
	public Long getCod_cliente() {
		return cod_cliente;
	}
	public void setCod_cliente(Long cod_cliente) {
		this.cod_cliente = cod_cliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDui() {
		return dui;
	}
	public void setDui(String dui) {
		this.dui = dui;
	}
	public Date getFecha_registro() {
		return fecha_registro;
	}
	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}
	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}
	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cliente [cod_cliente=");
		builder.append(cod_cliente);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", dui=");
		builder.append(dui);
		builder.append(", fecha_registro=");
		builder.append(fecha_registro);
		builder.append(", numero_cuenta=");
		builder.append("]");
		return builder.toString();
	} 
}
