import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CommunicationService {

  subjectResponse:any=new Subject<any>();

  message$=this.subjectResponse.asObservable();

  constructor() { }


  callSubject(value:any){
    console.log(value);
    this.subjectResponse.next(value);
  }
}
