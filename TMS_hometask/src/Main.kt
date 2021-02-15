fun main(args: Array<String>){
    val consumer1 = Consumer(1,"Andrew",20)
    val consumer2 = Consumer(2,"Bob",23)
    val consumer3 = Consumer(3,"Victor", 55)
    val consumer4 = Consumer(4,"Greg", 78)

    val admin1 = Admin(1, "Admin1")
    val admin2 = Admin(2, "Admin2")

    admin1.addConsumer(consumer1)
    admin1.addConsumer(consumer2)

    admin2.addConsumer(consumer3)
    admin2.addConsumer(consumer4)

    admin1.printConsumerList(admin1.consumerList)
    admin2.printConsumerList(admin2.consumerList)

}