public class Core{
	public static void main(String[] args) {
		float x1,y1,x2,y2;
		float len;
		x1= (int) (Math.random()*100);
		y1=	(int) (Math.random()*100);
		x2=(int) (Math.random()*100);
		y2=(int) (Math.random()*100);
		
		float  x1b= (int) (Math.random()*100);
		float  y1b=(int) (Math.random()*100);
		float  x2b=(int) (Math.random()*100);
		float y2b=(int) (Math.random()*100);
		
	LineCompareOOPSUC1 val=new LineCompareOOPSUC1();
	float length1=val.cal_line(x1,y1,x2,y2);
	float lenght2=val.cal_line(x1b, y1b, x2b, y2b);
	System.out.printf("The coordinates are (%.2f,%.2f) and (%.2f,%.2f)",x1,y1,x2,y2);
	System.out.printf("\nThe coordinates are (%.2f,%.2f) and (%.2f,%.2f)",x1b,y1b,x2b,y2b);
	val.comp_len(length1, lenght2);
	val.chk_equal(length1, lenght2);
	}
}