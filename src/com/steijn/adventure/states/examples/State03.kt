package com.steijn.adventure.states.examples

import com.steijn.adventure.Option
import com.steijn.adventure.states.State

object State03 : State {
    override fun getText(): String =
            "You chose option B!"

    override fun getOptions(): Array<Option> = arrayOf(
            Option(label = "Go back", state = State01),
            Option(label = "See other option", state = State02)
    )
}
