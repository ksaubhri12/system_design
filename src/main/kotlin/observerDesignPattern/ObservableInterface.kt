package observerDesignPattern

interface ObservableInterface {

    val observersList: List<Observer>

    fun add(observer: Observer)

    fun remove(observer: Observer)

    fun notifyObserver()

    fun setData()

    fun getData()

}