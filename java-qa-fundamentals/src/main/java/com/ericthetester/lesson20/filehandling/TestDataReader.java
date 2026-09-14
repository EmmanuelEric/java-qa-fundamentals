package com.ericthetester.lesson20.filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class TestDataReader {

    public List<String> readLines(Path file) throws IOException {

        return Files.readAllLines(file);

    }
}

// Files.readAllLines() opens the file, reads every line into a List,
// and closes the file automatically - no manual try-with-resources
// needed here because Files handles that internally. It's convenient
// for a small file like this one, but loads the entire file into
// memory at once, which wouldn't scale to a huge log the way a
// line-by-line BufferedReader loop would.
