lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-test",
    libraryDependencies ++= Seq(
      "org.apache.karaf" % "apache-karaf" % "2.1.0" % Test
    )
)
