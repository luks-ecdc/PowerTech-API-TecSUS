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

   @ViewChild("myChart", {static: true}) myChart:ElementRef;
   

  ngOnInit(): void {
    new Chart(this.myChart.nativeElement, {
      type: 'line',
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
        labels: ["", "Jan", "Fev", "Mar", "Abr", "Mai", "Jun"],
        datasets: [
          {
            data: [60, 10, 100, 120, 320, 220, 280],
            borderColor: "#1DF84D",
            backgroundColor: "#1DF84D",
            label: "Gás"
          },
          {
            data: [0, 180, 220, 170, 380, 320, 450],
            borderColor: "#FF8F84",
            backgroundColor: "#FF8F84",
            label: "Energia"
          },
          {
            data: [130, 270, 180, 220, 150, 390, 320],
            borderColor: "#8FC0FF",
            backgroundColor: "#8FC0FF",
            label: "Água",

          },
        ]
      }
    })
  }}



  