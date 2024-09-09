import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProfilepageComponent } from './profilepage/profilepage.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterModule,DashboardComponent,ProfilepageComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'squadgainz';
}
