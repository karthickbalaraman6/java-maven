pipeline {
agent any


tools {
maven 'MAVEN_HOME'
jdk 'JAVA_HOME'
}


stages {
stage('Checkout') {
steps {
git 'https://github.com/karthickbalaraman6/java-maven.gitt'
}
}


stage('Build WAR') {
steps {
sh 'mvn clean package'
}
}


stage('Build Docker Image') {
steps {
sh 'docker build -t loginapp .'
}
}


stage('Run Docker Container') {
steps {
sh 'docker ps -q --filter name=loginapp && docker stop loginapp || true'
sh 'docker run -d -p 8080:8080 --name loginapp loginapp'
}
}
}
}