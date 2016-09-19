import sbt._

object MainBuild extends Build {
  val example1 = Project("play-scala-intro", file("play-scala-intro"))

  val main = Project("play-tutorial", file("."))
    .aggregate(
      example1
      )
}
