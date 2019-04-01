package sv.com.webService.rest.resources;

import java.util.ArrayList;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import sv.com.webService.rest.entity.Cliente;
import sv.com.webService.rest.entity.Cuenta;

@Path("/cliente")
@Produces(MediaType.APPLICATION_XML)
public class ClienteResource {
	@GET
	public Response obtenerCliente() {
		Cliente cliente = crearClienteFicticio();
		return Response.status(Response.Status.OK).entity(cliente).type(MediaType.APPLICATION_XML).build();
	}
	
	public Cliente crearClienteFicticio() {
		Cliente cliente = new Cliente();
		Cuenta cuenta = new Cuenta();
		Cuenta cuenta2 = new Cuenta();
		ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();
		//Cuenta
		cuenta.setCodigo_cliente(2L);
		cuenta.setEstado_cuenta('A');
		cuenta.setFecha_apertura(new Date());
		cuenta.setMonto_apertura(100L);
		cuenta.setNombre_cuenta("Nueva cuenta");
		cuenta.setNumero_cuenta("A1");
		cuenta.setSaldo(5000L);
		cuenta2 = cuenta;
		cuenta2.setNombre_cuenta("Cuenta Dos");
		cuentas.add(cuenta);
		cuentas.add(cuenta2);
		//Cliente
		cliente.setNombre("Juan Francisco");
		cliente.setApellidos("Palacios Grande");
		cliente.setCod_cliente(1L);
		cliente.setDui("05098329-0");
		cliente.setFecha_registro(new Date());
		cliente.setCuentas(cuentas);
		return cliente;
	}
}
