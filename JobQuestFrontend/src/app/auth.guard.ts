import { Injectable } from '@angular/core';
import { CanActivate, Router } from '@angular/router';
import { AuthGuardService } from './services/auth-guard.service';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {

  constructor(private authService: AuthGuardService, private router: Router) {}

  canActivate(): boolean {
    if (!this.authService.isEmployee()) {
      this.router.navigate(['/']);
      return false;
    }
    return true;
  }
}
