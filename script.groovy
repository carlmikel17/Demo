 def buildApp() {
  	echo "Building the application with Build#: ${BUILD_ID} Version: ${params.VERSION}"
  }

 def deployApp() {
  	echo "deploying version ${params.VERSION}"
  }

  return this
