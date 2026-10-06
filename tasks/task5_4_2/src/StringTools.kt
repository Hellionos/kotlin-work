// Task 5.4.2: String extension properties
// example: val Int.isOdd: Boolean get() = this % 2 != 0

val String.isTooLong: Boolean get() = this.length > 20