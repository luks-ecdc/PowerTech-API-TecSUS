import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-buscar',
  templateUrl: './buscar.component.html',
  styleUrls: ['./buscar.component.css']
})
export class BuscarComponent implements OnInit {

  form: FormGroup;
  cpf: string
  constructor(private formBuilder: FormBuilder) { }
  ngOnInit(): void {
    this.form = this.formBuilder.group({
      tabela: [null],
      cpf: [null]
    })
    this.form.value.tabela = "Unidade"
  }

  getCpf() {
    this.cpf = this.form.value.cpf
    console.log(this.cpf)
  }
}

