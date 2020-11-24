 def buildApp() {
  	echo "Building the application with Build#: ${BUILD_ID} Version: ${params.VERSION}"
  }

 def testApp() {
   		if (BRANCH_NAME  == 'master' && params.EXECUTE_TEST == true) {
	  		echo "Testting the application on ${BRANCH_NAME}..."
   		}
  }

   def deployApp() {
  	echo "deploying version ${params.VERSION}"
  }

  return this
