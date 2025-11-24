pipeline {
    agent any

    stages {

        stage('Validate Terraform Installation') {
            steps {
                bat 'terraform --version'
            }
        }

        stage('Provision Infrastructure') {
            steps {
                bat 'terraform init'
                bat 'terraform plan'
                bat 'terraform apply -auto-approve'
            }
        }

    }
}
