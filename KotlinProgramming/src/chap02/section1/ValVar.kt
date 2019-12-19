package chap02.section1

fun main() {
    val number =10               //number변수는 Int형으로 추론

    var language = "korean"      //language변수는 String으로 추론

    val secondaryNumber:Int =89  //secondNumber변수는 자료형을 Int형으로 명시적으로 지정

    language = "Japanese"        //var키워드로 선언한 변수는 값을 다시 할당할 수있음
    
    //secondaryNumber=10         //Error:(8, 5) Kotlin: Val cannot be reassigned
                                 //val키워드는 재할당 할 수 없음


    println("number: $number")
    println("language: $language")
    println("secondaryNumber: $secondaryNumber")
}
