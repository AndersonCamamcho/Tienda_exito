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
                sh 'chmod +x gradlew'
            }
            steps {
                sh './gradlew bootJar' 
            }
        }
    }
}