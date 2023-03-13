package decorator

class ExtraCheeseDecorator(override val basePizza: BasePizza) :ToppingsDecorator {

    override fun cost(): Int {
        return 100 + basePizza.cost()
    }
}