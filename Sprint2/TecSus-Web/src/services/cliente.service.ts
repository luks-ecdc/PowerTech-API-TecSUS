import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_PATH } from '../environments/environment';
import { catchError, map, Observable } from 'rxjs';
import { Cliente } from '../models/cliente.model';
@Injectable({
  providedIn: 'root'
})
export class ClienteService {

  constructor(private httpClient: HttpClient) { }

  getClientes(): Observable<any> {
    return this.httpClient.get(`${API_PATH}/unidades`)
  }

  getClienteById(id: number): Observable<any> {
    return this.httpClient.get(`${API_PATH}/unidade/${id}`)
  }
  // Para fazer o put é preciso passar o objeto pelo body, como segudno argumento
  createCliente(unidade: Cliente) {
    return this.httpClient.post(`${API_PATH}/unidade`, unidade).subscribe(data => {
      console.log(data)
    });
  }
}
