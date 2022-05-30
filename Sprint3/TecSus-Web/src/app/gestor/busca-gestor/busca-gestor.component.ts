import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-busca-gestor',
  templateUrl: './busca-gestor.component.html',
  styleUrls: ['./busca-gestor.component.css']
})
export class BuscaGestorComponent implements OnInit {

  filtro:FormGroup
  showTable = false


  constructor(private formBuilder: FormBuilder) { }

  ngOnInit(): void {
    this.filtro = this.formBuilder.group({
      cpf: [null, Validators.required],
      conta: ["todas", Validators.required],
    })
  }

}
