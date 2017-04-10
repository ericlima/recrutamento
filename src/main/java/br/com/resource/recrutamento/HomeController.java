package br.com.resource.recrutamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@Autowired
	private ClienteService clienteService;

	List<Cliente> clientes;
	
	public void carregaClientes() {
	
		clientes = clienteService.listar();
		
		if (clientes.size() == 0) {

			Cliente cliente = new Cliente();
			
			cliente.setNome("Raimundo Nonato");
			cliente.setTelefone("(11) 95120-9921"); 

			clienteService.Salvar(cliente);
			
			cliente = new Cliente();
			
			cliente.setNome("Anderson Silva");
			cliente.setTelefone("(11) 95122-1243"); 

			clienteService.Salvar(cliente);
			
			cliente = new Cliente();
			
			cliente.setNome("João Dias");
			cliente.setTelefone("(11) 2321-3221"); 

			clienteService.Salvar(cliente);
			
		}
	}
	
	@RequestMapping("/")
	public ModelAndView index() {

		ModelAndView modelo = new ModelAndView("index.jsp");
		
		carregaClientes();

		modelo.addObject("clientes", clientes);
		
		// complete o codigo para que a pagina receba a lista de clientes.

		return modelo;
	}
	
}
