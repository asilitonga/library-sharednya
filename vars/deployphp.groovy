//menyimpan kode pipeline di folder: vars menggunakan function
//jangan lupa, buat function: call aja, biar langsung dipanggil
//panggil filenya melalui Jenkinsfile

def call() {
    pipeline {
        agent any
        stages {

            //ditutup dulu
            //stage ("menggunakan parameter"){
                //steps {
                    //script {
                        //echo("clean compile")
                    //}
                //}
            //}

            stage ("menggunakan List parameter") {
                steps {
                    //instruksi dari file di shared-library
                    script {
                        maven (["clean", "compile", "test"])
                    }
                }
            }

            stage ("menggunakan Map Parameter") {
                steps {
                    script {
                        hello.person([
                            firstName:  "Andreas",
                            lastName:   "Silitonga"
                        ])
                    }
                }
            }

            stage ("menggunakan function") {
                steps {
                    script {
                        echo(fungsifunction.name())
                        echo(fungsifunction.role())
                        echo(fungsifunction())
                    }
                }
            }

            stage ("menggunakan folder: resources") {
                steps {
                    script {
                        def variabelnya = libraryResource("filejson/build.json")
                        echo(variabelnya)
                    }
                }
            }


            //menggunakan folder: src (developer)
            stage ("panggil file shared-library srcnya") {
                steps {
                    script {
                        Output.hello(this, "Developer")
                    }
                }
            }

            stage ("panggil file shared-library varsnya") {
                steps {
                //cara panggilnya dengan instruksi SCRIPT: namafile + nama function()
                //dibawah instruksi script kita tinggal panggil namenya BUKAN PAKAI ECHO LAGI
                    script {
                        hello.world()
                    }
                }
            }
        }
    }
} 