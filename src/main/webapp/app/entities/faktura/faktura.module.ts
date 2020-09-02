import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

import { Number1SharedModule } from 'app/shared/shared.module';
import { FakturaComponent } from './faktura.component';
import { FakturaDetailComponent } from './faktura-detail.component';
import { FakturaUpdateComponent } from './faktura-update.component';
import { FakturaDeleteDialogComponent } from './faktura-delete-dialog.component';
import { fakturaRoute } from './faktura.route';

@NgModule({
  imports: [Number1SharedModule, RouterModule.forChild(fakturaRoute)],
  declarations: [FakturaComponent, FakturaDetailComponent, FakturaUpdateComponent, FakturaDeleteDialogComponent],
  entryComponents: [FakturaDeleteDialogComponent],
})
export class Number1FakturaModule {}
