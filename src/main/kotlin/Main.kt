import kotlin.random.Random

fun main(args: Array<String>) {
    println("")
    val d = DecimalClass()
    println(d.toString())
    println("PlanesTrainsAutomobiles")
    val p = PlanesTrainsAutomobiles()
    println("Incrementing")
    p.increment()
    println("Time to destination: ${p.timeToDestination} and SteveMartinIrritationIndex: ${p.steveMartinIrritationIndex}")
    p.increment()
    println("Time to destination: ${p.timeToDestination} and SteveMartinIrritationIndex: ${p.steveMartinIrritationIndex}")

    val customer = RewardMiles("Thomas", 10000)
    println(customer)

    val stringList = mutableListOf<String>()
    stringList.add("12")
    stringList.add("1.2")
    stringList.add("1,2")
    stringList.add("1.2e0")
    stringList.add("1.2e1")
    stringList.add("1.2e2")
    stringList.add("1.2e3")
    stringList.add("1.2e10")
    stringList.add("12.3e10")
    stringList.add("1.2e-1")
    stringList.add("1.2e-10")
    println("Size of list is ${stringList.size}")
    for (item in stringList){
        try {
            println("Converting ${item} to Double")
            item.toDouble()
        }
        catch (e: NumberFormatException){
            println(e)
        }

    }

    val customerMap = mutableMapOf<String, Customer>()
    customerMap["Tom"] = Customer("Tom", 13266,5206, 7448)
    customerMap["Harry"] = Customer("Harry", 17820, 10548, 1472)
    customerMap["Sally"] = Customer("Sally", 14210, 7672, 12808)
    println(customerMap.toString())


    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}

class DecimalClass(){
    private val d: Double = 0.0
    override fun toString(): String {
        return "Value of DecimalClass($d)"
    }

}

class PlanesTrainsAutomobiles(){
    var timeToDestination: Int = 0
    var steveMartinIrritationIndex: Int = 0

    fun increment(){
        timeToDestination++
        steveMartinIrritationIndex += Random.nextInt(1,3)
    }
}

class RewardMiles(
    val nameOfCustomer: String,
    val miles: Int
) {
    override fun toString(): String {
        return "RewardMiles(nameOfCustomer='$nameOfCustomer', miles=$miles)"
    }
}

class Customer(var name: String, var checking: Int, var savings: Int, var IRA: Int){
    fun totalNetWorth(): Int = checking + savings + IRA
    override fun toString(): String {
        return "Customer(name='$name', checking=$checking, savings=$savings, IRA=$IRA, Total Net Worth =${totalNetWorth()}"
    }

}

/*enum class Accounts{
    Checking, Savings, IRA
}*/
