resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"
resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"
resolvers += "Flyway" at "https://flywaydb.org/repo"

addSbtPlugin("org.flywaydb" % "flyway-sbt" % "4.0.3")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.0")

// NOTE: backend/build.sbt has the same version of mysql-connector-java.
//       Please keep these two versions in sync.
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.36"
