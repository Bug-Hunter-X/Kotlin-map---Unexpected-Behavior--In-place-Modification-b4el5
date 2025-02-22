fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println("Original list: $list")
    println("Doubled list: $doubledList")
}