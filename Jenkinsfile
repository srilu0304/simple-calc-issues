pipeline {
    agent any

    tools {
        maven 'Maven 3'   // Use the Maven name you configured under Jenkins -> Global Tool Configuration
    }

    stages {
        stage('Checkout') {
            steps {
                // Replace with your repo URL
                git branch: 'master', url: 'https://github.com/srilu0304/simple-calc-issues.git'
            }
        }

        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('Local SonarQube') { 
                    bat 'mvn clean verify sonar:sonar'
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline finished'
        }
    }
}
