import { Component, EventEmitter, Input, OnInit, Output, ViewEncapsulation } from '@angular/core';
import { CommunicationService } from '../Service/communication.service';
import { FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrl: './child.component.css',
  encapsulation:ViewEncapsulation.Emulated
})
export class ChildComponent implements OnInit {
@Input() childData:string='';

serviceMessage:any;

@Output() parentSend = new EventEmitter<any>();

formData:FormGroup;
  constructor(private communication:CommunicationService){
    this.formData=new FormGroup({
      name: new FormControl('',Validators.required),
      password: new FormControl('',Validators.required)
    })
    }
  ngOnInit(): void {
   this.communication.message$.subscribe(
    (message:any)=>{
      this.serviceMessage=message;
    }
   )
  }
  

employeeData:any[]=[
  {id:1,name:'Ajay', age:20},
  {id:1,name:'Aj', age:30},
  {id:1,name:'jay', age:50},
  {id:1,name:'B', age:50}
]

sentParentToData(){
  this.parentSend.emit("From Child Bro");
}

}
