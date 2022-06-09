import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Contrato } from 'src/models/contrato.model';
import { ContratoService } from 'src/services/contrato.service';
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-cadastro-contrato',
  templateUrl: './cadastro-contrato.component.html',
  styleUrls: ['./cadastro-contrato.component.css']
})
export class CadastroContratoComponent implements OnInit {

  form: FormGroup;
  contrato: Contrato;
  instalacao: String;

  constructor(private _snackBar: MatSnackBar,private formBuilder: FormBuilder, private contratoService: ContratoService) { }

  openSnackBar(message: string, action: string) {
    this._snackBar.open(message, action);
  }

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
      concessionaria: ["Água", Validators.required],

    })
    this.opcao()
  }

  cadastrarContrato() {
    this.contratoService.createContrato(this.form.value)
    this.openSnackBar("Salvo com Sucesso!","OK");
  }
  opcao() {
    if (this.form.value.concessionaria == "Gás") {
      this.instalacao = "Código de Usuário"

    }
    else if (this.form.value.concessionaria == "Água") {
      this.instalacao = "RGI"
    }
    else{
      this.instalacao = "Número de Instalação"

    }

  }
}
