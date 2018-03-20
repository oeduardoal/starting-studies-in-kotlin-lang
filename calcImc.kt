fun main(args: Array<String>){
    var kg, altura, imc

    println("Digite seu peso")
    kg = readLine()

    println("Digite sua altura")
    altura = readLine()

    imc = kg / altura * altura

    if(imc < 18.5){
        println("Seu IMC é $imc e está abaixo da média.")
    }else if(imc >= 18.5 && imc <=24.9){
        println("Seu IMC é $imc e está na média.")
    }else if(imc >= 25.0 && imc <=29.9){
        println("Seu IMC é $imc e está sobrepeso.")
    }else if(imc >= 30){
        println("Seu IMC é $imc e está obeso.")
    }else{
        println("Valor inválido no calculo")
    }

}