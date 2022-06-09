import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup,Validators } from '@angular/forms';
import { Contrato } from 'src/models/contrato.model';
import { ContratoService } from 'src/services/contrato.service';

@Component({
  selector: 'app-buscar-digitador',
  templateUrl: './buscar-digitador.component.html',
  styleUrls: ['./buscar-digitador.component.css']
})
export class BuscarDigitadorComponent implements OnInit {

  filtro:FormGroup
  form: FormGroup;
  contrato: Contrato
  constructor(private formBuilder: FormBuilder, private contratoService: ContratoService) { }

  ngOnInit(): void {
    this.filtro = this.formBuilder.group({
      tabela: [null],
      cpf: [null, Validators.required],
      conta: ["todas", Validators.required],
    })
    this.filtro.value.tabela = "Unidade"
  }



}


