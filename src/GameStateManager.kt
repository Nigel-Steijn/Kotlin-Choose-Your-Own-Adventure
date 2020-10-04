import states.State
import states.State01
import java.lang.Exception
import java.util.*

object GameStateManager {
    private var state: State = State01

    private fun changeState(newState: State) {
        this.state = newState
    }

    fun run() {
        val inputReader = Scanner(System.`in`)

        while (true) {
            println(this.state.getText())

            println("\nWhat will you do?\n")

            val options = this.state.getOptions()
            options.forEachIndexed {
                index, it -> println("(${index + 1}) ${it.label}")
            }

            try {
                print("\nGo with option: ")
                val option = inputReader.nextInt()

                this.changeState(
                        options[option - 1].state
                )
            } catch (e: Exception) {
                println("Incorrect input value!")
            } finally {
                for (i in 0..10)
                    print("\n")
            }
        }
    }
}