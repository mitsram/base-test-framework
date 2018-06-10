pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            build 'base-test-framework'
          }
        }
        stage('Unit Test') {
          steps {
            sh 'mvn test'
          }
        }
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