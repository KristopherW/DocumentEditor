import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EditorWindow extends JFrame implements ActionListener, DocumentListener{
	private JTextArea textArea;
	private JMenuBar menuBar;
	private JMenu fileM,editM,viewM;
	private JScrollPane scpane;
	private JMenuItem exitI,cutI,copyI,pasteI,selectI,saveI,loadI,statusI;
	private String pad;
	private JToolBar toolBar;
	private JFileChooser fileChooser;
	
	public EditorWindow(){
	    super("Document");
	    setSize(600, 600);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container pane = getContentPane();
	    pane.setLayout(new BorderLayout());
	
	    pad = " ";
	    textArea = new JTextArea();
	    textArea.getDocument().addDocumentListener(this);
	    menuBar = new JMenuBar();
	    fileM = new JMenu("File");
	    editM = new JMenu("Edit");
	    viewM = new JMenu("View");
	    scpane = new JScrollPane(textArea);
	    exitI = new JMenuItem("Exit");
	    cutI = new JMenuItem("Cut");
	    copyI = new JMenuItem("Copy");
	    pasteI = new JMenuItem("Paste");
	    selectI = new JMenuItem("Select All");
	    saveI = new JMenuItem("Save"); 
	    loadI = new JMenuItem("Load");
	    statusI = new JMenuItem("Status");
	    toolBar = new JToolBar();
	    fileChooser = new JFileChooser();
	
	    textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);
	
	    setJMenuBar(menuBar);
	    menuBar.add(fileM);
	    menuBar.add(editM);
	    menuBar.add(viewM);
	
	    fileM.add(saveI);
	    fileM.add(loadI);
	    fileM.add(exitI);
	
	    editM.add(cutI);
	    editM.add(copyI);
	    editM.add(pasteI);        
	    editM.add(selectI);
	
	    viewM.add(statusI);
	
	    pane.add(scpane,BorderLayout.CENTER);
	    pane.add(toolBar,BorderLayout.SOUTH);
	
	    saveI.addActionListener(this);
	    loadI.addActionListener(this);
	    exitI.addActionListener(this);
	    cutI.addActionListener(this);
	    copyI.addActionListener(this);
	    pasteI.addActionListener(this);
	    selectI.addActionListener(this);
	    statusI.addActionListener(this);
	
	    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
	    JMenuItem choice = (JMenuItem) e.getSource();
	    File file = null;
	    if (choice == saveI){
	    	if(file == null){
	    		JFileChooser c = new JFileChooser();
	    	      int returnVal = c.showSaveDialog(textArea);
	    	      if (returnVal == JFileChooser.APPROVE_OPTION) {
	    	    	  file = c.getSelectedFile();
	    	      }
	    	}
	    	
	    	try {
				FileWriter fileWriter = new FileWriter(file.getAbsoluteFile(), false);
				fileWriter.write(textArea.getText());
				fileWriter.close();
			} 
	    	catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	    else if(choice == loadI){
	    	int returnVal = fileChooser.showOpenDialog(textArea);
	    	if(returnVal == JFileChooser.APPROVE_OPTION){
	    		file = fileChooser.getSelectedFile();
	    		FileReader fr;
				try {
					fr = new FileReader(file);
					BufferedReader reader = new BufferedReader(fr);
					textArea.read(reader, textArea);
				} 
				catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} 
				catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	    	}
	    }
	    else if (choice == exitI){
	    	System.exit(0);	    	
	    }
	    else if (choice == cutI){
	        pad = textArea.getSelectedText();
	        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
	    }
	    else if (choice == copyI){
	    	pad = textArea.getSelectedText();	    	
	    }
	    else if (choice == pasteI){
	    	textArea.insert(pad, textArea.getCaretPosition());	    	
	    }
	}

	public static void main(String[] args){
	    new EditorWindow();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Change");

	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		System.out.println("Insert");
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		System.out.println("Remove");
		
	}
}