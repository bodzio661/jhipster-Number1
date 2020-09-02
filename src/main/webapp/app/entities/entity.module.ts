import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'faktura',
        loadChildren: () => import('./faktura/faktura.module').then(m => m.Number1FakturaModule),
      },
      {
        path: 'kontrachent',
        loadChildren: () => import('./kontrachent/kontrachent.module').then(m => m.Number1KontrachentModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class Number1EntityModule {}
