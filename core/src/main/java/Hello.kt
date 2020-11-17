// in the runtime classpath the problem does not occur

fun main() {
    val foo = ClassLoader.getSystemClassLoader().getResources(
        "org/apache/logging/log4j/util/PropertiesUtil.class"
    )

    foo.asIterator().forEach { s ->
        println(s.toString())
    }
}
