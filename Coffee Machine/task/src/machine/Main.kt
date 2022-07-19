package machine

var Water = 400 
var Milk = 540
var Beans = 120
var Cups = 9
var Money = 550

fun main() {
    var stay = true
    while (stay) {
        println("Write action (buy, fill, take): ")
        when (readln()) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> {
                println("I gave you" + " \$" + "$Money")
                Money = 0
            }
            "remaining" -> show()
            "exit" -> stay = false
        }
    }
}
fun buy () {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")
    when (readln()){
        "1" -> check_buy(250, 0, 16, 4)  
        "2" -> check_buy(350, 75, 20, 7)  
        "3" -> check_buy(200, 100, 12, 6)
        "back" -> {}
    }        
}
fun fill () {
    println("Write how many ml of water do you want to add: ")
    Water += readln().toInt()
    println("Write how many ml of milk do you want to add: ")
    Milk += readln().toInt()
    println("Write how many grams of coffee beans do you want to add: ")
    Beans += readln().toInt()
    println("Write how many disposable cups of coffee do you want to add: ")
    Cups += readln().toInt()
}
fun show ( ) {
    println("The coffee machine has:")
    println("$Water ml of water")
    println("$Milk ml of milk")
    println("$Beans g of coffee beans")
    println("$Cups disposable cups")
    println("\$" + "$Money of money")
    
}
fun check_buy (wa: Int, mi: Int, be: Int, mo: Int) {
    if (Water < wa) {
        println("Sorry, not enough water!")
    } else if (Milk < mi) {
        println("Sorry, not enough milk!")
    } else if (Beans < be) {
        println("Sorry, not enough coffee beans!")
    } else if (Cups < 1 ) {
        println("Sorry, not enough cups!")
    } else {
        println("I have enough resources, making you a coffee!")
        Water -= wa
        Milk -= mi
        Beans -= be
        Money += mo
        Cups--
    }
}