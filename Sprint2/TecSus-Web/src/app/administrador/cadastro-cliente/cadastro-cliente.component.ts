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
      nome: [null, Validators.required],
      rg: [null, Validators.required],
      cpf: [null, Validators.required],
      email: [null, Validators.required],
      telefone: [null, Validators.required],
      celular: [null, Validators.required],
      cep: [null, Validators.required],
      rua: [null, Validators.required],
      numero: [null, Validators.required],
      complemento: [null, Validators.required],
      estado: [null, Validators.required],
      cidade: [null, Validators.required],
    })
  }

  criarCliente(){
    this.clienteService.createCliente(this.form.value)
    console.log(this.form.value)
  }
}
