package observerDesignPattern

class ObserverImpl(
    private val observableInterface: ObservableInterface
):Observer {



    override fun update() {
        observableInterface.getData()
        println("UPDATE")
    }


}