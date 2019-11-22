import java.util.Scanner;

public class R3Vector {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		double[] vector1 = new double [3], vector2 = new double [3];
		for (int i=0; i<3; i++) {
			System.out.println("������� " + (i+1) + "�� ���������� ������� �������");
			vector1[i]= s.nextDouble();
		}
		for (int i=0; i<3; i++) {
			System.out.println("������� " + (i+1) + "�� ���������� ������� �������");
			vector2[i]= s.nextDouble();
		}
		System.out.println("������ ��������� ������:");
		for (int i=0; i<3; i++) {
			System.out.print(vector1[i] + " ");
			
			
		}
		System.out.println("\n ������ ��������� ������:");
		for (int i=0; i<3; i++) {
			System.out.print(vector2[i] + " ");
			
			
		}
		System.out.println("\n �������� ��������:(1-��������)(2-���������)(3-��������� �� �����)(4-��������� ������������)(5-��������� ������������)(6-�������� ������������)");
		int comm=s.nextInt();
		if (comm==1)addition(vector1,vector2);
		if (comm==2)subtraction(vector1,vector2);
		if (comm==3)multiplication(vector1);
		if (comm==4)scalarMult(vector1,vector2);
		if (comm==5)vectorMult(vector1,vector2);
		if (comm==6)smeshMult(vector1,vector2);
		else addition(addition(vector1,vector1),vector1);
	}
	static double[] addition(double[] v1 ,double[] v2) {
		double[] c = new double [3];
		c[0]=v1[0]+v2[0];
		c[1]=v1[1]+v2[1];
		c[2]=v1[2]+v2[2];
		System.out.println("������� ������=");
		for (int i =0; i<3; i++) {
			System.out.print(" "+ c[i]);
		}
		
		return (c);
	}
	static double[] subtraction(double[] v1 ,double[] v2) {
		double[] c = new double [3];
		c[0]=v1[0]-v2[0];
		c[1]=v1[1]-v2[1];
		c[2]=v1[2]-v2[2];
		System.out.println("������� ������=");
		for (int i =0; i<3; i++) {
			System.out.print(" "+ c[i]);
		}
		
		return (c);
	}
	static double[] multiplication(double[] v1) {
		double[] c = new double [3];
		Scanner s= new Scanner(System.in);
		System.out.println("������� �����, �� ������� ����� ������� ������");
		double k=s.nextDouble();
		c[0]=v1[0]*k;
		c[1]=v1[1]*k;
		c[2]=v1[2]*k;
		System.out.println("������� ������=");
		for (int i =0; i<3; i++) {
			System.out.print(" "+ c[i]);
		}
		
		return (c);
	}
	static double scalarMult(double[] v1 ,double[] v2) {
		double[] c = new double [3];
		double scalar;
		c[0]=v1[0]*v2[0];
		c[1]=v1[1]*v2[1];
		c[2]=v1[2]*v2[2];
		scalar=c[0]+c[1]+c[2];
		System.out.println("\n ��������� ������������ ���� ��������="+ scalar +"\n");
		return (scalar);
	}
	static double[] vectorMult(double[] v1 ,double[] v2) {
		double[] vec = new double [3];
		//double vecChislo;
		vec[0]=v1[1]*v2[2]-v2[1]*v1[2];	//x
		vec[1]=-(v1[0]*v2[2]-v2[0]*v1[2]);	//y
		vec[2]=v1[0]*v2[1]-v2[0]*v1[1];	//z
		
		System.out.println("������� ������=");
		for (int i =0; i<3; i++) {
			System.out.print(" "+ vec[i]);
		}
		//vecChislo=Math.sqrt(Math.pow(vec[0],2)+Math.pow(vec[1],2)+Math.pow(vec[2],2));
		
		return (vec);
	}
	static double smeshMult(double[] v1 ,double[] v2) {
	 	Scanner s=new Scanner(System.in);
	 	double smesh=0;
	 	double[] v3 = new double[3];
	 	for (int i=0; i<3; i++) {
			System.out.println("������� " + (i+1) + "�� ���������� �������� �������");
			v3[i]= s.nextDouble();
			}
		System.out.println("\n ������ ��������� ������:");
		for (int i=0; i<3; i++) {
			System.out.print(v3[i] + " ");			
		}
		smesh=scalarMult(vectorMult(v1,v2),v3);
		
		System.out.println("�������� ������������= "+smesh);
	return(smesh);	
	}
}

