import Dependencies._

ThisBuild / scalaVersion     := "2.13.1"
ThisBuild / version          := "0.1.0"
ThisBuild / organization     := "com.bp2s"
ThisBuild / organizationName := "bp2s"

lazy val root = (project in file("."))
  .settings(
    name := "k8-sftp-push",
    libraryDependencies ++= Seq(
      benji,
      catsEffect,
      kafkaStream,
      scalaTest % Test,
      slf4j,
      sshd
    )
  )

fork in run := true
mainClass in Compile := Some("bp2s.Main")