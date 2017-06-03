import java.util.*;                                                                                                                                                        
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Hackathon extends JFrame implements ActionListener
{
	//public Thread t;
	public static int xm,xtu,xw,xth,xf,xsa,xsu;
	public static String aa[]=new String[45];
	public static String bb[]=new String[45];
	public static String cc[]=new String[45],ee[]=new String[45];
	public int dd[]=new int[45];
	public int i=0;
	JButton task[]=new JButton[45];
	//JLabel jl1;
	//JButton jb1;
	/*void first()
	{
		setLayout(new BorderLayout());
    	jl1=new JLabel(new ImageIcon("B:\\photoshop pics\\tm3.jpg"));
    	jb1=new JButton("Click here to continue");
    	jb1.addActionListener(this);
    	add(jl1);
    	add(jb1,"South");
    	getContentPane().setBackground(Color.WHITE);
    	setLocation(700,350);
    	setUndecorated(true);
    	setSize(400,375);
    	setVisible(true);
	}*/
	public void show(String a,String b,String c,int d,String e)
	{
		task[i]=new JButton();
		task[i].addActionListener(this);
		if(e=="m")
		{task[i].setBounds(xm,125,50,50);
		xm+=100;}
		if(e=="tu")
		{task[i].setBounds(xtu,225,50,50);
		xtu+=100;}
		if(e=="w")
		{task[i].setBounds(xw,325,50,50);
		xw+=100;}
		if(e=="th")
		{task[i].setBounds(xth,425,50,50);
		xth+=100;}
		if(e=="f")
		{task[i].setBounds(xf,525,50,50);
		xf+=100;}
		if(e=="sa")
		{task[i].setBounds(xsa,625,50,50);
		xsa+=100;}
		if(e=="su")
		{task[i].setBounds(xsu,725,50,50);
		xsu+=100;}
		aa[i]=a;
		bb[i]=b;
		cc[i]=c;
		dd[i]=d;
		ee[i]=e;
		if(d==1)
		{task[i].setBackground(Color.RED);
		task[i].setText("A");}
		if(d==2)
		{task[i].setBackground(Color.BLUE);
		task[i].setText("M");}
		if(d==3)
		{task[i].setBackground(Color.YELLOW);
		task[i].setText("S");}
		if(d==4)
		{task[i].setBackground(Color.GREEN);
		task[i].setText("E");}
		add(task[i]);
		i++;
    	setVisible(true);
    }
    public static void main (String args[]) 
   	{
   		Hackathon H=new Hackathon();
		//H.first();
		H.setLayout(null);
    	JLabel work=new JLabel("Work Management");
    	work.setFont(new Font("Cooper Black", Font.BOLD, 50));
    	H.getContentPane().setBackground(Color.WHITE);
    	JButton addm=new JButton("+");
       	addm.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	if(xm==1100)
				JOptionPane.showMessageDialog(null,"Overflow");
				else
				{new Frame2("m",H);
				H.setVisible(false);}
			}
		});
    	JButton addtu=new JButton("+");
    addtu.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	if(xtu==1100)
				JOptionPane.showMessageDialog(null,"Overflow");
				else
				{new Frame2("tu",H);
				H.setVisible(false);}
			}
		}); //
    	JButton addw=new JButton("+");
    	addw.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	if(xw==1100)
				JOptionPane.showMessageDialog(null,"Overflow");
				else
				{new Frame2("w",H);
				H.setVisible(false);}
			}
		});
    	JButton addth=new JButton("+");
    	addth.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	if(xth==1100)
				JOptionPane.showMessageDialog(null,"Overflow");
				else
				{new Frame2("th",H);
				H.setVisible(false);}
			}
		});
    	JButton addf=new JButton("+");
    	addf.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	if(xf==1100)
				JOptionPane.showMessageDialog(null,"Overflow");
				else
				{new Frame2("f",H);
				H.setVisible(false);}
			}
		});
    	JButton addsa=new JButton("+");
    	addsa.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	if(xsa==1100)
				JOptionPane.showMessageDialog(null,"Overflow");
				else
				{new Frame2("sa",H);
				H.setVisible(false);}
			}
		});
    	JButton addsu=new JButton("+");
    	addsu.addActionListener(new ActionListener()
		{public void actionPerformed(ActionEvent e)
			{	if(xsu==1100)
				JOptionPane.showMessageDialog(null,"Overflow");
				else
				{new Frame2("su",H);
				H.setVisible(false);}
			}
		});                      //                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            
    	Font f1=new Font("Calibri",Font.BOLD,40);
		Font f2=new Font("Bell MT",Font.PLAIN,35);
		JLabel Mon=new JLabel("Monday");
		Mon.setFont(f1);
    	JLabel Tues=new JLabel("Tuesday");
    	Tues.setFont(f1);
    	JLabel Wed=new JLabel("Wednesday");
    	Wed.setFont(f1);
    	JLabel Thurs=new JLabel("Thursday");
    	Thurs.setFont(f1);
    	JLabel Fri=new JLabel("Friday");
    	Fri.setFont(f1);
    	JLabel Sat=new JLabel("Saturday");
    	Sat.setFont(f1);
    	JLabel Sun=new JLabel("Sunday");
    	Sun.setFont(f1);
    	JPanel jp2=new JPanel();
    	jp2.setLayout(new GridLayout(7,1));
    	jp2.add(Mon);jp2.add(Tues);jp2.add(Wed);
    	jp2.add(Thurs);jp2.add(Fri);jp2.add(Sat);jp2.add(Sun);
    	jp2.setBackground(Color.WHITE);
    	work.setBounds(500,01,800,100);
    	H.add(work);
    	jp2.setBounds(300,100,200,700);
    	H.add(jp2);
    	addm.setBounds(1100,125,50,50);
		H.add(addm);
		addtu.setBounds(1100,225,50,50);
		H.add(addtu);
		addw.setBounds(1100,325,50,50);
		H.add(addw);
		addth.setBounds(1100,425,50,50);
		H.add(addth);
		addf.setBounds(1100,525,50,50);
		H.add(addf);
		addsa.setBounds(1100,625,50,50);
		H.add(addsa);
		addsu.setBounds(1100,725,50,50);
		H.add(addsu);
		//reset.setBounds(1250,425,100,100);
		//H.add(reset);
    	H.setLocation(250,20);
    	H.setSize(1500,1000);
		xm=xtu=xw=xth=xf=xsa=xsu=500;
    	H.setVisible(true);
   	}
   	public void actionPerformed(ActionEvent ae)
	{
		JButton b=(JButton)ae.getSource();
		for(int j=0;j<45;j++)
		{
			if(b==task[j])
			{
				new Frame7(aa[j],bb[j],cc[j],dd[j]);
				break;
			}
		}
	 }
}	 

 
class Frame2 extends JFrame implements ActionListener
{
	public Hackathon h;
	public String day;
	JButton assign,market,sports,meeting;
	JLabel jl1;
	public Frame2(String din,Hackathon ha)
	{
		setLayout(null);
		jl1=new JLabel("       Things to do");
		jl1.setFont(new Font("Cooper Black", Font.BOLD, 50));
		assign=new JButton("Assignment");
		assign.addActionListener(this);
		market=new JButton("Market");
		market.addActionListener(this);
		sports=new JButton("Sports");
		sports.addActionListener(this);
		meeting=new JButton("Meeting");
		meeting.addActionListener(this);
		jl1.setBounds(100,01,800,100);
		add(jl1);
		assign.setBounds(150,100,100,50);
		add(assign);
		market.setBounds(500,100,100,50);
		add(market);
		sports.setBounds(150,250,100,50);
		add(sports);
		meeting.setBounds(500,250,100,50);
		add(meeting);
		setLocation(350,100);
    	setSize(750,500);
		day=din;
		setVisible(true);
		h=ha;
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton b=(JButton)ae.getSource();
		if(b==assign)
		{	new Frame3(day,h);
			setVisible(false);
		}
		else if(b==market)
		{new Frame4(day,h);
		setVisible(false);
		}
		else if(b==sports)
		{new Frame5(day,h);
		setVisible(false);
		}
		else if(b==meeting)
		{new Frame6(day,h);
		setVisible(false);
		}
	}	
}
class Frame3 extends JFrame implements ActionListener
{
	public Hackathon h;
	String din;
	JPanel jp3;
	JLabel sub,dos,progress;
	JTextField sub1,dos1,progress1;
	JButton save;
	public Frame3(String d,Hackathon ha)
	{
		setLayout(null);
		Font f1=new Font("Calibri",Font.BOLD, 40);
		Font f2=new Font("Bell MT",Font.PLAIN,35);
		Font f3=new Font("Calibri",Font.BOLD, 35);
		jp3=new JPanel();
		jp3.setLayout(new GridLayout(3,2));
		sub=new JLabel("Subject");
		sub.setFont(f1);
		progress=new JLabel("Progress");
		progress.setFont(f1);
		dos=new JLabel("Submission Date");
		dos.setFont(f3);
		sub1=new JTextField();
		dos1=new JTextField();
		progress1=new JTextField();
		jp3.add(sub);  jp3.add(sub1);
		jp3.add(progress);  jp3.add(progress1);
		jp3.add(dos);  jp3.add(dos1);
		jp3.setBounds(100,100,500,150);
		add(jp3);
		save=new JButton("Save");
		save.setBounds(300,300,100,50);
		add(save);
		save.addActionListener(this);
		setLocation(350,100);
    	setSize(750,500);
		din=d;
		h=ha;
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String subject=sub1.getText();
		String prog=progress1.getText();
		String sub_date=dos1.getText();
		h.show(subject,sub_date,prog,1,din);
		setVisible(false);
	}
}

class Frame4 extends JFrame implements ActionListener
{
	public Hackathon h;
 	String din;
	JPanel jp3;
	JLabel sub,dos,progress;
	JTextField sub1,dos1,progress1;
	JButton save;
	public Frame4(String d,Hackathon ha)
	{
		setLayout(null);
		Font f1=new Font("Calibri",Font.BOLD, 40);
		Font f2=new Font("Bell MT",Font.PLAIN,35);
		Font f3=new Font("Calibri",Font.BOLD, 35);
		jp3=new JPanel();
		jp3.setLayout(new GridLayout(3,2));
		sub=new JLabel("Things");
		sub.setFont(f1);
		progress=new JLabel("Money Req");
		progress.setFont(f1);
		dos=new JLabel("Time to go");
		dos.setFont(f3);
		sub1=new JTextField();
		dos1=new JTextField();
		progress1=new JTextField();
		jp3.add(sub);  jp3.add(sub1);
		jp3.add(progress);  jp3.add(progress1);
		jp3.add(dos);  jp3.add(dos1);
		jp3.setBounds(100,100,500,150);
		add(jp3);
		save=new JButton("Save");
		save.setBounds(300,300,100,50);
		add(save);
		save.addActionListener(this);
		setLocation(350,100);
    	setSize(750,500);
		din=d;
		h=ha;
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String subject=sub1.getText();
		String prog=progress1.getText();
		String sub_date=dos1.getText();
		h.show(subject,sub_date,prog,2,din);
		setVisible(false);
	}
}

class Frame5 extends JFrame implements ActionListener
{
	public Hackathon h;
	String din;
	JPanel jp3;
	JLabel sub,dos,progress;
	JTextField sub1,dos1,progress1;
	JButton save;
	public Frame5(String d, Hackathon ha)
	{
		setLayout(null);
		Font f1=new Font("Calibri",Font.BOLD, 40);
		Font f2=new Font("Bell MT",Font.PLAIN,35);
		Font f3=new Font("Calibri",Font.BOLD, 35);
		jp3=new JPanel();
		jp3.setLayout(new GridLayout(3,2));
		sub=new JLabel("Sport");
		sub.setFont(f1);
		progress=new JLabel("Time");
		progress.setFont(f1);
		dos=new JLabel("Requirements");
		dos.setFont(f3);
		sub1=new JTextField();
		dos1=new JTextField();
		progress1=new JTextField();
		jp3.add(sub);  jp3.add(sub1);
		jp3.add(progress);  jp3.add(progress1);
		jp3.add(dos);  jp3.add(dos1);
		jp3.setBounds(100,100,500,150);
		add(jp3);
		save=new JButton("Save");
		save.setBounds(300,300,100,50);
		add(save);
		save.addActionListener(this);
		setLocation(350,100);
    	setSize(750,500);
		din=d;
		h=ha;
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String subject=sub1.getText();
		String prog=progress1.getText();
		String sub_date=dos1.getText();
		h.show(subject,sub_date,prog,3,din);
		setVisible(false);
	}
}

class Frame6 extends JFrame implements ActionListener
{
	public Hackathon h;
	String din;
	JPanel jp3;
	JLabel sub,dos,progress;
	JTextField sub1,dos1,progress1;
	JButton save;
	public Frame6(String d, Hackathon ha)
	{
		setLayout(null);
		Font f1=new Font("Calibri",Font.BOLD, 40);
		Font f2=new Font("Bell MT",Font.PLAIN,35);
		Font f3=new Font("Calibri",Font.BOLD, 35);
		jp3=new JPanel();
		jp3.setLayout(new GridLayout(3,2));
		sub=new JLabel("Issue");
		sub.setFont(f1);
		progress=new JLabel("Place");
		progress.setFont(f1);
		dos=new JLabel("Topic");
		dos.setFont(f3);
		sub1=new JTextField();
		dos1=new JTextField();
		progress1=new JTextField();
		jp3.add(sub);  jp3.add(sub1);
		jp3.add(progress);  jp3.add(progress1);
		jp3.add(dos);  jp3.add(dos1);
		jp3.setBounds(100,100,500,150);
		add(jp3);
		save=new JButton("Save");
		save.setBounds(300,300,100,50);
		add(save);
		save.addActionListener(this);
		setLocation(350,100);
    	setSize(750,500);
		din=d;
		h=ha;
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String subject=sub1.getText();
		String prog=progress1.getText();
		String sub_date=dos1.getText();
		h.show(subject,sub_date,prog,4,din);
		setVisible(false);
	}
}	


class Frame7 extends JFrame 
{
	JPanel jp3;
	JLabel sub,dos,progress,sub1,dos1,progress1;
	JButton save;
	public Frame7(String a,String b,String c,int d)
	{
		if(d==1)
		{	setLayout(null);
			Font f1=new Font("Calibri",Font.BOLD, 40);
			Font f2=new Font("Bell MT",Font.PLAIN,35);
			Font f3=new Font("Calibri",Font.BOLD, 35);
			jp3=new JPanel();
			jp3.setLayout(new GridLayout(3,2));
			sub=new JLabel("Subject");
			sub.setFont(f1);
			progress=new JLabel("Progress");
			progress.setFont(f1);
			dos=new JLabel("Submission Date");
			dos.setFont(f3);
			sub1=new JLabel(a);
			dos1=new JLabel(b);
			progress1=new JLabel(c);
			jp3.add(sub);  jp3.add(sub1);
			jp3.add(progress);  jp3.add(progress1);
			jp3.add(dos);  jp3.add(dos1);
			jp3.setBounds(100,100,500,150);
			add(jp3);
			setLocation(350,100);
			setSize(750,500);
			setVisible(true);
		}	
		if(d==2)
		{	setLayout(null);
			Font f1=new Font("Calibri",Font.BOLD, 40);
			Font f2=new Font("Bell MT",Font.PLAIN,35);
			Font f3=new Font("Calibri",Font.BOLD, 35);
			jp3=new JPanel();
			jp3.setLayout(new GridLayout(3,2));
			sub=new JLabel("Things");
			sub.setFont(f1);
			progress=new JLabel("Money Required");
			progress.setFont(f1);
			dos=new JLabel("Time to go");
			dos.setFont(f3);
			sub1=new JLabel(a);
			dos1=new JLabel(b);
			progress1=new JLabel(c);
			jp3.add(sub);  jp3.add(sub1);
			jp3.add(progress);  jp3.add(progress1);
			jp3.add(dos);  jp3.add(dos1);
			jp3.setBounds(100,100,500,150);
			add(jp3);
			setLocation(350,100);
			setSize(750,500);
			setVisible(true);
		}	
		if(d==3)
		{	setLayout(null);
			Font f1=new Font("Calibri",Font.BOLD, 40);
			Font f2=new Font("Bell MT",Font.PLAIN,35);
			Font f3=new Font("Calibri",Font.BOLD, 35);
			jp3=new JPanel();
			jp3.setLayout(new GridLayout(3,2));
			sub=new JLabel("Sports");
			sub.setFont(f1);
			progress=new JLabel("Time");
			progress.setFont(f1);
			dos=new JLabel("Requirements");
			dos.setFont(f3);
			sub1=new JLabel(a);
			dos1=new JLabel(b);
			progress1=new JLabel(c);
			jp3.add(sub);  jp3.add(sub1);
			jp3.add(progress);  jp3.add(progress1);
			jp3.add(dos);  jp3.add(dos1);
			jp3.setBounds(100,100,500,150);
			add(jp3);
			setLocation(350,100);
			setSize(750,500);
			setVisible(true);
		}	
		if(d==4)
		{	setLayout(null);
			Font f1=new Font("Calibri",Font.BOLD, 40);
			Font f2=new Font("Bell MT",Font.PLAIN,35);
			Font f3=new Font("Calibri",Font.BOLD, 35);
			jp3=new JPanel();
			jp3.setLayout(new GridLayout(3,2));
			sub=new JLabel("Issue");
			sub.setFont(f1);
			progress=new JLabel("Place");
			progress.setFont(f1);
			dos=new JLabel("Topic");
			dos.setFont(f3);
			sub1=new JLabel(a);
			dos1=new JLabel(b);
			progress1=new JLabel(c);
			jp3.add(sub);  jp3.add(sub1);
			jp3.add(progress);  jp3.add(progress1);
			jp3.add(dos);  jp3.add(dos1);
			jp3.setBounds(100,100,500,150);
			add(jp3);
			setLocation(350,100);
			setSize(750,500);
			setVisible(true);
		}	
	}
}