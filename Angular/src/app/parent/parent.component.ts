import { Component } from '@angular/core';
import { CommunicationService } from '../Service/communication.service';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {
    parentData: string = "Hello from Parent;;;"

    childEmiitData:string='';

    constructor(private communication:CommunicationService){

    }
  
    parentEvent(data:any){
      this.childEmiitData=data;
    }

    emitSubject(){
      this.communication.callSubject("Hi Buddy");
    }


}
