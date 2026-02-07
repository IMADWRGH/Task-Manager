import { Routes } from '@angular/router';



export const routes: Routes = [
    {path: '', redirectTo: 'home', pathMatch: 'full'},
    {path:'login', 
        loadComponent: () => import('./features/account/login/login.component')
        .then(m => m.LoginComponent)
    },  
    {path:'register', 
        loadComponent: () => import('./features/account/register/register.component')
        .then(m => m.RegisterComponent)
    },
    {path:'board', 
        loadComponent: () => import('./features/boards/list/list.component')
        .then(m => m.ListComponent)
    },
    {path:'detail/:id', 
        loadComponent: () => import('./features/boards/detail/detail.component')
        .then(m => m.DetailComponent)
    },
];
