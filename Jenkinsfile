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
        build 'easyweather-test'
      }
    }
    stage('Staging') {
      steps {
        sh 'mvn verify -Dcucumber.options="--tags @regression"'
      }
    }
  }
}