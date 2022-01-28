lazy val root = (project in file("."))
  .settings(
    name := "scala-steward-test",
    libraryDependencies ++= Seq(
      "org.apache.knox" % "gateway-service-knoxsso" % "0.8.0",
      "org.apache.logging.log4j" % "log4j-api" % "2.0.2",
      "org.apache.logging.log4j" % "log4j-core" % "2.0.2"
    )
)
