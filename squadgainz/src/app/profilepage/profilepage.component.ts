// profilepage.component.ts
import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service'; // Ensure this is correct
import { CommonModule } from '@angular/common'; // For ngIf and other common directives

@Component({
  selector: 'app-profilepage',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './profilepage.component.html',
  styleUrls: ['./profilepage.component.css']
})
export class ProfilepageComponent implements OnInit {
  message: string = 'Profile Page. Welcome';
  user: any; // Single user object

  constructor(private userService: UserService) {}

  ngOnInit(): void {
    this.userService.getUserData().subscribe((data: any[]) => {
      // Handle array response, use first item or handle if empty
      this.user = data.length > 0 ? data[0] : null;
    }, error => {
      console.error('Error fetching data:', error);
      this.user = null; // Ensure user is null if there's an error
    });
  }
}