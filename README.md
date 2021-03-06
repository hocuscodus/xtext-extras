# Eclipse Xtext Extras

This repository contains platform-independent add-ons such as [Xbase](https://www.eclipse.org/Xtext/documentation/305_xbase.html).

## How To Build

Check out and run `./gradlew build`.

Additional command line arguments:
 - `-PcompileXtend=true` activates the [Xtend](http://xtend-lang.org) compiler, but this is optional because the generated Java code is included in the repository.
 - `-PuseJenkinsSnapshots=true` switches to using the Maven repositories generated by the [Jenkins build jobs](http://services.typefox.io/open-source/jenkins/) for [xtext-lib](https://github.com/eclipse/xtext-lib) and [xtext-core](https://github.com/eclipse/xtext-core). Without this argument, [Sonatype snapshots](https://oss.sonatype.org/content/repositories/snapshots) are used.

## Continuous Integration

This project is built by the [xtext-extras multi-branch job on Jenkins](http://services.typefox.io/open-source/jenkins/job/xtext-extras/).
