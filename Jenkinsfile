def gv
  pipeline {
    agent any
    parameters {
    	choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
    	booleanParam(name: 'executeTest', defaultValue: true, description: '')
    }

    stages {
    	stage('Init') { // used to initialized a groovy script 
            steps {
            	script {
            		gv = load "script.groovy"
            	}
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
