package com.steijn.adventure.states

import com.steijn.adventure.Option

interface State {
    fun getText(): String
    fun getOptions(): Array<Option>
}