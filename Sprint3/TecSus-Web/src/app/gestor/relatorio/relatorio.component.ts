import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';

import {Chart, registerables} from 'node_modules/chart.js'


@Component({
  selector: 'app-relatorio',
  templateUrl: './relatorio.component.html',
  styleUrls: ['./relatorio.component.css']
})
export class RelatorioComponent implements OnInit {

  constructor() {
    Chart.register(...registerables)
   }

   @ViewChild("myChart", {static: true}) myChartGas:ElementRef;
   

  ngOnInit(): void {
    new Chart(this.myChartGas.nativeElement, {
      type: 'bar',
      options: {
        scales: {
          x: {
            ticks: {
              
              color: "black"
            }
          },
          y: {
            weight: 10,
            max: 400,
            grid: {
              drawOnChartArea: false
            },
            ticks: {
              color: "black",
              count: 6
            }
          }

        },
        elements: {
          line: {
            borderWidth: 1
          },
          point: {
            radius: 0
          }
        },
        plugins: {
          legend: {
            position: "bottom",
            labels: {
              boxWidth: 10,
              padding: 25,
              pointStyle: "circle",
              usePointStyle: true,

            }
          }
        }
      },

      data: {
        labels: ["Jan", "Fev", "Mar", "Abr", "Mai", "Jun"],
        datasets: [

          {
            label: "Média Alto Consumo",
            data: [80, 80, 80, 80, 80, 80],
            borderColor: "#FF3030",
            backgroundColor: "#FF3030",
            type: 'line'
            
          },

          {
            data: [60, 10, 100, 120, 320, 220],
            borderColor: "#1DF84D",
            backgroundColor: "#90EE90",
            label: "Gás"
          },

          

        ]
      }

    })

  }}


  



  


  



  