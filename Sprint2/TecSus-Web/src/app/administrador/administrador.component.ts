import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-administrador',
  templateUrl: './administrador.component.html',
  styleUrls: ['./administrador.component.css']
})
export class AdministradorComponent implements OnInit {

  navLinks: any[];
  activeLinkIndex = -1;

  constructor(private router: Router) { }

  ngOnInit(): void {
    // Inicializa a tabas
    this.navLinks = [
       {
          label: 'Cadastro de Unidade',
          link: './cadastro-cliente',
          index: 0
      }, {
        label: 'Cadastro de Concessionaria',
        link: './cadastro-concessionaria',
        index: 1
      },{
        label: 'Cadastro de Contrato',
        link: './cadastro-contrato',
        index: 2
      },{
        label: 'Buscar',
        link: './buscar',
        index: 3
      },

  ];

  this.router.events.subscribe((res) => {
    this.activeLinkIndex = this.navLinks.indexOf(this.navLinks.find(tab => tab.link === '.' + this.router.url));
});

  }

}
