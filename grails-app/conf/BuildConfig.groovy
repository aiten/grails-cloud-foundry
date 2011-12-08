grails.project.class.dir = 'target/classes'
grails.project.test.class.dir = 'target/test-classes'
grails.project.test.reports.dir = 'target/test-reports'
grails.project.docs.output.dir = 'docs/manual' // for backwards-compatibility, the docs are checked into gh-pages branch

grails.project.dependency.resolution = {

	inherits 'global'

	log 'warn'

	repositories {
		grailsPlugins()
		grailsHome()
		grailsCentral()

		mavenLocal()
		mavenCentral()
	}

	dependencies {
		runtime('org.codehaus.jackson:jackson-core-asl:1.4.1')   { transitive = false }
		runtime('org.codehaus.jackson:jackson-mapper-asl:1.4.1') { transitive = false }
	}

	plugins {
		build(':release:1.0.0.RC3') {
			export = false
		}
	}
}
