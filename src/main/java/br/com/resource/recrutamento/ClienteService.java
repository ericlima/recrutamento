package br.com.resource.recrutamento;

import java.util.List;

public interface ClienteService {

	List<Cliente> listar();
	
	void Salvar(Cliente cliente);
	
}
