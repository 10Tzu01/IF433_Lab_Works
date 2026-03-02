package oop_105327_Nicholas.week5

fun main(){
    val dosen1 = Dosen(nama = "Pak Alex", "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== Aktifitas Pegawai ===")
    for(pegawai in daftarPegawai){
        pegawai.bekerja()
        when(pegawai){
            is Dosen ->{
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin ->{
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-------------------------")
    }

    println("---tugas Mandiri overloading---")
    val math = MathHelper()
    println("\n Luas Pesergi  5 sides = ${math.hitungLuas(5)}")
    println("Luas Pesergi Panjang 5x10 = ${math.hitungLuas(5,10)}")
    println("Luas Lingkaran (r 7.0)= ${math.hitungLuas(7.0)}")

    println("---Tugas Mandiri 2 Payment System ---")
    val myEWallet = EWallet("Stewie Griffin", 50000.0)
    val myCreditCard = CreditCard("Stewie Griffin", 100000.0)

    val paymentList: List<PaymentMethod> = listOf(myEWallet, myCreditCard)

    for (payment in paymentList){
        println("Payment process 75000")
        payment.processPayment(750000.0)

        if(payment is EWallet){
            println("Test Recovery: Add Ewallet")
            payment.topUp(50000.0)
            payment.processPayment(750000.0)
        }

    }



}