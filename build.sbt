lazy val `sbt-web` = project in file(".")

sbtPlugin := true

organization := "com.typesafe.sbt"

description := "sbt web support"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.4",
  "org.webjars" % "webjars-locator-core" % "0.32",
  "org.specs2" %% "specs2-core" % "3.9.4" % "test",
  "junit" % "junit" % "4.12" % "test"
)
