import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { API_PATH } from 'src/environments/environment';
import { ContaAgua } from 'src/models/conta_agua.model';

@Injectable({
  providedIn: 'root'
})
export class ContaAguaService {

  constructor(private httpClient: HttpClient) { }

  getContaAgua(): Observable<any> {
    return this.httpClient.get(`${API_PATH}/Contas_agua`)
  }

  createContaAgua(contaAgua: ContaAgua) {
    return this.httpClient.post(`${API_PATH}/Conta_agua`, contaAgua).subscribe(data => {
      console.log(data)
    });
  }

}
