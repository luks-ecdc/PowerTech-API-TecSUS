import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdministradorComponent } from './administrador/administrador.component';
import { BuscarComponent } from './administrador/buscar/buscar.component';
import { CadastroClienteComponent } from './administrador/cadastro-cliente/cadastro-cliente.component';
import { CadastroConcessionariaComponent } from './administrador/cadastro-concessionaria/cadastro-concessionaria.component';
import { CadastroContaComponent } from './administrador/cadastro-conta/cadastro-conta.component';
import { CadastroContratoComponent } from './administrador/cadastro-contrato/cadastro-contrato.component';
import { InformacaoComponent } from './administrador/informacao/informacao.component';
import { BuscarDigitadorComponent } from './digitador/buscar-digitador/buscar-digitador.component';
import { CadastroFaturaComponent } from './digitador/cadastro-fatura/cadastro-fatura.component';
import { AguaComponent } from './digitador/conta/agua/agua.component';
import { GasComponent } from './digitador/conta/gas/gas.component';
import { LuzComponent } from './digitador/conta/luz/luz.component';
import { DigitadorComponent } from './digitador/digitador.component';
import { AddPdfComponent } from './gestor/add-pdf/add-pdf.component';
import { GestorComponent } from './gestor/gestor.component';
import { PerfilComponent } from './gestor/perfil/perfil.component';
import { RelatorioComponent } from './gestor/relatorio/relatorio.component';
import { LoginComponent } from './login/login.component';

const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  {
    path: 'admin', component: AdministradorComponent,
    children: [
      { path: 'informacao', component: InformacaoComponent },
      { path: 'cadastro-cliente', component: CadastroClienteComponent },
      { path: 'cadastro-contrato', component: CadastroContratoComponent },
      { path: 'cadastro-concessionaria', component: CadastroConcessionariaComponent },
      { path: 'cadastro-conta', component: CadastroContaComponent },
      { path: 'buscar', component: BuscarComponent ,}
    ]
  },
  {path: 'gestor', component: GestorComponent,
    children: [
      {path: 'perfil', component: PerfilComponent},
      {path: 'relatorio', component: RelatorioComponent},
      {path: 'pdf', component: AddPdfComponent},
    ]
  },
  { path: 'digitador', component: DigitadorComponent ,
  children: [
    {path: 'cadastro-fatura', component: CadastroFaturaComponent,
      children: [
        {path: 'luz', component: LuzComponent},
        {path: 'agua', component: AguaComponent},
        {path: 'gas', component: GasComponent},
      ]}
      ,{path: 'buscar-digitador', component: BuscarDigitadorComponent}
  ]},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
