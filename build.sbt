import _root_.sbt.Keys._

name := "FreeVSTsearch"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4",
  "org.scala-lang.modules" %% "scala-xml" %  "1.0.4",
  "org.scala-lang.plugins" %% "scala-continuations-library" % "1.0.1"
  /*
  "com.typesafe.slick" %% "slick" % "1.0.0",
  "org.slf4j" %% "slf4j-nop" % "1.6.4",
  "com.h2database" %% "h2" % "1.3.166",
  "com.github.tototoshi" %% "slick-joda-mapper" % "0.1.0"
  */
)