fun main() {
  println("Libs:")

  val foo = ClassLoader.getSystemClassLoader().getResources(
    "org/apache/logging/log4j/util/PropertiesUtil.class"
  )


  foo.asIterator().forEach { s ->
    println(s.toString())
  }
}

