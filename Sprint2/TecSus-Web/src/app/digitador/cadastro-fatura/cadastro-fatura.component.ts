import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-cadastro-fatura',
  templateUrl: './cadastro-fatura.component.html',
  styleUrls: ['./cadastro-fatura.component.css']
})
export class CadastroFaturaComponent implements OnInit {

  instalacao: string = "Conta"
  form: FormGroup;
  tipoConta: String

  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      instalacao: [null],
      tipoConta: [null],
      concessionaria: [null],
    })
  }

  carregarConta() {
    this.tipoConta = this.form.value.tipoConta;
    this.instalacaoRgi()
  }

  instalacaoRgi() {
    if (this.form.value.tipoConta = 'Água') {
      this.instalacao = "RGI"
    }
    else if(this.form.value.tipoConta = 'Energia'){
      this.instalacao = "Instalação"

     }
  }
}

