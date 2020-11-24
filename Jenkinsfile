    pipeline {
    agent any
    enviroment {
    	NEW_VERSION = '1.2.0'
    	SERVER_CREDENTIALS = credentials('OP') // takes ID REFERENCE
    }
    stages {
        stage('Deploy') { 
            steps {
                withCredentials([usernamePassword(credentials: 'OP', usernameVariable: USER, passwordVariable: PWD)]) {
                		echo "username ${USER} password ${PWD}"
                }
            }
        }
    }
  }
