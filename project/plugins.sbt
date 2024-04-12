// The Play plugin
addSbtPlugin("org.playframework" % "sbt-plugin" % "3.0.0")

ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
)
