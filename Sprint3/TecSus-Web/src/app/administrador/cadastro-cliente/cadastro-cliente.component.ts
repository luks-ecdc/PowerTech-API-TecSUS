import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Cliente } from '../../../models/cliente.model';
import { ClienteService } from '../../../services/cliente.service';
@Component({
  selector: 'app-cadastro-cliente',
  templateUrl: './cadastro-cliente.component.html',
  styleUrls: ['./cadastro-cliente.component.css']
})
export class CadastroClienteComponent implements OnInit {

  form: FormGroup;
  cliente: Cliente

  constructor(private formBuilder: FormBuilder, private clienteService: ClienteService) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      id_CPF:[null, Validators.required],
      nome_uni:[null, Validators.required],
      cep_uni:[null, Validators.required],
      rua_uni:[null, Validators.required],
      bairro_uni:[null, Validators.required],
      numero_uni:[null, Validators.required],
      cidade_uni:[null, Validators.required],
      estado_uni:[null, Validators.required],
      complemento_uni:[null, Validators.required],
      cel_uni:[null, Validators.required],
      tel_uni:[null, Validators.required],
    })
  }

  criarCliente() {
    this.clienteService.createCliente(this.form.value)
    console.log(this.form.value)
  }
}
