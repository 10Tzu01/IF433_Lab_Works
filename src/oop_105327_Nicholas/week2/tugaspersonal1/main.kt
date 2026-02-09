package oop_105327_Nicholas.week2.tugaspersonal1

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    print("Input book title: ")
    val title = scanner.nextLine()

    print("Input booker's name: ")
    val borrower = scanner.nextLine()

    print("Input duration(days): ")
    var duration = scanner.nextInt()

    if (duration<0){
            duration = 1
    }

    val loan = Loan(title, borrower, duration)

    println("\n=== Details ===")
    println("Book title  : ${loan.bookTitle}")
    println("Borrowed    : ${loan.borrower}")
    println("Duration  : ${loan.loanDuration} hari")
    println("Total Fine : Rp ${loan.calculateFine()}")
}