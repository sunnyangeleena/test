pipeline {
	agent any
	stages {
		stage('Java Compile') {
			steps {
				sh "javac Test.java"
			}
		}
		stage('Java Run') {
			steps {
				sh "java Test"
			}
		}
        	
	}
}
