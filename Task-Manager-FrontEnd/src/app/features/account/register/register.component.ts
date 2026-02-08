import { Component, inject } from '@angular/core';
import { NonNullableFormBuilder, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-register',
  standalone: true,
  imports:   [
    MatInputModule,
    MatButtonModule,
    ReactiveFormsModule,
    MatCardModule,
    RouterLink,
    
  ],
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {
register() {
throw new Error('Method not implemented.');
}
  fb= inject(NonNullableFormBuilder)
  registerForm=this.fb.group({
    email:this.fb.control(['',Validators.required, Validators.email]),
    password:this.fb.control(['',Validators.required, Validators.minLength(8)]),
    firstName:this.fb.control('',Validators.required),
    lastName:this.fb.control('',Validators.required),
  })
}
