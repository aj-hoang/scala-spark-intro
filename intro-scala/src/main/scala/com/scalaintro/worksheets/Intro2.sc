// Options

val optionString: Option[String] = Some("some string")
val optionNoneString: Option[String] = None


// Pattern Matching
optionString match {
  case Some(text) => println("we have some text")
  case _ => println("we have nothing")
}

(optionString, optionNoneString) match {
  case (Some(text1), Some(text2)) => println("both have text")
  case (Some(text), None) => println("left tuple has text")
  case (None, Some(text)) => println("right tuple has text")
  case _ => println("both are empty")
}





