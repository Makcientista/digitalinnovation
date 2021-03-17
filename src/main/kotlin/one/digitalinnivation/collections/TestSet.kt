package one.digitalinnivation.collections

fun main() {
    // instancia três objetos Funcionario cada m com seu nome e seu salarios
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    //Alocar em dois conjuntos
    val funcionarios1 = setOf(joao, pedro)
    val funcionarios2 = setOf(maria)

    //Relatorio união
    println("+++++++++++União de Conjunto+++++++++++++++++")
    val resulUnion = funcionarios1.union(funcionarios2)
    resulUnion.forEach { println(it)}

        //Retirar funcionarios que estiver no conjunto 2
        println("+++++++++Subtrair conjunto funcionario2(Maria) do conjunto funcionario3 +++++++++++++++++++")
        val funcionarios3 = setOf(joao, pedro, maria)
        val resultSubtract = funcionarios3.subtract(funcionarios2)
        resultSubtract.forEach { println(it) }

    // Intercessão ou o que é comum entre os dois conjuntos
    println("+++++++++++Interessão do conjunto funcionarios3 e funcionarios2 +++++++++++++++++")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it) }
    }

