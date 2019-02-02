import sbt._

object Versions {
  val springBootWebFluxVersion = "2.1.2.RELEASE"
}

object Dependencies {

  val springBootWebFlux = "org.springframework.boot" % "spring-boot-starter-webflux" % Versions.springBootWebFluxVersion

  val coreDependencies = Seq(springBootWebFlux)

}
