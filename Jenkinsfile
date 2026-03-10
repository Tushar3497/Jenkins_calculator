pipeline {

    agent any

    tools {
        maven 'Maven'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout') {
            steps {
             git branch: 'main',url: 'https://github.com/Tushar3497/Jenkins_calculator'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
            }
         
         
        }

        stage('Run JUnit Tests') {
            steps {
                bat 'mvn test'
            }
        }

       stage('SonarQube Analysis') {
          steps {
          withSonarQubeEnv('SonarServer') {
    sh 'mvn sonar:sonar'
}
    }
}

    }
}