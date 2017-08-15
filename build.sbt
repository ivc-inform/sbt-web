lazy val `sbt-web` = project in file(".")

description := "sbt web support"

scalaVersion := "2.12.3"

val zincVersion = "1.0.0"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.5.4",
  "org.webjars" % "webjars-locator-core" % "0.32",
  /*"org.scala-sbt" %% "zinc" % zincVersion,
  "org.scala-sbt" %% "zinc-core" % zincVersion,
  "org.scala-sbt" %% "zinc-compile" % zincVersion,
  "org.scala-sbt" %% "zinc-compile-core" % zincVersion,
  "org.scala-sbt" %% "compiler-interface" % zincVersion,*/
  "org.specs2" %% "specs2-core" % "3.9.4" % "test",
  "junit" % "junit" % "4.12" % "test"
)
