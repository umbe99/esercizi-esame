import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

const routes: Routes = [
 /*{​​ path: 'HomePage', component: HomePageComponent }​​,

{path: '', redirectTo: '/HomePage', pathMatch: 'full'} */];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
