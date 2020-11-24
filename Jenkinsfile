   def gv
  pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
        booleanParam(name: 'executeTest', defaultValue: true, description: '')
    }
    enviroment {
        NEW_VERSION = '1.2.0'
        SERVER_CREDENTIALS = credentials('OP') // takes ID REFERENCE
    }

    stages {
        stage('Init') { // used to initialized a groovy script 
            steps {
                script {
                    gv = load "script.groovy"
                }
                echo "${NEW_VERSION}"
            }
        }
        stage('Build') { 
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage('test') { 
                script {
                    gv.testApp()
                }
        }
        stage('Deploy') { 
            steps {
                script {
                    gv.deployApp()
                }
            }
        }
    }
  }
