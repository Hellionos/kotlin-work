// Task 12.8.2: program to manipulate playing cards

fun main() {
    val cardlist = mutableListOf<Card>()

    for (suit in Card.Suit.values()) {
        for (rank in Card.Rank.values()) {
            cardlist.add(Card(rank, suit))
        }
    }
    cardlist.shuffle()

    var checknum = 0

    for (card in cardlist) {
        println(card.fullName)
        checknum += 1
    }
    println(checknum)
}