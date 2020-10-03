package com.company;

import java.io.IOException;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public IDocument<StringBuilder> createNew(String path) throws IOException {
        return new TextDocument<StringBuilder>(path).create();
    }

    @Override
    public IDocument<StringBuilder> createOpen(String path) {
        return new TextDocument<>(path);
    }
}
