import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Contrato } from 'src/models/contrato.model';
import { ContratoService } from 'src/services/contrato.service';

@Component({
  selector: 'app-buscar-digitador',
  templateUrl: './buscar-digitador.component.html',
  styleUrls: ['./buscar-digitador.component.css']
})
export class BuscarDigitadorComponent implements OnInit {

  form: FormGroup;
  contratos: Contrato[]
  constructor(private formBuilder: FormBuilder, private contratoService: ContratoService) { }

  ngOnInit(): void {
    this.contratoService.getContrato().subscribe(
      data => {
        this.contratos = data
      }
    )
  }



}


