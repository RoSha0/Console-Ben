import kotlin.random.Random

fun main(){
    boolAnswers()
}
fun boolAnswers(){
    var ben : Boolean
    var bool = true
    println("//Ask some questions to Ben or type 'exit' to close programm//")
    var quiz : String
        while(bool == true){
            println("Enter your question: ")
            quiz = readln()
            if (quiz == "exit"){ bool = false}
            else{
                ben = Random.nextBoolean()
                if (ben == true){ println("Ben: Yes.") }
                else{println("Ben: No.")}
            }
        }
    }git