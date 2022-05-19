import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-digitador',
  templateUrl: './digitador.component.html',
  styleUrls: ['./digitador.component.css']
})
export class DigitadorComponent implements OnInit {

  constructor(private router: Router) { }

  navLinks: any[];
  activeLinkIndex = -1;

  ngOnInit(): void {
    // Inicializa a tabas
    this.navLinks = [
      {
        label: 'Buscar',
        link: './buscar-digitador',
        index: 0
      }, {
        label: 'Cadastro de faturas',
        link: './cadastro-fatura',
        index: 1

      }
    ];

    this.router.events.subscribe((res) => {
      this.activeLinkIndex = this.navLinks.indexOf(this.navLinks.find(tab => tab.link === '.' + this.router.url));
    });

  }


}
