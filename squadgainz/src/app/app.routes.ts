import { RouterModule, Routes } from '@angular/router';
import { NgModule } from '@angular/core';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProfilepageComponent } from './profilepage/profilepage.component';

export const routes: Routes = [
  { path: 'home', component: DashboardComponent },
  { path: 'profile', component: ProfilepageComponent },
  { path: '', redirectTo: '/home', pathMatch: 'full' },  // Default to 'home'
  { path: '**', redirectTo: '/home' }  // Wildcard route for any other path
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }