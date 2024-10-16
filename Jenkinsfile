pipeline {
    environment {
        docker_image = ""
    }
    agent any
    stages {
        stage('Stage 1: Git Clone') {
            steps {
                git branch: 'master', url: 'https://github.com/Bambo0st/calculator.git'
            }
        }
        stage('Stage 2: Maven Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Stage 3: Build Docker Image') {
            steps {
                script {
                    docker_image = docker.build("bambo0st/calculator:latest")
                }
            }
        }
        stage('Stage 4: Push Docker Image to Hub') {
            steps {
                script {
                    docker.withRegistry('', 'DockerHubCred') {
                        docker_image.push()
                    }
                }
            }
        }
        stage('Stage 5: Clean Docker Images') {
            steps {
                script {
                    sh 'docker rm -f Calculator || true'
                    sh 'docker rmi $(docker images --filter "dangling=true" --filter "reference=bambo0st/calculator" -q)||true'
                }
            }
        }
        stage('Stage 6: Ansible Deployment') {
            steps {
                ansiblePlaybook(
                    becomeUser: null,
                    colorized: true,
                    credentialsId: 'localhost',
                    disableHostKeyChecking: true,
                    installation: 'Ansible',
                    inventory: 'Deployment/inventory',
                    playbook: 'Deployment/deploy.yml',
                    sudoUser: null
                )
            }
        }
    }
}
