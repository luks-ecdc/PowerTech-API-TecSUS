import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pdf-view',
  templateUrl: './pdf-view.component.html',
  styleUrls: ['./pdf-view.component.css']
})
export class PdfViewComponent implements OnInit {

  src: String = '../../../assets/serverStartup.pdf'

  constructor() { }

  ngOnInit(): void {
  }

}
