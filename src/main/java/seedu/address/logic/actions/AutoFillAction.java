package seedu.address.logic.actions;

/**
 * Represents a command with hidden internal logic and the ability to be executed.
 */
public class AutoFillAction extends Action {

    /**
     * Executes the command and returns the result message.
     *
     * @param model {@code Model} which the command should operate on.
     * @return feedback message of the operation result for display
     * @throws CommandException If an error occurs during command execution.
     */
    public boolean action() {
        return true;
    }

    public String toString() {
        return "home";
    }

}
