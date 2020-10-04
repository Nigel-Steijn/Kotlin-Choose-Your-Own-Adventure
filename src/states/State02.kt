package states

import Option

object State02 : State {
    override fun getText(): String =
            "You chose option A!"

    override fun getOptions(): Array<Option> = arrayOf(
            Option(label = "Go back", state = State01),
            Option(label = "See other option", state = State03)
    )
}