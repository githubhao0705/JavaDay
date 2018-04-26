
public class homeWork {
	public static void main(String[] args) {
		// 习题：1.11
		//+7 +1
		//+13 -1
		//+45 -1
		
		int people = 312032486;
		int seconds=365*24*60*60;
		 
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("第一年的人口总和为：");
		System.out.println(people);
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("第二年的人口总和为：");
		System.out.println(people);
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("第三年的人口总和为：");
		System.out.println(people);
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("第四年的人口总和为：");
		System.out.println(people);
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("第五年的人口总和为：");
		System.out.println(people);

		System.out.println();
		
		
		// 习题：1.13
		/*	ax+by=e   		ed-bf			af-ec
		 *	 			x= -------		y= -------
		 * 	cx+dy=f			ad=bc			ad-bc
		 */
		
		double x,y;
		
		System.out.println("3.4x+50.2y=44.5");
		System.out.println("2.1x+0.55y=5.9"+"\n");
		
		System.out.println("2x2线性方程的解为：");
		x=(44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1);
		System.out.println("x="+x);
		y=(3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1);
		System.out.println("y="+y);
	}
}
