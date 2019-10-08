pipeline {
    agent any

    stages {
        stage('clean') {
            steps { 
                echo 'Cleaning..'
                sh 'chmod +x ./gradlew'
                sh './gradlew clean'
            }
        }
        stage('Build') {
            steps {
                echo 'Building..'
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
