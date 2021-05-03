import java.util.Scanner;
class Civilmate
{
	

	public static void main(String args[])
	{
		int i,s,nor,now,ch;
	    double a_f,a_w=0,a_c,temp,v=0,q_c,c_c,q_b,c_b,q_s,c_s,m_c=0,n_m=0,n_d=0,w_c=0,total=0;
		double[] room1 = new double[500];
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO CIVILMATE");
		System.out.println("--------------------\n");
		System.out.println("Enter the number of rooms that the building consists of :");
		nor=sc.nextInt();
		if(nor==1)
		{
			System.out.println("Enter the dimensions of the floor");
			for(i=0;i<2;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the number of walls of the room.. exclude if it is a common wall ");
			now=sc.nextInt();
			System.out.println("Enter the dimensions of the walls (Length and breadth of each wall)");
			for(i=2;i<(2+(2*now));i++)
			{
				room1[i]=sc.nextDouble();
			}
			a_f=room1[0]*room1[1];
			for(i=2;i<(2+(2*now));i+=2)
			{
				temp=room1[i]*room1[i+1];
				a_w=temp+a_w;

			}
			v=a_w*0.23;
			a_c=a_f;
			System.out.println("The areas are :");
			System.out.println("The area of floor and ceiling is :"+a_c);
			System.out.println("The area of walls is : "+a_w);
			System.out.println("The volumes of the walls are :");
			System.out.println(" Volume of walls in cubic meters : "+v);

	}
		if(nor==2)
		{	
			System.out.println("Enter the dimensions of the floor of room 1");
			for(i=0;i<2;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 2");
			for(i=400;i<402;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the number of walls .. exclude if it is a common wall ");
			now=sc.nextInt();
			System.out.println("Enter the dimensions of the walls (Length and breadth of each wall)");
			for(i=2;i<(2+(2*now));i++)
			{
				room1[i]=sc.nextDouble();
			}
			a_f=(room1[0]*room1[1])+(room1[400]*room1[401]);
			for(i=2;i<(2+(2*now));i+=2)
			{
				temp=room1[i]*room1[i+1];
				a_w=temp+a_w;

			}

			v=a_w*0.23;
			a_c=a_f;
			System.out.println("The areas are :");
			System.out.println("The area of floor and ceiling is :"+a_c);
			System.out.println("The area of walls is : "+a_w);
			System.out.println("The volumes of the walls are :");
			System.out.println(" Volume of walls in cubic meters : "+v);
}

			if(nor==3)
			{
			System.out.println("Enter the dimensions of the floor of room 1");
			for(i=0;i<2;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 2");
			for(i=400;i<402;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 3");
			for(i=402;i<404;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the number of walls .. exclude if it is a common wall ");
			now=sc.nextInt();
			System.out.println("Enter the dimensions of the walls (Length and breadth of each wall)");
			for(i=2;i<(2+(2*now));i++)
			{
				room1[i]=sc.nextDouble();
			}
			a_f=(room1[0]*room1[1])+(room1[400]*room1[401])+(room1[402]*room1[403]);
			for(i=2;i<(2+(2*now));i+=2)
			{
				temp=room1[i]*room1[i+1];
				a_w=temp+a_w;

			}

			v=a_w*0.23;
			a_c=a_f;
			System.out.println("The areas are :");
			System.out.println("The area of floor and ceiling is :"+a_c);
			System.out.println("The area of walls is : "+a_w);
			System.out.println("The volumes of the walls are :");
			System.out.println(" Volume of walls in cubic meters : "+v);
}		
		
if(nor==4)
			{
			System.out.println("Enter the dimensions of the floor of room 1");
			for(i=0;i<2;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 2");
			for(i=400;i<402;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 3");
			for(i=402;i<404;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 4");
			for(i=404;i<406;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the number of walls .. exclude if it is a common wall ");
			now=sc.nextInt();
			System.out.println("Enter the dimensions of the walls (Length and breadth of each wall)");
			for(i=2;i<(2+(2*now));i++)
			{
				room1[i]=sc.nextDouble();
			}
			a_f=(room1[0]*room1[1])+(room1[400]*room1[401])+(room1[402]*room1[403])+(room1[404]*room1[405]);
			for(i=2;i<(2+(2*now));i+=2)
			{
				temp=room1[i]*room1[i+1];
				a_w=temp+a_w;

			}

			v=a_w*0.23;
			a_c=a_f;
			System.out.println("The areas are :");
			System.out.println("The area of floor and ceiling is :"+a_c);
			System.out.println("The area of walls is : "+a_w);
			System.out.println("The volumes of the walls are :");
			System.out.println(" Volume of walls in cubic meters : "+v);
}		
		
		if(nor==5)
			{
			System.out.println("Enter the dimensions of the floor of room 1");
			for(i=0;i<2;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 2");
			for(i=400;i<402;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 3");
			for(i=402;i<404;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 4");
			for(i=404;i<406;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 5");
			for(i=406;i<408;i++)
			{
				room1[i]=sc.nextDouble();
			}
			
			System.out.println("Enter the number of walls .. exclude if it is a common wall ");
			now=sc.nextInt();
			System.out.println("Enter the dimensions of the walls (Length and breadth of each wall)");
			for(i=2;i<(2+(2*now));i++)
			{
				room1[i]=sc.nextDouble();
			}
			a_f=(room1[0]*room1[1])+(room1[400]*room1[401])+(room1[402]*room1[403])+(room1[404]*room1[405])+(room1[406]*room1[407]);
			for(i=2;i<(2+(2*now));i+=2)
			{
				temp=room1[i]*room1[i+1];
				a_w=temp+a_w;

			}

			v=a_w*0.23;
			a_c=a_f;
			System.out.println("The areas are :");
			System.out.println("The area of floor and ceiling is :"+a_c);
			System.out.println("The area of walls is : "+a_w);
			System.out.println("The volumes of the walls are :");
			System.out.println(" Volume of walls in cubic meters : "+v);
}		
				if(nor==6)
			{
			System.out.println("Enter the dimensions of the floor of room 1");
			for(i=0;i<2;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 2");
			for(i=400;i<402;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 3");
			for(i=402;i<404;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 4");
			for(i=404;i<406;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 5");
			for(i=406;i<408;i++)
			{
				room1[i]=sc.nextDouble();
			}
			System.out.println("Enter the dimensions of the floor of room 6");
			for(i=408;i<410;i++)
			{
				room1[i]=sc.nextDouble();
			}
			
			System.out.println("Enter the number of walls .. exclude if it is a common wall ");
			now=sc.nextInt();
			System.out.println("Enter the dimensions of the walls (Length and breadth of each wall)");
			for(i=2;i<(2+(2*now));i++)
			{
				room1[i]=sc.nextDouble();
			}
			a_f=(room1[0]*room1[1])+(room1[400]*room1[401])+(room1[402]*room1[403])+(room1[404]*room1[405])+(room1[406]*room1[407])+(room1[408]*room1[409]);
			for(i=2;i<(2+(2*now));i+=2)
			{
				temp=room1[i]*room1[i+1];
				a_w=temp+a_w;

			}

			v=a_w*0.23;
			a_c=a_f;
			System.out.println("The areas are :");
			System.out.println("The area of floor and ceiling is :"+a_c);
			System.out.println("The area of walls is : "+a_w);
			System.out.println("The volumes of the walls are :");
			System.out.println(" Volume of walls in cubic meters : "+v);
}		

		q_c=57.60*v;
		c_c=q_c*3.88;
		q_b=512*v;
		c_b=v*2971;
		q_s=v*0.20;
		c_s=v*130.45;
			
		System.out.println("The quantity of cement required is : "+q_c+" kgs");
		System.out.println("The cost for cement required is : "+c_c+" rupees");	
		System.out.println("The quantity of bricks required is : "+q_b+" bricks");
		System.out.println("The cost for bricks required is : "+c_b+" rupees");	
		System.out.println("The quantity of sand required is : "+q_s+" cu.m");
		System.out.println("The cost for sand required is : "+c_s+" rupees");	
		
		System.out.println("Enter the number of masons to hire ");
		n_m=sc.nextInt();
			
		
		System.out.println("Enter the type of mason required ... 1 for 1st class 2 for 2nd class 3 for unskilled ");
		ch=sc.nextInt();
		
		switch(ch)
		{
			case 1:
				n_d=(v)/(0.24*n_m);
				m_c=n_d*n_m*142.50;
				break;
			case 2:
				n_d=(v)/(0.56*n_m);
				m_c=n_d*n_m*308;
				break;
			case 3:
				n_d=(v)/(1.89*n_m);
				m_c=n_d*n_m*945;	
				break;
			default:
				System.out.println("Enter the correct option ");
				break;
		}
		System.out.println("Number of days required is : "+n_d);
		System.out.println("The cost for mason is : "+m_c+" rupees");
		
		total=c_c+c_b+c_s+m_c;
		

		System.out.println("The total cost is : "+total+" rupees");
					



	}
}