//menggunakan parameter
//kita bisa menjalankan file yg kita mau dan tentukan berdasarkan parameternya difolder: vars
//didalam parameter kita bisa tambahkan parameter lainnya
def call(String command)//didalam kurung isinya jika ditambah parameter lainnya (String command, parameter2, parameter3) {
    sh("./mvnw ${command}")