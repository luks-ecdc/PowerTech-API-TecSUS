package com.tecsus.API.controller;

import java.io.IOException;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.tecsus.API.entities.Conta_agua;
import com.tecsus.API.entities.Conta_luz;
import com.tecsus.API.entities.Contrato;
import com.tecsus.API.repository.Conta_luzRepository;
import com.tecsus.API.repository.ContratoRepository;

@RestController // Permiti spring reconhecer como uma controller	
@CrossOrigin(origins="*") // impede conflito de CORS, assim o frontend consegue receber o back
@RequestMapping(value = "")// defini url que vai consultar a entidade
public class Conta_luzController {
	
	@Autowired 
	Conta_luzRepository conta_luzRepository;
	
	@Autowired 
	ContratoRepository contratoRepository;
	
	@GetMapping("/contas_luz") // metodo GET
	public List<Conta_luz> getContas_luz(){
		return conta_luzRepository.findAll();
	}
	
	@GetMapping("/conta_luz/{id_conta}") // metodo GET
	public  Conta_luz getConta_luzId(@PathVariable(value = "id_conta") long id_conta){
		return conta_luzRepository.findById(id_conta);
	}
	
	@GetMapping("/conta_luz/dashboard/{tempoFinal}/{tempoInicio}") // metodo GET
	public String getConta_luzdashboard(
			
			@DateTimeFormat (pattern="yyyy-MM-dd") @PathVariable(value = "tempoInicio") String tempoinicio,
			@DateTimeFormat(pattern="yyyy-MM-dd")@PathVariable(value = "tempoFinal")  String tempoFinal){
		
		
		String[] partesinicio = tempoFinal.split("-");
		int anoinicio = Integer.parseInt(partesinicio[0]);
		int mesinicio = Integer.parseInt(partesinicio[1]);
		int diainicio = Integer.parseInt(partesinicio[2]);
		Date datainicio  = new Date(anoinicio,mesinicio-1,diainicio);
		
		String[] partesfim = tempoFinal.split("-");
		int anofim = Integer.parseInt(partesfim[1]);
		int mesfim = Integer.parseInt(partesfim[0]);
		int diafim = Integer.parseInt(partesfim[2]);

		Date datafim  = new Date(anofim,mesfim-1,diafim);
		
		
		
		return "inicio: "+datainicio+" /n fim :"+datafim ;
	}
	
	@GetMapping("/conta_luz_instalacaoluz/{luz_fk}") // metodo GET
	public  List<Conta_luz> getConta(@PathVariable(value = "luz_fk") long luz_fk){
		return conta_luzRepository.findByInstalacaoluzFK(luz_fk);
	}
	
	/*@PostMapping("/conta_luz/upload")
	public Conta_luz salvarConta(Conta_luz conta_luz, @RequestParam("conta_luz") MultipartFile file) {
		try {
			conta_luz.setArquivo(file.getBytes());
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return conta_luzRepository.save(conta_luz);
		
	}
	*/
 	@PostMapping("/conta_luz")
	public  Conta_luz createConta_luz(@RequestBody Conta_luz conta_luz) {
		return conta_luzRepository.save(conta_luz);
	}
	
	@PutMapping("/conta_luz")
	public  Conta_luz atualizarConta_luz(@RequestBody Conta_luz conta_luz) {
		return conta_luzRepository.save(conta_luz);
	}
	
	
	
	@PutMapping("/conta_luz/{instalacao_luz}/contrato/{instalacao_cont}")
	 public Conta_luz ColocarContratoNaConta(
	            @PathVariable Long instalacao_luz,
	            @PathVariable Long instalacao_cont
	    ) {
	    	Conta_luz conta_luz = conta_luzRepository.findById(instalacao_luz).get();
	        Contrato contrato = contratoRepository.findById(instalacao_cont).get();
	        conta_luz.setContrato(contrato);
	        return conta_luzRepository.save(conta_luz);
	    }
	
	@DeleteMapping("/conta_luz")
	public  void deleteConta_luz(@RequestBody Conta_luz conta_luz) {
		conta_luzRepository.delete(conta_luz);
	}

}