package br.com.resource.recrutamento;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("ClienteService")
@Transactional
public class ClienteServiceImpl implements ClienteService {

	private final ClienteRepository clienteRepository;
	
	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	@Override
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}

	@Override
	public void Salvar(Cliente cliente) {		
		clienteRepository.save(cliente);		
	}
	
	
	
}
