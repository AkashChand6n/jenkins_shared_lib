def call(){
	stage('mvn clean package'){
		sh 'mvn clean package'
	}
}
