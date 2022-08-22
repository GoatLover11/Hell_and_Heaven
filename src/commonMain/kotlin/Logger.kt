import java.time.*
import java.time.format.*

/*
* Loggolás ...
* */
class Logger {

    companion object log{
        fun log(type: String, mess: String ){

            //val textlog = LocalDateTime.now().toString() + ": $mess";

            val current = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"))
            val current1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))

            when (type) {
                "err" -> println("\u001b[31m\n$current1: \n$mess\n\u001b[0m")
                "inf" -> println("\u001b[34m\n$current1: \n$mess\u001b[0m")
                "bug" -> println("\u001b[33m\n$current: $mess\u001b[0m")
                else -> println("$current: $mess\u001b[0m")
            }
        }
        fun log(mess: String) {
            log("x", mess)
        }
    }
}
