import './vendor.ts';

import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { Ng2Webstorage } from 'ng2-webstorage';
import {NgxChartsModule} from 'ngx-charts';

import { LablicatedemoSharedModule, UserRouteAccessService } from './shared';
import { LablicatedemoHomeModule } from './home/home.module';
import { LablicatedemoAdminModule } from './admin/admin.module';
import { LablicatedemoAccountModule } from './account/account.module';

import { customHttpProvider } from './blocks/interceptor/http.provider';

import {
    JhiMainComponent,
    LayoutRoutingModule,
    NavbarComponent,
    FooterComponent,
    ProfileService,
    ActiveMenuDirective,
    ErrorComponent
} from './layouts';

@NgModule({
    imports: [
        BrowserModule,
        LayoutRoutingModule,
        Ng2Webstorage.forRoot({ prefix: 'jhi', separator: '-'}),
        LablicatedemoSharedModule,
        LablicatedemoHomeModule,
        LablicatedemoAdminModule,
        LablicatedemoAccountModule,
        NgxChartsModule
    ],
    declarations: [
        JhiMainComponent,
        NavbarComponent,
        ErrorComponent,
        ActiveMenuDirective,
        FooterComponent
    ],
    providers: [
        ProfileService,
        customHttpProvider(),
        UserRouteAccessService
    ],
    bootstrap: [ JhiMainComponent ]
})
export class LablicatedemoAppModule {}
