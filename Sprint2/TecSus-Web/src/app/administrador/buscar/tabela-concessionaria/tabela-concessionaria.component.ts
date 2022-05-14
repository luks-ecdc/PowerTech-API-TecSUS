import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { Concessionaria } from 'src/models/concessionaria.model';
import { ConcessionariaService } from 'src/services/concessionaria.service';
import { DeletarComponent } from '../../deletar/deletar.component';

@Component({
  selector: 'app-tabela-concessionaria',
  templateUrl: './tabela-concessionaria.component.html',
  styleUrls: ['./tabela-concessionaria.component.css']
})
export class TabelaConcessionariaComponent implements OnInit {

  concessionarias: Concessionaria[]

  constructor(private concessionariaService: ConcessionariaService,
    public dialog: MatDialog) { }


  ngOnInit(): void {
    this.concessionariaService.getConcessionarias().subscribe(
      data => {
        this.concessionarias = data
        console.log(data);
      }
    )

    this.concessionarias = [
      {
        nome_conces: 'Nome concessionaria OFF',
        cnpj: "123123123",
        fornecimento: "agua",
        endereco_conces: "rua sabesp 5165"
      }
    ]
  }
  // abrir modal de exlcuir
  openDialog(): void {
    const dialogRef = this.dialog.open(DeletarComponent, {
      width: '300px',
    });
}

}

