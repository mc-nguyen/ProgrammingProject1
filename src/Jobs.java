import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Jobs {
    private List<Job> jobs;

    Jobs(File jobsFile) throws FileNotFoundException {
        Scanner in = new Scanner(jobsFile);
        while (in.hasNextLine())
            jobs.add(new Job(in.nextLine(), Integer.parseInt(in.nextLine())));
    }
}

class Job {
    private final String name;
    private final int time;

    Job(String name, int time) {
        this.name = name;
        this.time = time;
    }

    String getName() { return name; }
    int getTime() { return time; }
}
