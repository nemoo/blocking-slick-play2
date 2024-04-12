name := """blocking-slick-play2"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.12"

libraryDependencies ++= Seq(
  guice,
  "com.github.takezoe" %% "blocking-slick" % "0.0.14",
  "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test,
  "com.h2database" % "h2" % "1.4.192",
  "com.typesafe.play" %% "play-slick" % "5.1.0"
)

ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
)
