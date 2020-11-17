plugins {
  kotlin("jvm") version "1.3.50"
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
  }
}
