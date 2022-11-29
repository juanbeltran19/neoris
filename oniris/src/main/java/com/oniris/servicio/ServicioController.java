package com.oniris.servicio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oniris.modelo.Persona;
import com.oniris.modelo.Cliente;
import com.oniris.modelo.Usuarios;
import com.oniris.modelo.Cuenta;
import com.oniris.modelo.Movimientos;
import com.oniris.repositorio.RepositorioPersona;
import com.oniris.repositorio.RepositorioCliente;
import com.oniris.repositorio.RepositorioCuenta;
import com.oniris.repositorio.RepositorioMovimientos;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api")
public class ServicioController {
	
	private final Logger LOOGER = LoggerFactory.getLogger(ServicioController.class);
	
	@Autowired
	RepositorioPersona repositorioPersona;

	@Autowired
	RepositorioCliente repositorioCliente;

	@Autowired
	RepositorioCuenta repositorioCuenta;

	@Autowired
	RepositorioMovimientos repositorioMovimientos;	
	
	@GetMapping(path="/clientes")
	public @ResponseBody Iterable<Persona> obtenerListaCliente(){
		return repositorioPersona.findAll();
	}
	
	@PostMapping("/clientes/crear")
	public String crearCliente(@RequestBody Usuarios usuario) {
		try {
		Persona persona = new Persona();
		persona.setIdentificacion(usuario.getIdentificacion());
		persona.setNombre(usuario.getNombres());
		persona.setDireccion(usuario.getDireccion());
		persona.setTelefono(usuario.getTelefono());
		repositorioPersona.save(persona);
		
		Cliente cliente = new Cliente();
		cliente.setClienteid(usuario.getIdentificacion());
		cliente.setContrasena(usuario.getContrasena());
		cliente.setEstado(usuario.getEstado()); 
		repositorioCliente.save(cliente);
		}catch(Exception e) {
			LOOGER.error("Error crearCliente: "+e.getMessage());
		}		
		return "Cliente creado correctamente";
	}
	
	@PostMapping("/clientes/eliminar/{id}")
	@ResponseBody
	public String eliminarCliente(@PathVariable("id") int id) {
		try {
			Persona persona = new Persona(); 
			persona.setIdentificacion(id);
			Cliente cliente = new Cliente();
			cliente.setClienteid(id);
			repositorioCliente.delete(cliente);
			repositorioPersona.delete(persona);
		}catch(Exception e) {
			LOOGER.error("Error eliminarCliente: "+e.getMessage());
		}
		return "Cliente eliminado";
	}	
	
	@PutMapping("/clientes/actualizar/{id}")
	public String actualizarCliente(@RequestBody Usuarios usuario) {
		try {
		Persona persona = new Persona();
		persona.setIdentificacion(usuario.getIdentificacion());
		persona.setNombre(usuario.getNombres());
		persona.setDireccion(usuario.getDireccion());
		persona.setTelefono(usuario.getTelefono());
		repositorioPersona.save(persona);
		
		Cliente cliente = new Cliente();
		cliente.setClienteid(usuario.getIdentificacion());
		cliente.setContrasena(usuario.getContrasena());
		cliente.setEstado(usuario.getEstado()); 
		repositorioCliente.save(cliente);
		}catch(Exception e) {
			LOOGER.error("Error actualizarCliente: "+e.getMessage());
		}	
		return "Cliente actualizado correctamente";
	}	
	
	@GetMapping(path="/cuentas")
	public @ResponseBody Iterable<Cuenta> obtenerListaCuenta(){
		return repositorioCuenta.findAll();
	}
	
	@PostMapping("/cuentas/crear")
	public String crearCuenta(@RequestBody Cuenta cuenta) {
		try {
		repositorioCuenta.save(cuenta);	
		}catch(Exception e) {
			LOOGER.error("Error crearCuenta: "+e.getMessage());
		}
		return "Cuenta creada correctamente";
	}
	
	@PostMapping("/cuentas/eliminar/{id}")
	@ResponseBody
	public String eliminarCuenta(@PathVariable("id") int id) {
		try {
			Cuenta cuenta = new Cuenta();
			cuenta.setNumeroCuenta(id);
			repositorioCuenta.delete(cuenta);
		}catch(Exception e) {
			LOOGER.error("Error: "+e.getMessage());
		}
		return "Cuenta eliminada";
	}	
	
	@PutMapping("/cuentas/actualizar/{id}")
	public String actualizarCuenta(@RequestBody Cuenta cuenta) {
		try {
		repositorioCuenta.save(cuenta);
		}catch(Exception e) {
			LOOGER.error("Error actualizarCuenta: "+e.getMessage());
		}
		return "Cuenta actualizada correctamente";
	}
	
	@GetMapping(path="/movimientos")
	public @ResponseBody Iterable<Movimientos> obtenerListaMovimientos(){
		return repositorioMovimientos.findAll();
	}	
	
	@PostMapping("/movimientos/crear")
	public String crearMovimientos(@RequestBody Movimientos movimientos) {
		try {
		repositorioMovimientos.save(movimientos);
		}catch(Exception e) {
			LOOGER.error("Error crearMovimientos: "+e.getMessage());
		}
		return "Movimiento creado correctamente";
	}
	
	@PostMapping("/movimientos/eliminar/{id}")
	@ResponseBody
	public String eliminarMovimiento(@PathVariable("id") int id) {
		try {
			Movimientos movimiento = new Movimientos();
			movimiento.setIdMovimiento(id);
			repositorioMovimientos.delete(movimiento);
		}catch(Exception e) {
			LOOGER.error("Error eliminarMovimiento: "+e.getMessage());
		}
		return "Cuenta eliminada";
	}
	
	@PutMapping("/movimientos/actualizar/{id}")
	public String actualizarMovimiento(@RequestBody Movimientos movimientos) {
		try {
		repositorioMovimientos.save(movimientos);
		}catch(Exception e) {
			LOOGER.error("Error actualizarMovimiento: "+e.getMessage());
		}
		return "Movimiento actualizado correctamente";
	}	
}
