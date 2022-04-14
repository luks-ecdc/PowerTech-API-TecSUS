function redirecionar(){
    const link = document.querySelector('a') //Acessa a tag <a>
    var nome = document.querySelector("#nome"); //Acessa input com id nome
    // A pasta selecionada muda de acordo com o que entrar do input nome
    if (nome.value === "admin"){
         link.href = link.href.replace("link", "../administrador/administrador.html")
    }
    else if(nome.value === "gestor"){
        link.href = link.href.replace("link", "../gestor/gestor.html")
    } 
    else{  
        link.href = link.href.replace("link", "../digitador/digitador.html")
        
    }
}

// function getUrl(url) {
//     let request = new XMLHttpRequest()
//     request.open("GET", url, false)
//     request.send()//caso precise de body
//     return request.responseText
// }

// function verificarLogin() {
//     let nome = document.getElementById("nome").value
//     let senha = document.getElementById("senha").value

//     data = getUrl(`http://localhost:8090/usuarios/${nome}`)
//     usuario = JSON.parse(data) // converte para json

//     if (usuario.senha !== senha){
//         alert("Nome ou senha incorreta")
//     }
//     else{
//         redirecionar()
//     }
    
// }
