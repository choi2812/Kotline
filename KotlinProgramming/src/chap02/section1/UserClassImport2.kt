//사용자 클래스에 별명 붙이기
package chap02.section1

import com.example.edu.Person as User

fun main() {
    val user1 =User("choi",34)//import한 Person이 User로 대체
    val user2 =Person("jung","알아서 뭐하게?")//현재 파일 안에 있는 Person클래스의 객체 생성

    println(user1.name)
    println(user1.age)

    println(user2.name)
    println(user2.age)
    
}

class Person(val name:String,val age:String)