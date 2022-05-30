import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { API_PATH } from 'src/environments/environment';
import { Arquivo } from 'src/models/arquivo';

@Injectable({
  providedIn: 'root'
})
export class ArquivoService {

  constructor(private httpClient: HttpClient) { }

  getArquivos(): Observable<any> {
    return this.httpClient.get(`${API_PATH}/arquivos`)
  }

  createArquivo(arquivo: Arquivo) {
    return this.httpClient.post(`${API_PATH}/arquivo/enviar`, arquivo).subscribe(data => {
      console.log(data)
    });
  }
}
