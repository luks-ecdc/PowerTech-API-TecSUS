function get(url){
    let request = new XMLHttpRequest() //Instancia objeto que vai consummir api
    request.open("GET", url, true) //sempre usar true no post - inicia requisição
    request.send() // Envia para api o objeto e converte ele para json
}
