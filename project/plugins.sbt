
resolvers ++= Seq(
    DefaultMavenRepository,    
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
    "remeniuk repo" at "http://remeniuk.github.com/maven"    
)

addSbtPlugin("play" % "sbt-plugin" % "2.0.2")

libraryDependencies += "org.netbeans" %% "sbt-netbeans-plugin" % "0.1.4"
