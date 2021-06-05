public class Core{
	public static void main(String[] args) {
		float x1,y1,x2,y2;
		float len;
		x1= (int) (Math.random()*100);
		y1=	(int) (Math.random()*100);
		x2=(int) (Math.random()*100);
		y2=(int) (Math.random()*100);
	LineCompareOOPSUC1 val=new LineCompareOOPSUC1();
	float length=val.cal_line(x1,y1,x2,y2);
	System.out.println("The length is "+ length);
	}
}