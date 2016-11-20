import sbt._
import Keys._

object Dependencies {
  val scope = "test"

  lazy val core = Seq(
    cats,
    scalatest(scope),
    scalalogging,
    logback
  )

  lazy val flyway = Seq(
      flywayCore,
      mysqlConnectorJava)

  lazy val presentation = core ++ Seq()

  lazy val backend = core ++ Seq(
      bcrypt,
      mysqlConnectorJava,
      scalalikeJdbc)

  // Category Theory
  def cats = "org.typelevel" %% "cats" % "0.7.2"
  def scalatest(scope: String) = "org.scalatest" %% "scalatest" % "2.2.6" % scope
  def scalalogging = "com.typesafe.scala-logging" %% "scala-logging" % "3.4.0"
  def logback = "ch.qos.logback" % "logback-classic" % "1.1.2"

  // Security
  def bcrypt = "org.mindrot" % "jbcrypt" % "0.3m"

  // Database
  def flywayCore = "org.flywaydb" % "flyway-core" % "4.0"

  // NOTE: plugins.sbt has the same version of mysql-connector-java.
  //       Please keep these two versions in sync.
  def mysqlConnectorJava = "mysql" % "mysql-connector-java" % "5.1.36"
  def scalalikeJdbc = "org.scalikejdbc" %% "scalikejdbc" % "2.4.2"
  // def h2database = "com.h2database"  %  "h2" % "1.4.192"
}
