package decorator

class MushroomDecorator(override val basePizza: BasePizza):ToppingsDecorator {

    override fun cost(): Int {
        return 50 + basePizza.cost()
    }
}