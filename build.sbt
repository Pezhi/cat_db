name := """cat_db"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.sorm-framework" % "sorm" % "0.3.18",
  "org.scala-lang" % "scala-swing" % "2.11+",
  jdbc,
  cache,
  ws,
  specs2 % Test
)



resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator


fork in run := true

LessKeys.compress in Assets := true

pipelineStages := Seq(digest)

includeFilter in (Assets, LessKeys.less) := "*.less"

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }