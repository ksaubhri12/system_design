package decorator

class PizzaApplication {

    fun createPizzaWithToppingsAndReturnCost():Int{
        val basePizza = MargaritaBasePizza()
        val cheeseBasePizza = ExtraCheeseDecorator(basePizza)
        val mushroomDecorator = MushroomDecorator(cheeseBasePizza)
        val cheese = ExtraCheeseDecorator(mushroomDecorator)
        return cheese.cost()
    }

}


fun main() {
    println(PizzaApplication().createPizzaWithToppingsAndReturnCost())

}