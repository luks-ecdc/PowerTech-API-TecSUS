import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ContaLuz } from 'src/models/conta_luz.model';
import { ContaLuzService } from 'src/services/conta-luz.service';
import {MatSnackBar} from '@angular/material/snack-bar';

@Component({
  selector: 'app-luz',
  templateUrl: './luz.component.html',
  styleUrls: ['./luz.component.css']
})
export class LuzComponent implements OnInit {

  contaLuz: ContaLuz
  form: FormGroup
  constructor(private _snackBar: MatSnackBar,private formBuilder: FormBuilder, private contaLuzService: ContaLuzService) { }

  openSnackBar(message: string, action: string) {
    this._snackBar.open(message, action);
  }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      bandeiraTarifaria: [null, Validators.required],
      bandeiraTarifariaValorCOFINS: [null, Validators.required],
      bandeiraTarifariaValorFornecido: [null, Validators.required],
      bandeiraTarifariaValorICMS: [null, Validators.required],
      bandeiraTarifariaValorPIS: [null, Validators.required],
      bandeiraTarifariaValorValorTotal: [null, Validators.required],
      cipConsumoValorCOFINS: [null, Validators.required],
      cipConsumoValorICMS: [null, Validators.required],
      cipConsumoValorPIS: [null, Validators.required],
      cipConsumoValorTotal: [null, Validators.required],
      cipValorFornecido: [null, Validators.required],
      cofinsValor: [null, Validators.required],
      consumoMes: [null, Validators.required],
      data_luz: [null, Validators.required],
      icmsvalor: [null, Validators.required],
      id_conta_luz: [null, Validators.required],
      instalacao_luz_fk: [null, Validators.required],
      periodo_luz: [null, Validators.required],
      pisValor: [null, Validators.required],
      teConsumoValorCOFINS: [null, Validators.required],
      teConsumoValorFornecido: [null, Validators.required],
      teConsumoValorICMS: [null, Validators.required],
      teConsumoValorPIS: [null, Validators.required],
      teConsumoValorTotal: [null, Validators.required],
      tusdConsumoValorCOFINS: [null, Validators.required],
      tusdConsumoValorFornecido: [null, Validators.required],
      tusdConsumoValorICMS: [null, Validators.required],
      tusdConsumoValorPIS: [null, Validators.required],
      tusdConsumoValorTotal: [null, Validators.required]
    })
  }

  criarContaLuz() {
    this.contaLuzService.createContaLuz(this.form.value)
    console.log(this.form.value)
    this.openSnackBar("Salvo com Sucesso!","OK")
  }
}
