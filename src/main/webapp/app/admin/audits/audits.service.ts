import { Injectable } from '@angular/core';
import { Http, Response, URLSearchParams } from '@angular/http';
import { Observable } from 'rxjs/Rx';

@Injectable()
export class AuditsService  {
    constructor(private http: Http) { }

    query(req: any): Observable<Response> {
        return this.http.get('management/audits');
    }
}
