def call (Map config) {
    if(config.type = "deploy") {
        deployphp();
    }
} 
else {
    pipeline {
        agent any
        stages {
            stage ("salah file") {
                steps {
                    //instruksi dari file di shared-library
                    script {
                        echo("filenya gk ada")
                    }
                }
            }
        }
    }
}