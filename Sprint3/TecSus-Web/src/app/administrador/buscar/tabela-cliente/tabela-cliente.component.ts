import { Component, Input, OnInit } from '@angular/core';
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

  @Input() cpf: string;
  nome: string;
  constructor(private clienteService: ClienteService,
    public dialog: MatDialog) { }

  clientes: Cliente[]
  ngOnInit(): void {
    this.clienteService.getClientes().subscribe(
      data => {
        this.clientes = data
      }
    )

    // if (this.cpf.length >= 3) {
    //   this.clienteService.getClienteById(this.cpf).subscribe(
    //     data => {
    //       this.clientes = data
    //       console.log(data)
    //     }
    //   )
    // } else {
    //   this.clienteService.getClientes().subscribe(
    //     data => {
    //       this.clientes = data
    //     }
    //   )
    // }

  }

  deletarUnidade(cpf){
    console.log(cpf)
    this.clienteService.deleteCliente(cpf)
  }

  openDialog(): void {
    const dialogRef = this.dialog.open(DeletarComponent, {
      width: '300px',
      data: { name: this.nome }
    });


  }

}

