public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Design the system", "Pending"));
        taskList.addTask(new Task(2, "Implement the backend", "In Progress"));
        taskList.addTask(new Task(3, "Test the application", "Pending"));

        // Traverse tasks
        System.out.println("Tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("Searching for task with ID 2:");
        Task task = taskList.searchTask(2);
        System.out.println(task != null ? task : "Task not found");

        // Delete a task
        System.out.println("Deleting task with ID 2:");
        taskList.deleteTask(2);
        taskList.traverseTasks();
    }
}
