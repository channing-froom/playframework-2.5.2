name := """playframework-2.5.2-java"""

version := "1.0-SNAPSHOT"



lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

// http://mvnrepository.com/artifact/com.typesafe.play/play_2.11
libraryDependencies += "org.hibernate" % "hibernate-entitymanager" % "3.6.9.Final"

// http://mvnrepository.com/artifact/mysql/mysql-connector-java
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  jdbc
)
