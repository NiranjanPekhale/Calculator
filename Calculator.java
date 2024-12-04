import java.awt.*;
import java.awt.event.*;




public class Calculator implements ActionListener,ItemListener{
    Panel p1,p2,p3;
    Label l1,l2,l3;
    Frame f1;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    String s1="";
    double op=0;
    double op2=0;
    String op1="";
    String s3="";
    String or="+";
    String ans;
    boolean bl=false;


    Calculator()
    {
        f1=new Frame();
        p1=new Panel();
        l1=new Label();
        p1.add(l1);
        l3=new Label();
        p1.add(l3);
        l2=new Label("ANSWER : ");
        p1.add(l2);
        p1.setLayout(new GridLayout(2,2));
        f1.add(p1);

        p2=new Panel();
        b1=new Button("1");
		b1.addActionListener(this);
        p2.add(b1);

        b2=new Button("2");
		b2.addActionListener(this);
        p2.add(b2);

        b3=new Button("3");
		b3.addActionListener(this);
        p2.add(b3);

        b4=new Button("+");
		b4.addActionListener(this);
        p2.add(b4);

        b5=new Button("4");
		b5.addActionListener(this);
        p2.add(b5);

        b6=new Button("5");
		b6.addActionListener(this);
        p2.add(b6);

        b7=new Button("6");
		b7.addActionListener(this);
        p2.add(b7);

        b8=new Button("-");
		b8.addActionListener(this);
        p2.add(b8);

        b9=new Button("7");
		b9.addActionListener(this);
        p2.add(b9);

        b10=new Button("8");
		b10.addActionListener(this);
        p2.add(b10);

        b11=new Button("9");
		b11.addActionListener(this);
        p2.add(b11);

        b12=new Button("*");
		b12.addActionListener(this);
        p2.add(b12);

        b13=new Button("0");
		b13.addActionListener(this);
        p2.add(b13);

        b14=new Button("AC");
		b14.addActionListener(this);
        p2.add(b14);

        b15=new Button("C");
		b15.addActionListener(this);
        p2.add(b15);

        b16=new Button("/");
		b16.addActionListener(this);
        p2.add(b16);

        p2.setLayout(new GridLayout(4,4));
        f1.add(p2);
        
        p3=new Panel();
        b17=new Button("=");
		b17.addActionListener(this);
        p3.add(b17);
        p3.setLayout(new GridLayout(2,1));
        f1.add(p3);


        
        
        

        


        

        f1.setLayout(new GridLayout(3,1));
        f1.setVisible(true);
		f1.setSize(200,200);


        



    }


    public void itemStateChanged(ItemEvent e)
    {
      
    }


	public void actionPerformed(ActionEvent e)
    {
        double a,b,c;
        String s2="";
        

        if(e.getSource()==b1)
		{
			s2="1";	
            op1+=s2;
			s3+="1";
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
		}
		else if(e.getSource()==b2)
		{
			s3+="2";	
			s2="2";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
		}
		else if(e.getSource()==b3)
		{
			s3+="3";	
			s2="3";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
		}
		else if(e.getSource()==b4)
		{
            if(bl)
            {
                s1=String.valueOf(op);
                bl=false;
            }
            if(or=="+")
            {
                op=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op=op/(Double.parseDouble(s3));
            }
            l3.setText(String.valueOf(op));

            or="+";
			s2="+";
            s3="";

				
		}
		else if(e.getSource()==b5)
		{
			s3+="4";	
			s2="4";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
				
		}
		else if(e.getSource()==b6)
		{
			s3+="5";	
			s2="5";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
				
		}
		else if(e.getSource()==b7)
		{
			s3+="6";	
			s2="6";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
				
		}
		else if(e.getSource()==b8)
		{
            if(bl)
            {
                s1=String.valueOf(op);
                bl=false;
            }
            if(or=="+")
            {
                op=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op=op/(Double.parseDouble(s3));
            }
            l3.setText(String.valueOf(op));

            or="-";

			s2="-";	
            s3="";
				
		}
		else if(e.getSource()==b9)
		{
			s3+="7";	
			s2="7";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
				
		}
        else if(e.getSource()==b10)
		{
			s3+="8";	
			s2="8";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
				
		}
		else if(e.getSource()==b11)
		{
			s3+="9";	
			s2="9";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
				
		}
		else if(e.getSource()==b12)
		{
            if(bl)
            {
                s1=String.valueOf(op);
                bl=false;
            }
            if(or=="+")
            {
                op=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op=op/(Double.parseDouble(s3));
            }
            l3.setText(String.valueOf(op));

            or="*";
			s2="*";	
            s3="";
				
		}
		else if(e.getSource()==b13)
		{
			s3+="0";	
			s2="0";	
            op1+=s2;
            op2=op;	
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);
				
		}
		else if(e.getSource()==b14)
		{
            int d=s1.length()-1;
            int x,y,z,q,g=0;
			x=s1.lastIndexOf("+");
			y=s1.lastIndexOf("-");
			z=s1.lastIndexOf("*");
			q=s1.lastIndexOf("/");
			if((x>y)&&(x>z)&&(x>q))
			{
                g=x;
			}
			else if((y>x)&&(y>z)&&(y>q))
			{
                g=y;
			}
			else if((z>y)&&(z>x)&&(z>q))
			{
                g=z;
			}
			else if((q>y)&&(q>x)&&(q>z)){
                g=q;
			}
            if(d>g){
                s1=s1.substring(0,(d));	
                s3=s3.substring(0,(s3.length()-1));	
                op1=op1.substring(0,(op1.length()-1));
            }
            if(or=="+")
            {
                op2=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op2=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op2=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op2=op/(Double.parseDouble(s3));
            }
            op1=String.valueOf(op2);
            l3.setText(op1);	
				
		}
		else if(e.getSource()==b15)
		{
            bl=false;

			s1="";
            op=0;	
            s3="";
            
			 ans=String.valueOf(op);
             l2.setText("ANSWER : "+ans);
            l3.setText("");

            or="+";


				
		}
		else if(e.getSource()==b16)
		{
            if(bl)
            {
                s1=String.valueOf(op);
                bl=false;
            }
            if(or=="+")
            {
                op=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op=op/(Double.parseDouble(s3));
            }
            l3.setText("");

            or="/";
			s2="/";	
            s3="";
				
		}
		else if(e.getSource()==b17)
		{
			// double x,y,z,q,g;
			// x=s1.lastIndexOf("+");
			// y=s1.lastIndexOf("-");
			// z=s1.lastIndexOf("*");
			// q=s1.lastIndexOf("/");
			// if((x>y)&&(x>z)&&(x>q))
			// {
			// 	op=op+Double.parseDouble(s1.substring(x));
			// }
			// else if((y>x)&&(y>z)&&(y>q))
			// {
			// 	op=op-Double.parseDouble(s1.substring(y));
			// }
			// else if((z>y)&&(z>x)&&(z>q))
			// {
			// 	op=op*Double.parseDouble(s1.substring(z));
			// }
			// else if((q>y)&&(q>x)&&(q>z)){
			// 	op=op/Double.parseDouble(s1.substring(q));
			// }


            if(or=="+")
            {
                op=op+(Double.parseDouble(s3));
            }
            else if (or=="-")
            {
                op=op-(Double.parseDouble(s3));
            }
            else if(or=="*")
            {
                op=op*(Double.parseDouble(s3));
            }
            else if(or=="/")
            {
                op=op/(Double.parseDouble(s3));
            }


			
			 ans=String.valueOf(op);
            l2.setText("ANSWER : "+ans);
            // op=0;
            s3="";
            s1="";
            or="";
            bl=true;
				
		}


        s1=s1+s2;
        l1.setText(s1);

		

    }
    public static void main(String[] args) {
        Calculator c=new Calculator();
		
    }
    
}
