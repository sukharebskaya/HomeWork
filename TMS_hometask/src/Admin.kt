class Admin (val id:Int, var adminName: String,): User() {
    var consumerList: MutableMap<Int,String> = mutableMapOf()

    fun addConsumer(consumer: Consumer): MutableMap<Int, String>{
        var info: String = "${consumer.name} - ${consumer.age}"
        consumerList.put(consumer.id, info)
        return consumerList
    }

    fun printConsumerList(consumerList:MutableMap<Int,String>){
        for (element in consumerList){
            println("Consumer id: ${element.key}, Consumer info: ${element.value}")
        }
    }

}