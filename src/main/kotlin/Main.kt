data class OutputData(val a: Int, val b: Int, val c: Int, val d: Int)
fun main() {
    var finalCost: Int? = null
    while (true) {
        val (a, b, c, d) = consoleRead()
        if ((a in 1..100) && (b in 1..100) && (c in 1..100) && (d in 1..100)) {
            if(d > b)
            {
                finalCost = a+(d-b)*c
            }
            if(d <= b)
            {
                finalCost = a
            }
            println(finalCost)
            break
        }
        else
        {
            println("Некорректный ввод данных. Попробуйте ввести входные значения еще раз.")
        }
    }
}
fun consoleRead(): OutputData {
    val (a, b, c, d) = readLine()!!.split(' ').map(String::toInt)
    return OutputData(a, b, c, d)
}