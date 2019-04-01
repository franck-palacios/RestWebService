package sv.com.webService.rest.entity;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement
public class Cuenta {
	private String numero_cuenta;
	private String nombre_cuenta;
	private Long monto_apertura;
	private Date fecha_apertura;
	private Long saldo;
	private Character estado_cuenta;
	private Long codigo_cliente;
	
	public String getNumero_cuenta() {
		return numero_cuenta;
	}
	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}
	public String getNombre_cuenta() {
		return nombre_cuenta;
	}
	public void setNombre_cuenta(String nombre_cuenta) {
		this.nombre_cuenta = nombre_cuenta;
	}
	public Long getMonto_apertura() {
		return monto_apertura;
	}
	public void setMonto_apertura(Long monto_apertura) {
		this.monto_apertura = monto_apertura;
	}
	public Date getFecha_apertura() {
		return fecha_apertura;
	}
	public void setFecha_apertura(Date fecha_apertura) {
		this.fecha_apertura = fecha_apertura;
	}
	public Long getSaldo() {
		return saldo;
	}
	public void setSaldo(Long saldo) {
		this.saldo = saldo;
	}
	public Character getEstado_cuenta() {
		return estado_cuenta;
	}
	public void setEstado_cuenta(Character estado_cuenta) {
		this.estado_cuenta = estado_cuenta;
	}
	public Long getCodigo_cliente() {
		return codigo_cliente;
	}
	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cuenta [numero_cuenta=");
		builder.append(numero_cuenta);
		builder.append(", nombre_cuenta=");
		builder.append(nombre_cuenta);
		builder.append(", monto_apertura=");
		builder.append(monto_apertura);
		builder.append(", fecha_apertura=");
		builder.append(fecha_apertura);
		builder.append(", saldo=");
		builder.append(saldo);
		builder.append(", estado_cuenta=");
		builder.append(estado_cuenta);
		builder.append(", codigo_cliente=");
		builder.append(codigo_cliente);
		builder.append("]");
		return builder.toString();
	}
	
}
