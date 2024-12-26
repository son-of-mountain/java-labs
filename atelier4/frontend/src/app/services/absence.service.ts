import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AbsenceService {

  private apiUrl = 'localhost/api/absences';

  constructor(private http: HttpClient) { }

  getAbsence(): Observable<any> {
    return this.http.get(this.apiUrl)
  }

  updateAbsence(absence: any): Observable<any> {
    return this.http.post(this.apiUrl, absence);
  }

  deleteAbsence(id:number): Observable<any> {
    return this.http.delete(`${this.apiUrl}/${id}`);
  }

}
