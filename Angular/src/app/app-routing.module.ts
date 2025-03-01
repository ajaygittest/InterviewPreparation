import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { ChildModule } from './child/child.module';
import { UpperCasePipe } from './upper-case.pipe';

const routes: Routes = [
  {path:'',component:ParentComponent},
  { path: 'child', loadChildren: () => import('./child/child.module').then(m => m.ChildModule) }
];

@NgModule({
  imports: [RouterModule.forRoot(routes), ChildModule],
  exports: [RouterModule]
})
export class AppRoutingModule { }
