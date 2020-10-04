package com.steijn.adventure.states.examples

import com.steijn.adventure.Option
import com.steijn.adventure.states.State

object State01 : State {
    override fun getText(): String =
            "Welcome to the game!"

    override fun getOptions(): Array<Option> = arrayOf(
            Option(label = "Example option A", state = State02),
            Option(label = "Example option B", state = State03)
    )
}