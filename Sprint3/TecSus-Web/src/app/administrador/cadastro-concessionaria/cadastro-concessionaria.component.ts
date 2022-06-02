import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Concessionaria } from 'src/models/concessionaria.model';
import { ConcessionariaService } from 'src/services/concessionaria.service';

@Component({
  selector: 'app-cadastro-concessionaria',
  templateUrl: './cadastro-concessionaria.component.html',
  styleUrls: ['./cadastro-concessionaria.component.css']
})
export class CadastroConcessionariaComponent implements OnInit {

  form: FormGroup;
  concessionaria: Concessionaria

  constructor(private formBuilder: FormBuilder, private concessionariaService: ConcessionariaService) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      cnpj_conces: [null, Validators.required],
      nome_conces: [null, Validators.required],
      servico_conces: [null, Validators.required],
      rua_conces: [null, Validators.required],
      numero_conces: [null, Validators.required],
      cep_conces: [null, Validators.required],
      cidade_conces: [null, Validators.required],
      tel_conces: [null, Validators.required]

    })
}

cadastrarConcessionaria(){
  this.concessionariaService.createCliente(this.form.value)
}

}
