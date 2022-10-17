import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Form } from './form';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
  private baseUrl="http://localhost:9020/api/v1/form"


  constructor(private http:HttpClient) { }

  add(form:Form):Observable<Object>
  {
    return this.http.post(`${this.baseUrl}/add`,form);
  }
}
