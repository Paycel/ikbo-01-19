package com.company;

import java.io.IOException;

public interface ICreateDocument {
    IDocument createNew(String path) throws IOException;
    IDocument createOpen(String path);
}
