pipeline {
	agent any
	stages {
		stage('AWS login') {
			steps {
				sh "aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 491342662748.dkr.ecr.us-east-1.amazonaws.com"
			}
		}
		stage('AWS ECR push') {
			steps {
				sh "docker push 491342662748.dkr.ecr.us-east-1.amazonaws.com/devops:jenkins"
			}
		}
        	
	}


}
