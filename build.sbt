import Dependencies._

lazy val root = (project in file("."))
                  .settings(
                    name := "es",
                    scalaVersion := "2.12.8",
                    organization := "com.bheaver",
                    version := "0.0.1",
                    libraryDependencies ++= coreDependencies
                  )