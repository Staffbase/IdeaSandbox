import kotlin.test.Test
import kotlin.test.assertEquals

class DependencyTest {

    // running this test with gradle resolves the dependencies to only one version
    // running the test with the IDEA runner, will leave two dependency versions in the classpath
    // you can change this in Preferences
    //      -> Build, Execution, Deployment
    //      -> Build Tools
    //      -> Gradle
    //      -> Build and run using / run tests using
    @Test
    fun `dependency resolving`() {
        val foo = ClassLoader.getSystemClassLoader().getResources(
            "org/apache/logging/log4j/util/PropertiesUtil.class"
        )

        val dependencyCount = foo.asSequence().fold(0) { count, dep ->
            (count + 1).also {
                println(dep.toString())
            }
        }

        // we expect to only have one version of the dependency
        assertEquals(actual = dependencyCount, expected = 1)
    }
}