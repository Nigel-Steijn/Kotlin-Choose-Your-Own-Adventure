package states

import Option

interface State {
    fun getText(): String
    fun getOptions(): Array<Option>
}