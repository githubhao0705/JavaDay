
public class homeWork {
	public static void main(String[] args) {
		// ϰ�⣺1.11
		//+7 +1
		//+13 -1
		//+45 -1
		
		int people = 312032486;
		int seconds=365*24*60*60;
		 
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("��һ����˿��ܺ�Ϊ��");
		System.out.println(people);
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("�ڶ�����˿��ܺ�Ϊ��");
		System.out.println(people);
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("��������˿��ܺ�Ϊ��");
		System.out.println(people);
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("��������˿��ܺ�Ϊ��");
		System.out.println(people);
		people=people+(seconds/7-seconds/13-seconds/45);
		System.out.print("��������˿��ܺ�Ϊ��");
		System.out.println(people);

		System.out.println();
		
		
		// ϰ�⣺1.13
		/*	ax+by=e   		ed-bf			af-ec
		 *	 			x= -------		y= -------
		 * 	cx+dy=f			ad=bc			ad-bc
		 */
		
		double x,y;
		
		System.out.println("3.4x+50.2y=44.5");
		System.out.println("2.1x+0.55y=5.9"+"\n");
		
		System.out.println("2x2���Է��̵Ľ�Ϊ��");
		x=(44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1);
		System.out.println("x="+x);
		y=(3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1);
		System.out.println("y="+y);
	}
}
