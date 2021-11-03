pipeline {
    agent any
    tools {
        jdk 'jdk11'
    }
    triggers {
        pollSCM '* * * * *'
    }
    options {
        skipStagesAfterUnstable()
    }
    stages {
        stage('Build') {
            steps {
                sh './mvnw -f rest/pom.xml clean install -DskipTests'
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
