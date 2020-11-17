fun main() {
  println("Hello, World!")

  val foo = ClassLoader.getSystemClassLoader().getResources(
    "org/apache/logging/log4j/util/PropertiesUtil.class"
  )

  foo.asIterator().forEach { s ->
    println(s.toString())
  }
}
