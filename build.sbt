lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-test",
    libraryDependencies ++= Seq(
      "org.apache.logging.log4j" % "log4j-api" % "2.0.2",
      "org.apache.logging.log4j" % "log4j-core" % "2.0.2"
    )
)
