pipeline {
    agent any 
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0'], description: '')
        booleanParam(name: 'EXECUTE_TEST', defaultValue: true, description: '')
    }
    stages {
        stage('Build') { 
            steps {
                echo "Building the application with Build#: ${BUILD_ID}"
            }
        }
        stage('Test') { 
            when {
               	expression {
               		BRANCH_NAME  == 'master' && params.EXECUTE_TEST == true
               	}
            }
            steps
            {
                echo "Testting the application on ${BRANCH_NAME}..."
            }
        }
        stage('Deploy') { 
            steps {
                echo "Deploying the application..."
            }
        }
    }
  }
