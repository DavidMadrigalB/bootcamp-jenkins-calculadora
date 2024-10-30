pipeline {
  //agent any
  agent { label 'jdk21' }
   
   tools {
      maven "maven 3.9.9"
   }
  
   parameters {
      string(name: 'ENTRADA', defaultValue:'hola', description:'Parametro requerido')
   }

  stages {
    stage ('ejemplo') {
      steps {
        echo params.ENTRADA
      }
    }
    
    stage('Build') {
      steps {
        bat 'mvn -B -q package'
      }
      post {
        always {
          junit 'target/surefire-reports/*.xml'
        }
      }
    }
/*
    post {
      always {
        mail to: 'madrigal.bd@gmail.com, davidmadrigalbuendia@gmail.com',
          subject: env.JOB_NAME,
          body: currentBuild.currentResult + ': ' + env.BUILD_URL
      }
    }
*/
  }
}
