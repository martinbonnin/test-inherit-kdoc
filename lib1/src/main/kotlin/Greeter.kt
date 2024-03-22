interface Greeter {
  /**
   * Says hello 👋
   *
   * @return a string that says hello
   */
  fun hello(): String
}

class EnglishGreeter: Greeter {
  override fun hello(): String {
    return "Hello \uD83D\uDC4B"
  }
}