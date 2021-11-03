pipeline {
    agent { docker { image 'maven:3.8.3' } }
    stages {
        stage('Build') {
            steps {
                echo 'Building'
                sh "build"
            }
        }
        stage('Test') {
            steps {
                echo 'Testing'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying'
            }
        }
    }
}
