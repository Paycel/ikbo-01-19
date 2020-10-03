package com.company;

import java.io.*;

public class TextDocument<T> implements IDocument<T> {
    private String path;

    public TextDocument(String path) {
        this.path = path;
    }

    public TextDocument() {
        this.path = "test.txt";
    }

    public IDocument<T> create() throws IOException {
        FileWriter writer = new FileWriter(path);
        writer.close();
        return this;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public T getContent() {
        StringBuilder sol = new StringBuilder();
        try {
            FileReader reader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sol.append(line).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (T) sol;
    }
}
