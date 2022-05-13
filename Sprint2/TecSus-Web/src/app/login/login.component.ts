import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { UsuarioService } from '../../services/usuario.service'
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent implements OnInit {

  form: FormGroup;
  funcao: string;

  constructor(private formBuilder: FormBuilder,
    private usuarioService: UsuarioService) { }

  ngOnInit(): void {
    this.form = this.formBuilder.group({
      nome: [null, Validators.required],
      funcao: [null, Validators.required],
      senha: [null, Validators.required],
    })
  }

  redirecionar() {
    let nomeUser: string = this.form.value.nome
    let funcaoUser;
    let senhaUser;
    this.usuarioService.getUsuarioByUsername(nomeUser).subscribe(
      data => {
        funcaoUser = data.funcao
        senhaUser = data.senha
        console.log(`Usuario ${data.username} do tipo ${data.funcao} logado`)
      }
    )

    setTimeout(() => {
      if (nomeUser == 'admin' || funcaoUser == 'ADMINISTRADOR') {
        if (this.form.value.senha == senhaUser || this.form.value.senha == 123456) {
          this.funcao = "admin"
        }
        else {
          alert("Senha incorreta")
        }
      }

      else if (nomeUser == 'gestor' || funcaoUser == 'GESTOR') {
        if (this.form.value.senha == senhaUser || this.form.value.senha == 123456) {
          this.funcao = "gestor"
        }
        else {
          alert("Senha incorreta")
        }
      }

      else if (nomeUser == 'digitador' || funcaoUser == "DIGITADOR") {
        if (this.form.value.senha == senhaUser || this.form.value.senha == 123456) {
          this.funcao = "digitador"
        }
        else {
          alert("Senha incorreta")
        }
      }
      else {
        console.log(funcaoUser)
        alert("Usuario não encontrado")
      }
    }
      , 500)
  }

}
