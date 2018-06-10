pipeline {
  agent any
  stages {
    stage('Development') {
      steps {
        build 'base-test-framework'
        sh 'mvn clean'
      }
    }
  }
}