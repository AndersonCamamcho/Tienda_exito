pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                sh 'echo "Hello, World!"'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build'
        }
    }
}