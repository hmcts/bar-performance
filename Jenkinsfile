#!groovy
@Library("Reform")
import uk.gov.hmcts.Ansible
import uk.gov.hmcts.Packager
import uk.gov.hmcts.RPMTagger

def packager = new Packager(this, 'cc')
def ansible = new Ansible(this, 'ccfr')
def rtMaven = Artifactory.newMavenBuild()
RPMTagger rpmTagger = new RPMTagger(this, 'fees-register-api', packager.rpmName('fees-register-api', params.rpmVersion), 'cc-local')

properties([
        [$class: 'GithubProjectProperty', displayName: 'Fees Register API performance tests', projectUrlStr: 'https://git.reform.hmcts.net/fees-register/fees-register-app-performance-tests'],
        parameters([string(defaultValue: '', description: 'RPM Version', name: 'rpmVersion')])
])

lock('Fees Register API performance tests') {
    node {
        try {
            def deploymentRequired = !params.rpmVersion.isEmpty()
            def version = "{fees_register_api_version: ${params.rpmVersion}}"

            if (deploymentRequired) {
                stage('Deploy to Dev') {
                    ansible.runDeployPlaybook(version, 'dev')
                    rpmTagger.tagDeploymentSuccessfulOn('dev')
                }
            }

            stage('Run performance tests') {
                deleteDir()
                checkout scm
                rtMaven.tool = 'apache-maven-3.3.9'
                rtMaven.run pom: 'pom.xml', goals: 'clean gatling:execute'

                publishHTML([
                        allowMissing         : false,
                        alwaysLinkToLastBuild: true,
                        keepAll              : false,
                        reportDir            : 'target/gatling/results',
                        reportFiles          : 'index.html',
                        reportName           : 'Performance Test Report (dev)'
                ])
            }


        } catch (err) {
            notifyBuildFailure channel: '#cc-payments-tech'
            throw err
        }
    }
}