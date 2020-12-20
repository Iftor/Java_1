package ru.mirea.pr10.ex3;

import javax.swing.*;
import java.awt.event.*;

public class MenuExample implements ActionListener
{
    JFrame f;
    JMenuBar mb;
    JMenu File, New, Open, Save, Exit;
    JMenuItem TextDocument, MusicDocument, ImageDocument, TextDocument1, MusicDocument1, ImageDocument1;

    MenuExample()
    {
        f = new JFrame("IDocument");
        TextDocument = new JMenuItem("TextDocument");
        MusicDocument = new JMenuItem("MusicDocument");
        ImageDocument = new JMenuItem("ImageDocument");
        TextDocument1 = new JMenuItem("TextDocument");
        MusicDocument1 = new JMenuItem("MusicDocument");
        ImageDocument1 = new JMenuItem("ImageDocument");
        TextDocument.addActionListener(this);
        MusicDocument.addActionListener(this);
        ImageDocument.addActionListener(this);
        mb = new JMenuBar();
        File = new JMenu("File");
        New = new JMenu("New");
        Open = new JMenu("Open");
        Save = new JMenu("Save");
        Exit = new JMenu("Exit");
        File.add(New);
        File.add(Open);
        New.add(TextDocument);
        New.add(MusicDocument);
        New.add(ImageDocument);
        Open.add(TextDocument1);
        Open.add(MusicDocument1);
        Open.add(ImageDocument1);
        mb.add(File);
        f.add(mb);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        ICreateDocument createDocument = null;
        if (e.getSource() == TextDocument)
            createDocument = new CreateTextDocument();
        if (e.getSource() == MusicDocument)
            createDocument = new CreateTextDocument();
        if (e.getSource() == ImageDocument)
            createDocument = new CreateTextDocument();
        if (e.getSource() == TextDocument1)
            createDocument = new CreateTextDocument();
        if (e.getSource() == MusicDocument1)
            createDocument = new CreateTextDocument();
        if (e.getSource() == ImageDocument1)
            createDocument = new CreateTextDocument();
        IDocument document = createDocument.createNew();
    }

    public static void main(String[] args)
    {
        new MenuExample();
    }
}