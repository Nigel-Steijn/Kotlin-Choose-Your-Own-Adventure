package com.steijn.adventure

import com.steijn.adventure.states.State
import com.steijn.adventure.states.examples.State01
import java.lang.Exception
import java.util.*

object GameStateManager {
    private var state: State = State01

    private fun changeState(newState: State) {
        state = newState
    }

    fun run() {
        val inputReader = Scanner(System.`in`)

        while (true) {
            println(state.getText())

            println("\nWhat will you do?\n")

            val options = state.getOptions()
            options.forEachIndexed {
                index, it -> println("(${index + 1}) ${it.label}")
            }

            try {
                print("\nGo with option: ")
                val option = Integer.parseInt(inputReader.next())

                changeState(
                        options[option - 1].state
                )

                for (i in 0..5)
                    print("\n")
            } catch (e: Exception) {
                println("Incorrect input value!")
            }
        }
    }
}