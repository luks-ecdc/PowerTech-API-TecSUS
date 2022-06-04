package com.tecsus.API.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tecsus.API.entities.Conta_agua;
import com.tecsus.API.entities.Conta_gas;
import com.tecsus.API.entities.Conta_luz;
import com.tecsus.API.entities.Contrato;
import com.tecsus.API.repository.Conta_aguaRepository;
import com.tecsus.API.repository.Conta_gasRepository;
import com.tecsus.API.repository.ContratoRepository;

import io.swagger.annotations.ApiOperation;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin (origins="*")// impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "")// defini url que vai consultar a entidade
public class Conta_gasController {

	
	
	@Autowired 
	Conta_gasRepository conta_gasRepository;
	
	@Autowired 
	ContratoRepository contratoRepository;
	
	
	@GetMapping("/Contas_gas") // metodo GET
	public List<Conta_gas> getConta_gas(){
		return conta_gasRepository.findAll();
	}
	
	@GetMapping("/Conta_gas/{id_conta}") // metodo GET
	public  Conta_gas getConta_gasId(@PathVariable(value = "id_conta") long id){
		return conta_gasRepository.findById(id);
	}
	
	@GetMapping("Conta_gas_codgasfk/{codgasfk}")
	public List <Conta_gas> getCont_gasPorFk(@PathVariable (value = "codgasfk")long codgasfk){
		return conta_gasRepository.findByCodgasFK(codgasfk);
		
	}
	
	@GetMapping("/conta_gas/dashboard/CODE{code}/{mes}-{ano}/{mesf}-{anof}") // metodo GET
	public List<Conta_gas> getConta_luzdashboard(
			
			@PathVariable(value = "code") long code,
			@PathVariable(value = "mes") int mes,
			@PathVariable(value = "ano")  int ano,
			@PathVariable(value = "mesf") int mesf,
			@PathVariable(value = "anof")  int anof){
		
		
		LocalDate dit = LocalDate.of(ano,mes , 1);
		java.sql.Date dataInicial = java.sql.Date.valueOf( dit );
		
		LocalDate dft2 = LocalDate.of(anof,mesf , 1);
		java.sql.Date dataFinal = java.sql.Date.valueOf( dft2 );
		
		
		return conta_gasRepository.findPorIdEmPeriodoDeTempo(code,dataInicial, dataFinal);
	}


	@PostMapping("/Conta_gas")
	public  Conta_gas createConta_gas(@RequestBody Conta_gas conta_gas) {
		return conta_gasRepository.save(conta_gas);
	}
	
	@PutMapping("/Conta_gas")
	public  Conta_gas atualizarConta_gas(@RequestBody Conta_gas conta_gas) {
		return conta_gasRepository.save(conta_gas);
	}
	
	@PutMapping("/conta_gas/{conta_gasid}/contrato/{instalacao_cont}")
	public Conta_gas ColocarContratoNaConta(
	            @PathVariable Long conta_gasid,
	            @PathVariable Long instalacao_cont
	    ) {
	    	 Conta_gas  conta_gas = conta_gasRepository.findById(conta_gasid).get();
	        Contrato contrato = contratoRepository.findById(instalacao_cont).get();
	        conta_gas.setContrato(contrato);
	        return conta_gasRepository.save(conta_gas);
	    }
	
	
	@ApiOperation(value = "Deleta cadastro de contas de gás")
	@DeleteMapping("/Conta_gasD{id_conta_gas}")
	public  void deleteConta_gas(@PathVariable long id_conta_gas) {
		
		conta_gasRepository.deleteById(id_conta_gas);
	}
	
}
