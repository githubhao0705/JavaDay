public class testForPostIncrementAndPreIncrement {
	public static void main(String[] args) {
		int a=1,b;
		b=a++;
		//���տ���ԭ�����Ȱ�a��ֵ��b����ʱ��bΪ1��Ȼ��a���Լӣ�����aΪ2��
		System.out.println(a);
		System.out.println(b);
		//�Ҳ��������a=2��b=1������ʵ�飬��ȷ����ԭ����ok�ġ�
		System.out.println("==================");
		int c=1,d;
		d=++c;
		//���տ���ԭ������c�Լӣ���ʱcΪ2��Ȼ���ٰ�ֵ����d��d��ʱΪ2������c��ҲΪ2��
		System.out.println(c);
		System.out.println(d);
		//�Ҳ��������c=2��d=2������ʵ�飬��ȷ����ԭ����ok�ġ�
	}
}
