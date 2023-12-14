//menggunakan parameter
//kita bisa menjalankan file yg kita mau dan tentukan berdasarkan parameternya difolder: vars
//didalam parameter kita bisa tambahkan parameter lainnya
def call(List commands) {//didalam kurung isinya jika ditambah parameter lainnya (String command, parameter2, parameter3) {
    //membuat variabel baru yaitu commands yg akan di redirect nyimpan datanya ke variabel aslinya yaitu: command
    //kemudian function comandnya akan dijalankan dengan instruksi: sh
    //tentukan function > buat perulangan > perulangannya itu menjalankan suatu file/instruksi
    for (command in commands){   
    sh("./mvnw ${command}")
    }
}