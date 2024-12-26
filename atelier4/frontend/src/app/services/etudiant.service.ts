import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class EtudiantService {
  private apiUrl = 'localhost:8080/api/etudiants';

  constructor(private http: HttpClient) {}

  getEtudiants(): Observable<any> {
    return this.http.get(this.apiUrl);
  }

  addEtudiant(etudiant: any): Observable<any> {
    return this.http.post(this.apiUrl, etudiant);
  }

  deleteEtudiant(id: number): Observable<any>{
    return this.http.delete(`${this.apiUrl}/${id}`);
  }

}
