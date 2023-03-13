package observerDesignPattern

class ObservableImpl(override val observersList: List<Observer>) : ObservableInterface {
    override fun add(observer: Observer) {
        observersList.plus(observer)
    }

    override fun remove(observer: Observer) {
        observersList.minus(observer)
    }

    override fun notifyObserver() {
        observersList.map { observer ->
            observer.update()
        }
    }

    override fun setData() {
        notifyObserver()
    }

    override fun getData() {
        println("GET DATA 1")
    }
}