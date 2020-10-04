import states.State
import states.State01

object GameStateManager {
    private var state: State = State01

    private fun changeState(newState: State) {
        this.state = newState
    }
}