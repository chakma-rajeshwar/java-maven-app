def buildApp() {
    echo 'building the application...'
}
def testApp() {
    echo 'Testing the Application....'
}
def deployApp() {
    echo 'Deploying the Application.....'
    echo "deploying version ${params.VERSION}"
}

return this
