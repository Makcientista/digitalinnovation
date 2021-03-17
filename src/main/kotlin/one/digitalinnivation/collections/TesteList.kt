package one.digitalinnivation.collections

fun main() {
    // instancia três objetos Funcionario cada m com seu nome e seu salarios
    val joao = Funcionario( "João",  2000.0,"CLT")
    val pedro = Funcionario("Pedro",  1500.0, "PJ")
    val maria = Funcionario("Maria",  4000.0,"CLT")

    //Atribuimos a uma lista
    val funcionarios = listOf(joao, pedro, maria)

    // Iterou a lista
    funcionarios.forEach{println(it)}
   // Buscamos somente o user Maria na lista
    println("----------------------------")
    println(funcionarios.find {it.nome == "Maria"})

    println("----------------------------")
    funcionarios.groupBy { it.tipoContrato }
        .forEach{println(it)}

    println("----------------------------")
    funcionarios.sortedBy { it.salario }
        .forEach{println(it)}


}


