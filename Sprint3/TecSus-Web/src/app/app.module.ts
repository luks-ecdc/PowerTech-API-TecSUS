import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { HeaderComponent } from './header/header.component';
import { AdministradorComponent } from './administrador/administrador.component';
import { CadastroClienteComponent } from './administrador/cadastro-cliente/cadastro-cliente.component';
import { CadastroConcessionariaComponent } from './administrador/cadastro-concessionaria/cadastro-concessionaria.component';
import { CadastroContratoComponent } from './administrador/cadastro-contrato/cadastro-contrato.component';
import { InformacaoComponent } from './administrador/informacao/informacao.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { GestorComponent } from './gestor/gestor.component';
import { DigitadorComponent } from './digitador/digitador.component';
import { PerfilComponent } from './gestor/perfil/perfil.component';
import { RelatorioComponent } from './gestor/relatorio/relatorio.component';
import { AddPdfComponent } from './gestor/add-pdf/add-pdf.component';
import { CadastroFaturaComponent } from './digitador/cadastro-fatura/cadastro-fatura.component';
import { HttpClientModule } from '@angular/common/http';
import { PdfViewerModule } from 'ng2-pdf-viewer';
import { LuzComponent } from './digitador/conta/luz/luz.component';
import { AguaComponent } from './digitador/conta/agua/agua.component';
import { GasComponent } from './digitador/conta/gas/gas.component'

import { MatSnackBarModule } from '@angular/material/snack-bar'
import { MatTabsModule } from '@angular/material/tabs';
import { BuscarComponent } from './administrador/buscar/buscar.component';
import { TabelaClienteComponent } from './administrador/buscar/tabela-cliente/tabela-cliente.component';
import { TabelaConcessionariaComponent } from './administrador/buscar/tabela-concessionaria/tabela-concessionaria.component';
import { MatMenuModule } from '@angular/material/menu'
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { TabelaContratoComponent } from './administrador/buscar/tabela-contrato/tabela-contrato.component';
import { MatTooltipModule } from '@angular/material/tooltip';
import { MatDialogModule } from '@angular/material/dialog';
import { DeletarComponent } from './administrador/deletar/deletar.component';
import { BuscarDigitadorComponent } from './digitador/buscar-digitador/buscar-digitador.component';
import { CadastroContaComponent } from './administrador/cadastro-conta/cadastro-conta.component';
import { BuscaGestorComponent } from './gestor/busca-gestor/busca-gestor.component';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    AdministradorComponent,
    CadastroClienteComponent,
    CadastroConcessionariaComponent,
    CadastroContratoComponent,
    InformacaoComponent,
    GestorComponent,
    DigitadorComponent,
    PerfilComponent,
    RelatorioComponent,
    AddPdfComponent,
    CadastroFaturaComponent,
    LuzComponent,
    AguaComponent,
    GasComponent,
    BuscarComponent,
    TabelaClienteComponent,
    TabelaConcessionariaComponent,
    TabelaContratoComponent,
    DeletarComponent,
    BuscarDigitadorComponent,
    CadastroContaComponent,
    BuscaGestorComponent,

  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    PdfViewerModule,
    MatSnackBarModule,
    MatDatepickerModule,
    MatTabsModule,
    MatFormFieldModule,
    MatMenuModule,
    FontAwesomeModule,
    MatTooltipModule,
    MatDialogModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
