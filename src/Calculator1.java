import javax.swing.*; 
import java.awt.GridLayout; 
import java.awt.BorderLayout; 
public class Calculator1 { 

// ���������� ���� ����������� ������������. 
JPanel windowContent; 
JTextField displayField; 
JButton button0; 
JButton button1; 
JButton button2; 
JButton button3; 
JButton button4; 
JButton button5; 
JButton button6; 
JButton button7;
JButton button8; 
JButton button9; 
JButton buttonPoint;
JButton buttonPlus;
JButton buttonMinus;
JButton buttonDivide;
JButton buttonMultiple;
JButton buttonEqual; 
JPanel p1; 
JPanel p2;
      
	// � ������������ ��������� ��� ���������� � ����������� �� ����� � ������� ���������� Borderlayout � Gridlayout 
      Calculator1(){ 
    windowContent= new JPanel();   
  
    // ����� ����� ��� ���� ������ 
      BorderLayout bl = new BorderLayout(); 
      windowContent.setLayout(bl); 
      
      // ������ � ���������� ����    
      // ��������� ��� � �������� ������� ���� 
      displayField = new JTextField(30); 
      windowContent.add("North",displayField); 
     
      // ������ ������, ��������� �����������   ������ JButton, ������� ��������� ����� ������ � �������� ���������        
     button0=new JButton("0"); 
     button1=new JButton("1"); 
     button2=new JButton("2"); 
     button3=new JButton("3"); 
     button4=new JButton("4"); 
     button5=new JButton("5"); 
     button6=new JButton("6"); 
     button7=new JButton("7"); 
     button8=new JButton("8"); 
     button9=new JButton("9");
     buttonPlus=new JButton("+");
     buttonMinus=new JButton("-");
     buttonDivide=new JButton("/");
     buttonMultiple=new JButton("*");
     buttonPoint = new JButton("."); 
     buttonEqual=new JButton("=");               
   
     // ������ ������ � GridLayout, ������� �������� 12 ������ - 10 ������ � ������� � ������ � ������ � ������ �����    
     p1 = new JPanel(); 
     GridLayout gl =new GridLayout(4,3);  
     p1.setLayout(gl); 
   
     //  ��������� ������ �� ������ p1 
      p1.add(button1); 
      p1.add(button2); 
      p1.add(button3); 
      p1.add(button4); 
      p1.add(button5); 
      p1.add(button6); 
      p1.add(button7);  
      p1.add(button8); 
      p1.add(button9); 
      p1.add(button0); 
      p1.add(buttonPoint); 
      p1.add(buttonEqual); 
   
      // �������� ������ p1 � ����������� ������� ����       
      windowContent.add("Center",p1); 
      
      p2 = new JPanel();
      GridLayout bg =new GridLayout(4,3);  
      p2.setLayout(bg); 
    
      //  ��������� ������ �� ������ p1 
       p2.add(buttonPlus); 
       p2.add(buttonMinus); 
       p2.add(buttonDivide); 
       p2.add(buttonMultiple); 
       
       windowContent.add("East",p2);
   
      //������ ����� � ����� ��� �������� ������                 
     JFrame frame = new JFrame("Calculator"); 
     frame.setContentPane(windowContent); 
   
     // ������ ������ ���� ����������� ��� ����, ����� �������� ��� ���������� 
     frame.pack();  

     // �������, ���������� ���� 
     frame.setVisible(true); 
    } 
      public static void main(String[] args) { 
    	  Calculator1 calc = new Calculator1(); 
      } 
	} 

//property of Cyril Krasnobaiev
//property of Elena Krasnobaieva
