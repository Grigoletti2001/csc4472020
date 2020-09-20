name := "CSC447"

version := "1.0"

scalaVersion := "2.13.1"

scalacOptions ++= 
  Seq("-deprecation",
      "-feature",
      "-target:jvm-1.8",
      "-unchecked")

resolvers ++= Seq(
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases"
)

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.1.0"  % "test",
  "org.scalacheck" %% "scalacheck" % "1.14.3" % "test"
)
