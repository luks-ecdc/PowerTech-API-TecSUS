import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ContaGas } from 'src/models/conta_gas.model';
import { ContaGasService } from 'src/services/conta-gas.service';

@Component({
  selector: 'app-gas',
  templateUrl: './gas.component.html',
  styleUrls: ['./gas.component.css']
})
export class GasComponent implements OnInit {

  form: FormGroup
  contaGas: ContaGas
  constructor(private formBuilder: FormBuilder,private contaGasService: ContaGasService) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      baseDeCalculo: [null, Validators.required],
      codgasFK: ['', Validators.required],
      consumoFaturado: [null, Validators.required],
      fornecimentoGas$: [null, Validators.required],
      icmsporcento: [null, Validators.required],
      impostoEstaduais: [null, Validators.required],
      impostoFederal: [null, Validators.required],
      impostoTotal: [null, Validators.required],
      tarifaICMS: [null, Validators.required],
      valorCONFIS: [null, Validators.required],
      valorFatura: [null, Validators.required],
      valorICMS: [null, Validators.required],
      valorPIS: [null, Validators.required]
    })
  }

  createContaGas() {
    this.contaGasService.createContaGas(this.form.value)
    console.log(this.form.value)
  }

}
