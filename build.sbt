lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-test",
    libraryDependencies ++= Seq(
      "org.apache.portals.pluto" % "pluto-portal" % "2.0.0"
    )
)
