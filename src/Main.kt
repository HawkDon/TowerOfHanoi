
fun towerOfHanoi(n: Int, start: Char, end: Char, middle: Char) {
    if(n == 1) {
        println("Move disk from $start to $end")
        return
    }
    towerOfHanoi(n-1, start, middle, end)
    println("Move disk $n from $start to $end")
    towerOfHanoi(n-1, middle, end, start)
}

fun main() {
    val disks = 5
    println("Number of disks is $disks")
    towerOfHanoi(disks, 'A', 'C', 'B')
}