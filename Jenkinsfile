pipeline {
    agent any

    stages {
        stage('Clone Code') {
            steps {
                git 'https://github.com/arsalan9997/Rahul-Git.git'
            }
        }

        stage('Build App') {
            steps {
                sh 'mvn -f pom.xml clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t student1-app .'
            }
        }

        stage('Run with Docker Compose') {
            steps {
                sh 'docker compose up -d --build'
            }
        }
    }
}
