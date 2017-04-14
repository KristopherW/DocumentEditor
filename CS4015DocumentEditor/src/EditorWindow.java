import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class EditorWindow extends JFrame implements ActionListener, DocumentListener{
	private JTextArea ta;
	private int count;
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
	
	    count = 0;
	    pad = " ";
	    ta = new JTextArea();
	    ta.getDocument().addDocumentListener(this);
	    menuBar = new JMenuBar();
	    fileM = new JMenu("File");
	    editM = new JMenu("Edit");
	    viewM = new JMenu("View");
	    scpane = new JScrollPane(ta);
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
	
	    ta.setLineWrap(true);
	    ta.setWrapStyleWord(true);
	
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
	    if (choice == saveI){
	        //not yet implmented
	    }
	    else if(choice == loadI){
	    	int returnVal = fileChooser.showOpenDialog(ta);
	    	if(returnVal == JFileChooser.APPROVE_OPTION){
	    		File file = fileChooser.getSelectedFile();
	    		FileReader fr;
				try {
					fr = new FileReader(file);
					BufferedReader reader = new BufferedReader(fr);
					ta.read(reader, ta);

				} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

	    	}
	    }
	    else if (choice == exitI)
	        System.exit(0);
	    else if (choice == cutI){
	        pad = ta.getSelectedText();
	        ta.replaceRange("", ta.getSelectionStart(), ta.getSelectionEnd());
	    }
	    else if (choice == copyI)
	        pad = ta.getSelectedText();
	    else if (choice == pasteI)
	        ta.insert(pad, ta.getCaretPosition());
	    else if (choice == selectI)
	        ta.selectAll();
	    else if (e.getSource() == statusI){
	        //not yet implmented
	    }
	}

	public static void main(String[] args){
	    new EditorWindow();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		// TODO Auto-generated method stub
		
	}
}