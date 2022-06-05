import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Contrato } from 'src/models/contrato.model';
import { ContratoService } from 'src/services/contrato.service';

@Component({
  selector: 'app-cadastro-contrato',
  templateUrl: './cadastro-contrato.component.html',
  styleUrls: ['./cadastro-contrato.component.css']
})
export class CadastroContratoComponent implements OnInit {

  form: FormGroup;
  contrato: Contrato;
  instalacao: string = "Instalação(RGI)"

  constructor(private formBuilder: FormBuilder, private contratoService: ContratoService) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      instalacao_cont: [null, Validators.required],
      servico: [null, Validators.required],
      servico_cont: [null, Validators.required],
      rua_cont: [null, Validators.required],
      bairro_cont: [null, Validators.required],
      cidade_cont: [null, Validators.required],
      estado_cont: [null, Validators.required],
      numero_cont: [null, Validators.required],
      complemento_cont: [null, Validators.required],
      cep_cont: [null, Validators.required],
      consumo_cont: [null, Validators.required],
      Unidade_id_CPF: [null, Validators.required],
      Concessionaria_nome_conces: [null, Validators.required],
      concessionaria: [null, Validators.required],

    })

  }

  cadastrarContrato(){
    this.contratoService.createContrato(this.form.value)
  }
  opcao(){
    if(this.form.value.concessionaria == "Energia"){
      alert(this.form.value.concessionaria)
      this.instalacao == "Instalação"
    }
    else(this.form.value.concessionaria == "Gás")
  }
}
