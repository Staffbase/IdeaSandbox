plugins {
    kotlin("jvm") version "1.4.0"
}

allprojects {
    apply {
        plugin("org.jetbrains.kotlin.jvm")
    }

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib-jdk8"))
        testImplementation(kotlin("test"))
        testImplementation("org.jetbrains.kotlin:kotlin-test-junit:1.4.0")
    }
}
