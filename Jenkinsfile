#!groovy
@Library("Reform")
import uk.gov.hmcts.Ansible
import uk.gov.hmcts.Packager
import uk.gov.hmcts.RPMTagger

def rtMaven = Artifactory.newMavenBuild()

properties([
        [$class: 'GithubProjectProperty', displayName: 'Fees Register API performance tests', projectUrlStr: 'https://git.reform.hmcts.net/fees-register/fees-register-app-performance-tests']
])

lock('Fees Register API performance tests') {
    node {
        try {
            stage('Run performance tests') {
                deleteDir()
                checkout scm
                rtMaven.tool = 'apache-maven-3.3.9'
                rtMaven.run pom: 'pom.xml', goals: 'clean gatling:execute'

                publishHTML([
                        allowMissing         : false,
                        alwaysLinkToLastBuild: false,
                        keepAll              : true,
                        reportDir            : 'target/gatling/results/*/',
                        reportFiles          : 'index.html',
                        reportName           : 'Performance Test Report'
                ])
            }

        } catch (err) {
            notifyBuildFailure channel: '#cc-payments-tech'
            throw err
        }
    }
}
