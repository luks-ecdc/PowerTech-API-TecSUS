import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ContratoService } from 'src/services/contrato.service';

@Component({
  selector: 'app-add-pdf',
  templateUrl: './add-pdf.component.html',
  styleUrls: ['./add-pdf.component.css']
})
export class AddPdfComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private contratoService: ContratoService) { }

  form: FormGroup;

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      pdf: [null]
    })
  }

  setPdf(pdf: string){
    let path: string = this.form.value.pdf
    // path = path.substr(12, path.length)//label ajustada
    this.contratoService.uploadPdf(`C://pdf/` + path)
    console.log(path)
  }

}
