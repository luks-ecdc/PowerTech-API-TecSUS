  import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ContaAguaService } from 'src/services/conta-agua.service';

@Component({
  selector: 'app-agua',
  templateUrl: './agua.component.html',
  styleUrls: ['./agua.component.css']
})
export class AguaComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private contaAguaService: ContaAguaService) { }

  form: FormGroup;

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      acima51ConsumoAgua: [null, Validators.required],
      acima51ConsumoEsgoto: [null, Validators.required],
      acima51TarifaAgua: [null, Validators.required],
      acima51TarifaEsgoto: [null, Validators.required],
      acima51ValorAgua: [null, Validators.required],
      acima51ValorEsgoto: [null, Validators.required],
      atMonetaria: [null, Validators.required],
      ate10ConsumoAgua: [null, Validators.required],
      ate10ConsumoEsgoto: [null, Validators.required],
      ate10TarifaAgua: [null, Validators.required],
      ate10TarifaEsgoto: [null, Validators.required],
      ate10ValorAgua: [null, Validators.required],
      ate10ValorEsgoto: [null, Validators.required],
      consumoTotalAgua: [null, Validators.required],
      consumoTotalEsgoto: [null, Validators.required],
      data: [null, Validators.required],
      de11ate20ConsumoAgua: [null, Validators.required],
      de11ate20ConsumoEsgoto: [null, Validators.required],
      de11ate20TarifaAgua: [null, Validators.required],
      de11ate20TarifaEsgoto: [null, Validators.required],
      de11ate20ValorAgua: [null, Validators.required],
      de11ate20ValorEsgoto: [null, Validators.required],
      de21ate30ConsumoAgua: [null, Validators.required],
      de21ate30ConsumoEsgoto: [null, Validators.required],
      de21ate30TarifaAgua: [null, Validators.required],
      de21ate30TarifaEsgoto: [null, Validators.required],
      de21ate30ValorAgua: [null, Validators.required],
      de21ate30ValorEsgoto: [null, Validators.required],
      de31ate50ConsumoAgua: [null, Validators.required],
      de31ate50ConsumoEsgoto: [null, Validators.required],
      de31ate50TarifaAgua: [null, Validators.required],
      de31ate50TarifaEsgoto: [null, Validators.required],
      de31ate50ValorAgua: [null, Validators.required],
      de31ate50ValorEsgoto: [null, Validators.required],
      id_conta_agua: [null, Validators.required],
      jurosMora: [null, Validators.required],
      multa: [null, Validators.required],
      periodo: [null, Validators.required],
      taxaDeRegulacao: [null, Validators.required],
      valorTotalAgua: [null, Validators.required],
      valorTotalEsgoto: [null, Validators.required]
    })
  }

  criarContaAgua() {
    this.contaAguaService.createContaAgua(this.form.value)
    console.log(this.form.value)
  }
}
