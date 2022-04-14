function post(url, body){
    let request = new XMLHttpRequest() //Instancia objeto que vai consummir api
    request.open("POST", url, true) //sempre usar true no post - inicia requisição
    request.setRequestHeader("Content-type", "application/json") //indica o tipo de conteudo que é enviado
    request.send(JSON.stringify(body)) // Envia para api o objeto e converte ele para json

    request.onload = function() {
        console.log(this.responseText)
    }
    return request.responseText
}

function criarCliente(){
    event.preventDefault() // Evita carregamento da página
    url = "http://localhost:8090/cliente"
    //Pegando valores do html

    let nome = document.getElementById("nome").value
    let cpf = document.getElementById("cpf").value
    let cep = document.getElementById("cep").value
    let endereco = document.getElementById("endereco").value
    let complemento = document.getElementById("complemento").value

    // Chave de body tem que ser igual está retornando com  spring
    body = {
        // "id": 1,
        "nome": nome,
        "cpf": cpf,
        "cep": cep,
        "endereco": endereco,
        "complemento": complemento,
    }
    
    post(url,body)
}

