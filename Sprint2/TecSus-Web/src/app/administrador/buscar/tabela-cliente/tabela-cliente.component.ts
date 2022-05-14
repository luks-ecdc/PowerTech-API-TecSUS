import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Cliente } from 'src/models/cliente.model';
import { ClienteService } from 'src/services/cliente.service';
import { DeletarComponent } from '../../deletar/deletar.component';

@Component({
  selector: 'app-tabela-cliente',
  templateUrl: './tabela-cliente.component.html',
  styleUrls: ['./tabela-cliente.component.css']
})
export class TabelaClienteComponent implements OnInit {

  nome: string;
  constructor(private clienteService: ClienteService,
    public dialog: MatDialog) { }

  clientes: Cliente[]
  // Verificar para carregar outros clientes
  ngOnInit(): void {

    //Pega todos clientes do backend
    this.clienteService.getClientes().subscribe(
      data => {
        this.clientes = data
        console.log(data);
      }
    )

    this.clientes = [{
      nome: "Cliente Testes OFF",
      cpf: "455471869",
      cep: "12203-748",
      rua: "Rua Larryson 748",
      complemento: "Bloco A",
    },
    {
      nome: "Cliente Teste OFF 2",
      cpf: "884454712",
      cep: "74856-712",
      rua: "Rua Antonio Piovesan 1028",
      complemento: "Sem complemento",
    }
    ]


  }

  openDialog(): void {
    const dialogRef = this.dialog.open(DeletarComponent, {
      width: '300px',
      data: { name: this.nome }
    });

  }

}

