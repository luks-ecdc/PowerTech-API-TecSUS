import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-gestor',
  templateUrl: './gestor.component.html',
  styleUrls: ['./gestor.component.css']
})
export class GestorComponent implements OnInit {

  constructor(private router: Router) { }

  navLinks: any[];
  activeLinkIndex = -1;

  ngOnInit(): void {
    // Inicializa a tabas
    this.navLinks = [
      {
          label: 'Relatório dos contratos',
          link: './relatorio',
          index: 1
      }, {
        label: 'Upload PDF',
        link: './pdf',
        index: 2
      },
  ];

  this.router.events.subscribe((res) => {
    this.activeLinkIndex = this.navLinks.indexOf(this.navLinks.find(tab => tab.link === '.' + this.router.url));
});

  }


}
