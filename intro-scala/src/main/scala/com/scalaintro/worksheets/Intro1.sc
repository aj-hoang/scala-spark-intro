// Strings, Ints, Booleans etc..

val myVal: String = "some string"
var myVar = "some variable"

val myInt = 123
val myDouble = 123d
val myFloat = 123f

val isTrue = true
val isFalse = false

// Lists, Sequences, Sets
val myList = List(1,2,3)
val myListString = List("a", "b", "c")
val mySeq = Seq(1,2,3)

val concatList = myList ++ myList

val mySet = Set(1,1,1,2,3,4,4)

// Maps, flatMap
val myListStringMapped = myListString.map(_.toUpperCase)
val myListStringMapped2 = myListString.map{ theString =>
  theString
}

// Tuple

val myTuple = (isTrue, isFalse)

