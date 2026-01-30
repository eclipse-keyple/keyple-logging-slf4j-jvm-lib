rootProject.name = "keyple-logging-slf4j-jvm-lib"

pluginManagement {
  repositories {
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    mavenLocal()
    maven(url = "https://central.sonatype.com/repository/maven-snapshots")
  }
}
