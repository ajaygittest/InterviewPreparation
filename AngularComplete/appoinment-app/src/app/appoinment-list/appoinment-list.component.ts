import { Component, OnInit } from '@angular/core';
import { Appoinment } from '../models/appoinment';

@Component({
  selector: 'app-appoinment-list',
  templateUrl: './appoinment-list.component.html',
  styleUrl: './appoinment-list.component.css'
})
export class AppoinmentListComponent implements OnInit {

    newAppoinmentTitle:string="";
    newAppoinmentDate:Date=new Date();

    appoinments: Appoinment[]=[];

    ngOnInit(): void {
     let data=localStorage.getItem('appoinment');
     console.log(data);
     this.appoinments=data?JSON.parse(data) : [];
    }

    addAppoinment(){
      if(this.newAppoinmentTitle.trim().length && this.newAppoinmentDate){
        let newAppoinment: Appoinment={
          id: Date.now(),
          title: this.newAppoinmentTitle,
          date: this.newAppoinmentDate
        }
        this.appoinments.push(newAppoinment);
        this.newAppoinmentTitle='';
        this.newAppoinmentDate=new Date();
        localStorage.setItem('appoinment',JSON.stringify(this.appoinments));
      }
    }

    deleteAppoinment(index:number){
      this.appoinments.splice(index,1);
      localStorage.setItem('appoinment',JSON.stringify(this.appoinments));
    }
}
