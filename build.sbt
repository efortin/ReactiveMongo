// scalacOptions ++= Seq("-Xlog-implicits")

scalacOptions in (Compile, doc) ++= Opts.doc.title("ReactiveMongo API")

scalacOptions in (Compile, doc) ++= Opts.doc.version("0.9-SNAPSHOT")

localRepo := Path.userHome / "github" / "repo

githubRepo := "https://github.com/efortin/mvn-repo.git"