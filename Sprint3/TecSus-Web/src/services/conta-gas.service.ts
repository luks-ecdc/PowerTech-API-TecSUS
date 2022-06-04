import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { API_PATH } from 'src/environments/environment';
import { ContaGas } from 'src/models/conta_gas.model';

@Injectable({
  providedIn: 'root'
})
export class ContaGasService {

  constructor(private httpClient: HttpClient) { }


  createContaGas(contaGas: ContaGas) {
    return this.httpClient.post(`${API_PATH}/Conta_gas`, contaGas).subscribe(data => {
      console.log(data)
      alert("Conta salva com sucesso!")
    });

  }
}
