import java.util.Scanner

fun main() {
    val entrada=Scanner (System.`in`)

    val unidadeInicial:Float
    val unidadeFinal:Float

    val tiposConversao:Int
    val destinoUnidades:Int
    println("Qual a grandeza que você deseja converter: ")
    println("1-Temperatura\n2-Distância\n3-Tempo")
    tiposConversao=entrada.nextInt()
    if (tiposConversao==1){
        println("Informe a unidade de origem e a unidade final: ")
        println("1-(°C -> °F)\n2-(°F -> °C)")
        destinoUnidades=entrada.nextInt()
        when(destinoUnidades){
            1-> {
                println("Informe a temperatura em graus Celsius: ")//C->F
                unidadeInicial=entrada.nextFloat()//C
                unidadeFinal=(unidadeInicial * 1.8f) + 32//F
                print("$unidadeInicial°C = $unidadeFinal°F")
            }
            2-> {
                println("Informe a temperatura em Fahrenheit: ")//F->C
                unidadeInicial=entrada.nextFloat()//F
                unidadeFinal=((unidadeInicial-32)/1.8f) //C
                print("$unidadeInicial°F = $unidadeFinal°C")
            }
            else -> println("Número inválido")
        }
    } else if (tiposConversao==2){ //DISTÂNCIA
        println("Informe a unidade de origem e a unidade final: ")
        println("1-(km -> m)\n2-(m -> km)")
        destinoUnidades=entrada.nextInt()
        when(destinoUnidades){
            1->{
                println("Informe a distância em km:")//km->m
                unidadeInicial=entrada.nextFloat() //km
                unidadeFinal=unidadeInicial*1000 //m
                print("$unidadeInicial km = $unidadeFinal m ")
            }
            2->{
                println("Informe a distância em metros: ") //m->km
                unidadeInicial=entrada.nextFloat()//m
                unidadeFinal=unidadeInicial/1000 //km
                print("$unidadeInicial m = $unidadeFinal km ")
            }
            else -> println("Número inválido")
        }
    } else if (tiposConversao==3){//TEMPO
        println("Informe a unidade de origem e a unidade final: ")
        println("1 - (horas -> minutos)\n2 - (minutos -> horas)")
        destinoUnidades=entrada.nextInt()
        when (destinoUnidades){
            1->{
                println("Informe o tempo em horas: ")//horas -> minutos
                unidadeInicial=entrada.nextFloat() //horas
                unidadeFinal=unidadeInicial*60 //minutos
                print("$unidadeInicial h = $unidadeFinal min")
            }
            2->{
                println("Informe o tempo em minutos: ")//minutos->horas
                unidadeInicial=entrada.nextFloat() //minutos
                unidadeFinal=unidadeInicial/60 //horas
                print("$unidadeInicial min = $unidadeFinal h")
            }
            else-> println("Número inválido")
        }
    } else{//VALOR INVÁLIDO
        println("Foi informado um valor inválido")
    }
}