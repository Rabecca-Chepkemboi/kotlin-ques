fun main(){
    var a = Queue(6)
    a.enqueue(4)
    a.enqueue(5)
    a.enqueue(6)
    a.enqueue(7)
    a.dequeue()
    a.dequeue()
    a.enqueue(1)
    a.enqueue(2)
    a.enqueue(3)
    a.enqueue(4)
    a.enqueue(5)
    a.enqueue(6)
    a.enqueue(7)
    a.display()
}
class Queue(var capacity: Int){
    var data = IntArray(capacity)
    var front = 0
    var rear = 0

    fun enqueue(item: Int){
        if(isFull()){
            println("queue is full")
            return
        }
        data[rear] = item
        rear ++

    }
    fun dequeue():Int?{
        if (isEmpty()){
            println("queue is empty")
            return null
        }
        var removed = data[front]
        for (i in front until rear-1){
            data[i] = data[i + 1]
        }
        rear --
        return removed

    }
    fun isEmpty():Boolean{
        return rear == front

    }
    fun isFull():Boolean{
        return rear == capacity

    }
    fun peek(): Int?{
        if (isEmpty()){
            return null
        }
        return data[front]

    }
    fun display(){
        if (isEmpty()){
            println("queue is empty")
        }
        for (i in front until rear){
            println(data[i])
        }

    }
}
