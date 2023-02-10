import java.lang.System.exit
import kotlin.system.exitProcess

fun main() {
    println("Be very welcome to the new system of School 123!")

    val menu = "What do you want to do?" +
            "1 - Academic" +
            "2 - Finances" +
            "3 - Administrative" +
            "0 - Finish program"

    println(menu)
    var menuSelect = readln().toInt()

    while (menuSelect != 0) {

        when (menuSelect) {
            1 -> academic()
            2 -> finances()
            3 -> administrative()
        //  0 -> funcaoDeRetorno()
        }

        println(menu)
        menuSelect = readln().toInt()

    }
}

fun administrative() {

}

fun finances() {
}

fun academic() {
}
