import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Contrato } from 'src/models/contrato.model';
import { ContratoService } from 'src/services/contrato.service';
import { DeletarComponent } from '../../deletar/deletar.component';

@Component({
  selector: 'app-tabela-contrato',
  templateUrl: './tabela-contrato.component.html',
  styleUrls: ['./tabela-contrato.component.css']
})
export class TabelaContratoComponent implements OnInit {

  contratos: Contrato[]
  contratos2: Contrato[]

  constructor(private contratoService: ContratoService,
    public dialog: MatDialog) { }

  ngOnInit(): void {
    //Pega todos Contrato do backend
    this.contratoService.getContrato().subscribe(
      data => {
        this.contratos = data
        console.log(data);
      }
    )

    this.contratos2 = [{
      servico: "Água",
      cep_cont: "12203-748",
      rua_cont: "Rua Larryson 748",
      complemento_cont: "Bloco A",
      consumo_cont: 121.32
    },
    {
      servico: "Energia",
      cep_cont: "74856-712",
      rua_cont: "Rua Antonio Piovesan 1028",
      complemento_cont: "Sem complemento",
      consumo_cont: 92.32

    }
    ]
  }
  openDialog(): void {
    const dialogRef = this.dialog.open(DeletarComponent, {
      width: '300px',
      // data: { name: this.nome }
    });

  }
}
