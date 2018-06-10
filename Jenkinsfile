pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        build 'base-test-framework'
      }
    }
    stage('Test') {
      steps {
        sh 'mvn verify'
      }
    }
    stage('Staging') {
      steps {
        sh 'mvn verify -Dcucumber.options="--tags @regression"'
      }
    }
  }
}