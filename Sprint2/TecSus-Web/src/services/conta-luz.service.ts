import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { API_PATH } from 'src/environments/environment';
import { ContaLuz } from 'src/models/conta_luz.model';

@Injectable({
  providedIn: 'root'
})
export class ContaLuzService {

  constructor(private httpClient: HttpClient) { }

  getContaLuz(): Observable<any> {
    return this.httpClient.get(`${API_PATH}/conta_luz`)
  }

  createContaLuz(contaLuz: ContaLuz) {
    return this.httpClient.post(`${API_PATH}/conta_luz`, contaLuz).subscribe(data => {
      console.log(data)
    });
  }
}
