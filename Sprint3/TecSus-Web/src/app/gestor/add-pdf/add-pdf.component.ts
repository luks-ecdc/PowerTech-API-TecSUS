import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { API_PATH } from 'src/environments/environment';
import { Arquivo } from 'src/models/arquivo';
import { ArquivoService } from 'src/services/arquivo.service';
import { ContratoService } from 'src/services/contrato.service';

@Component({
  selector: 'app-add-pdf',
  templateUrl: './add-pdf.component.html',
  styleUrls: ['./add-pdf.component.css']
})
export class AddPdfComponent implements OnInit {

  constructor(private formBuilder: FormBuilder, private contratoService: ContratoService,
    private arquivoService: ArquivoService, private httpClient: HttpClient) { }

  fileName = "Adicionar arquivo"
  form: FormGroup;
  arquivo: Arquivo
  files: any;

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      profile: ['']
    })
  }

  //upload do arquivo
  onSubmit(){
    const formData = new FormData();
    formData.append('file', this.form.get('profile').value);

    this.httpClient.post<any>(API_PATH +'/arquivo/enviar', formData).subscribe(
      (res) => console.log(res),
      (err) => console.log(err)
    );
  }
  onFileSelect(event){
    if (event.target.files.length > 0) {
      const file = event.target.files[0];
      this.form.get('profile').setValue(file);
      this.fileName = file.name
    }
  }

  savePdf() {
    if(this.fileName == "Adicionar arquivo"){
      alert('selecione um arquivo')
    }
    this.arquivoService.getArquivos().subscribe(
      data => {
        this.files = data
      })

  }

}
