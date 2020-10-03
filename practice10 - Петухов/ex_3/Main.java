package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;


public class Main extends JFrame {
    private IDocument iDocument;
    private ICreateDocument iCreateDocument = new CreateTextDocument();
    private JTextArea field;
    private final String path = "test.txt";

    public static void main(String[] args){
        new Main().setVisible(true);
    }

    public Main(){
        super("Editor");
        setLayout(new FlowLayout());
        initialize();
        setSize(400, 400);
    }

    private void initialize(){
        JMenuBar bar = new JMenuBar();
        bar.add(createMenuFile());
        setJMenuBar(bar);
        field = new JTextArea(30, 30);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel content = new JPanel();
        content.add(field);
        setContentPane(content);
    }

    private JMenu createMenuFile(){
        JMenu file = new JMenu("File");
        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemNew = new JMenuItem("New");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemExit = new JMenuItem("Exit");
        file.add(itemNew);
        file.add(itemOpen);
        file.add(itemSave);
        file.addSeparator();
        file.add(itemExit);
        itemNew.addActionListener(actionEvent -> {
            try {
                iDocument = iCreateDocument.createNew(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        itemOpen.addActionListener(actionEvent -> {
            iDocument = iCreateDocument.createOpen(path);
            StringBuilder sol = (StringBuilder) iDocument.getContent();
            field.append(sol.toString());
        });
        return file;
    }
}
