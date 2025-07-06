// src/app/app.component.ts
import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';
import { MessagesComponent } from './messages/messages.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterModule, MessagesComponent],
  templateUrl: './app.component.html',  // ← テンプレート名も慣例に
  styleUrls:  ['./app.component.css']
})
export class AppComponent {
  title = 'Tour of Heroes';
}
