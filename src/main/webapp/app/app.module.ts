import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { Number1SharedModule } from 'app/shared/shared.module';
import { Number1CoreModule } from 'app/core/core.module';
import { Number1AppRoutingModule } from './app-routing.module';
import { Number1HomeModule } from './home/home.module';
import { Number1EntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ActiveMenuDirective } from './layouts/navbar/active-menu.directive';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    Number1SharedModule,
    Number1CoreModule,
    Number1HomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    Number1EntityModule,
    Number1AppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, ActiveMenuDirective, FooterComponent],
  bootstrap: [MainComponent],
})
export class Number1AppModule {}
