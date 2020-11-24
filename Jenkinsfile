pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo "Building the application with Build#: ${BUILD_ID}"
            }
        }
        stage('Test') { 
            when {
               	expression {
               		${BRANCH_NAME}  == 'dev' || ${BRANCH_NAME}  == 'master'
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
