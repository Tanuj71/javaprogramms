import java.util.*

fun main() {
        println("hello")
        var a: Int = 4;
        var b: Int = 5;
        var c: Int = 2
        val reader=Scanner(System.`in`);
    print("enter a value")
    val d:Int=reader.nextInt();
    val name=readLine();
        var sum: Int;
        sum = a + b;
        println(sum)
        if (a > b && a > c) {
            println("greater=$a");
        }
        else if (b > a && b > c) {
        println("greater=$b")
        } else {
            println("greater=$c")
        }
    println("choose operator")
    val op:Int=reader.nextInt();
    when(op){
        1->println("${a+b}")
        2->println("{$a-$b}")
        3->println("$a*$b")
    else->println("invalid")
    }
    }


