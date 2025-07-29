pipeline {
    agent any
    tools {
        maven 'Maven 3' // Name you configured in Jenkins
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url: '<your-repo-url>'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('Local SonarQube') {
                    sh 'mvn clean verify sonar:sonar'
                }
            }
        }
    }
}
