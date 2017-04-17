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

public class EditorView extends JFrame implements ActionListener, DocumentListener{
	private JTextArea textArea;
	private JMenuBar menuBar;
	private JMenu fileMenu, editMenu;
	private JScrollPane scrollPane;
	private JMenuItem exitItem, cutItem, copyItem, pasteItem, saveItem, loadItem;
	private String clipBoard;
	private JToolBar toolBar;
	private JFileChooser fileChooser;
	private DocumentController controller = new DocumentController();
	private TextObserver observer = new TextObserver();
	
	public EditorView(){
	    super("CS4015 Text Editor");
	    setSize(600, 600);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    Container pane = getContentPane();
	    pane.setLayout(new BorderLayout());
	
	    clipBoard = "";
	    textArea = new JTextArea();
	    menuBar = new JMenuBar();
	    fileMenu = new JMenu("File");
	    editMenu = new JMenu("Edit");
	    scrollPane = new JScrollPane(textArea);
	    saveItem = new JMenuItem("Save"); 
	    loadItem = new JMenuItem("Load");
	    exitItem = new JMenuItem("Exit");
	    cutItem = new JMenuItem("Cut");
	    copyItem = new JMenuItem("Copy");
	    pasteItem = new JMenuItem("Paste");
	    toolBar = new JToolBar();
	    fileChooser = new JFileChooser();
	
	    textArea.setLineWrap(true);
	    textArea.setWrapStyleWord(true);
	
	    setJMenuBar(menuBar);
	    menuBar.add(fileMenu);
	    menuBar.add(editMenu);
	
	    fileMenu.add(saveItem);
	    fileMenu.add(loadItem);
	    fileMenu.add(exitItem);
	
	    editMenu.add(cutItem);
	    editMenu.add(copyItem);
	    editMenu.add(pasteItem);        
		
	    pane.add(scrollPane,BorderLayout.CENTER);
	    pane.add(toolBar,BorderLayout.SOUTH);
	
	    textArea.getDocument().addDocumentListener(this);
	    saveItem.addActionListener(this);
	    loadItem.addActionListener(this);
	    exitItem.addActionListener(this);
	    cutItem.addActionListener(this);
	    copyItem.addActionListener(this);
	    pasteItem.addActionListener(this);
	
	    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
	    JMenuItem choice = (JMenuItem) e.getSource();
	    File file = null;
	    if (choice == saveItem){
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
	    else if(choice == loadItem){
	    	int returnVal = fileChooser.showOpenDialog(textArea);
	    	if(returnVal == JFileChooser.APPROVE_OPTION){
	    		file = fileChooser.getSelectedFile();
	    		FileReader fr;
				try {
					fr = new FileReader(file);
					this.setTitle(file.getName());
					BufferedReader reader = new BufferedReader(fr);
					Director director = new Director();
					String docText = "";
					String temp = "";
					while((temp = reader.readLine()) != null){		
						docText += temp + "\n";
					}
					reader.close();
					textArea.setText(director.buildDocument(docText));
					
					
//					textArea.getDocument().addDocumentListener(this);
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
	    else if (choice == exitItem){
	    	System.exit(0);	    	
	    }
	    else if (choice == cutItem){
	        clipBoard = textArea.getSelectedText();
	        textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
	    }
	    else if (choice == copyItem){
	    	clipBoard = textArea.getSelectedText();	    	
	    }
	    else if (choice == pasteItem){
	    	textArea.insert(clipBoard, textArea.getCaretPosition());	    	
	    }
	}
	
	public void setText(String text){
		textArea.setText(text);
	}

	public static void main(String[] args){
	    new EditorView();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		controller.documentText(textArea.getText());
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		controller.documentText(textArea.getText());
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		controller.documentText(textArea.getText());
	}
}