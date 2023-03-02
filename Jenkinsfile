pipeline {
    agent any
    stages {
        stage('Hello') {
            steps {
                sh 'echo "Hello, World!"'
            }
        }
        stage('Permisos') {
            steps {
                sh 'chmod +x gradlew'
            }
        }
        stage('Build') {
            steps {
                sh './gradlew build' 
            }
        }
        stage('SonarLogin') {
            steps {
                sh './gradlew sonarqube -Dsonar.host.url=: http://54.173.113.48:9000/ -Dsonar.login=d34b8bbffc915b7a9ceed84ed54ff9ba2567b98b'
            }
        }
        stage('SonarTest') {
            steps {
                sh './gradlew sonarqube'
            }
        }
    } 
}