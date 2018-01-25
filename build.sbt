lazy val `sbt-web` = project in file(".")

description := "sbt web support"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.9",
  "org.webjars" % "webjars-locator-core" % "0.32",
  "org.specs2" %% "specs2-core" % "3.9.4" % Test,
  "junit" % "junit" % "4.12" % Test
)
