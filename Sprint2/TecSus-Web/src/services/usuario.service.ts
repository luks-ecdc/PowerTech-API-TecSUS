import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_PATH } from '../environments/environment';
import { catchError, map, Observable } from 'rxjs';
import { Usuario } from '../models/usuario.model';
@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  constructor(private httpClient: HttpClient) { }

  getUsuarios(): Observable<any> {
    return this.httpClient.get(`${API_PATH}/usuario`)
  }

  getUsuarioById(id: number): Observable<any> {
    return this.httpClient.get(`${API_PATH}/usuario/${id}`)
  }


  getUsuarioByUsername(username: string): Observable<any> {
    return this.httpClient.get(`${API_PATH}/usuario/byUsername/${username}`)
  }

  // Para fazer o put é preciso passar o objeto pelo body, como segudno argumento
  createUsuario(usuario: Usuario) {
    return this.httpClient.post(`${API_PATH}/usuario`, usuario).subscribe(data => {
      console.log(data)
    });
  }
}
