import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_PATH } from '../environments/environment';
import { catchError, map, Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ContratoService {

  constructor(private httpClient: HttpClient) { }


  getContrato(): Observable<any> {
    return this.httpClient.get(`${API_PATH}/contratos`)
  }

  uploadPdf(pdfPath: String) {
    return this.httpClient.post(`${API_PATH}/contrato/upload`, pdfPath).subscribe(data => {
      console.log(data)
    });
  }

}
