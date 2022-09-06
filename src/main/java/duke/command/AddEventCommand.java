package duke.command;

import duke.DukeException;
import duke.Storage;
import duke.TaskList;
import duke.Ui;
import duke.task.EventTask;
import duke.task.Task;

import java.io.IOException;

public class AddEventCommand extends Command {

    private final Task eventTask;

    public AddEventCommand(String taskName, String date, String time) {
        eventTask = new EventTask(taskName, date, time);
    }

    public AddEventCommand(String taskName, String date) {
        eventTask = new EventTask(taskName, date);
    }

    @Override
    public boolean isExit() {
        return false;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) {
        try {
            taskList.add(eventTask);
            storage.writeToFile(taskList.list());
            ui.display(String.format("Added new event task:%n%s%n", eventTask));
        } catch (IOException e) {
            throw new DukeException("Could not write to file");
        }
    }

}