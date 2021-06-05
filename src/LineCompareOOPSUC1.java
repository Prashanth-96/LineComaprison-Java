class LineCompareOOPSUC1{
	public static float cal_line(float x1,float y1,float x2,float y2)
	{
		float len=(int)Math.sqrt(Math.pow((x1-x2),2)+(Math.pow((y2-y1), 2)));
		return len;
	}
}

