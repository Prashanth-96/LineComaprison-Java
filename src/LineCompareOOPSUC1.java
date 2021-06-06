class LineCompareOOPSUC1{
	public static float cal_line(float x1,float y1,float x2,float y2)
	{
		float len=(int)Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y2-y1), 2)));
		return len;
	}
	public static void comp_len(float len_a,float len_b)
	{
		Float length_1=new Float(len_a);
		Float length_2=new Float(len_b);
		if (length_1.equals(length_2)) {
		System.out.println("Two lines are equal"+length_1.equals(length_2));
		
		}
		else {
		System.out.println("\nTwo lines are unequal");
		
		}
		
	}
	public static void chk_equal(float len_a,float len_b)
	{
	
		 if (Float.compare(len_a, len_b)<0) {
			System.out.printf("Line 1 : %.2f ,is shorter than line 2:  %.2f",len_a,len_b);
		 }
			
		else if (Float.compare(len_a, len_b)==1) {
			System.out.printf("Line 1 :%.2f is greater than line 2  :%.2f",len_a,len_b);
			
			
			
				
		}
	}
}  

