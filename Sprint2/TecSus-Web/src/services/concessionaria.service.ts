import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { API_PATH } from '../environments/environment';
import { catchError, map, Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class ConcessionariaService {

  constructor(private httpClient: HttpClient) { }

  getConcessionarias(): Observable<any> {
    return this.httpClient.get(`${API_PATH}/concessionarias`)
  }
}
