package states

import Option

object State01 : State {
    override fun getText(): String =
            "Welcome to the game!"

    override fun getOptions(): Array<Option> = arrayOf(
            Option(label = "Example option A", state = State02),
            Option(label = "Example option B", state = State03)
    )
}