Creating a space to save misc. Kotlin code and notes as I go through tutorial projects:

REMEMBER TO COMMENT YOUR CODE!!!!

_____________________________________

04/15/2022

//COMMENT YOUR CODE!

fun main (){
    val age = 24
    val layers = 5
      
    printCakeCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
    
}

fun printCakeTop(age: Int) {
    repeat(age + 2) {
        print("=")
    }
    println()
}



fun printCakeCandles(age: Int){
    print(" ")
    repeat(age){
        print(",")
    }
    println()
    
    print(" ")
    repeat(age){
        print("|")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int){
    repeat(layers){
       repeat(age + 2){
        print("@")
    }
    	println() 
    }
    
}

___________________________________

4/12/2022


 fun main() {
   val border = "`-._,-'"
    val timesToRepeat = 4
    
    printBorder(border, timesToRepeat)
    println("    Happy Birthday, Mom!")
    printBorder(border, timesToRepeat)
}

fun printBorder(border: String, timesToRepeat: Int){
    repeat(timesToRepeat){
        print(border)
    }
    println()
      
}