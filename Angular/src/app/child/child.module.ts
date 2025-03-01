import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { ChildRoutingModule } from './child-routing.module';
import { RouterModule, Routes } from '@angular/router';
import { ChildComponent } from './child.component';

const routes: Routes = [
  {
    path:'child', component:ChildComponent
  }
];

@NgModule({
   imports: [RouterModule.forRoot(routes),
    CommonModule
   ],
})
export class ChildModule { }
