import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-deletar',
  templateUrl: './deletar.component.html',
  styleUrls: ['./deletar.component.css']
})
export class DeletarComponent implements OnInit {

  @Input() dado: String
  constructor() { }

  ngOnInit(): void {
  }

}
