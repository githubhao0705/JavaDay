
public class HomeWork {
	public static void main(String[] args) {
		// 1.使用面向对象的思想，编写自定义描述狗的信息。
		// 设定属性包括：品种，年龄，心情，名字；方法包括：叫，跑。
		// 要求：
		// 1)设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
		// 2)限定心情只能有“心情好”和“心情不好”两种情况，
		// 如果无效输入进行提示，默认设置“心情好”。
		// 3)设置构造函数实现对属性赋值
		// 4)叫和跑的方法，需要根据心情好坏，描述不同的行为方式。
		// 5)编写测试类，测试狗类的对象及相关方法（测试数据信息自定义）
		Dog dog1=new Dog("龙啸天", 99, "中华田园犬");
		
		dog1.getAge();
		
		dog1.run();
		// 2.以面向对象的思想，编写自定义类描述IT从业者。
		// 设定属性包括：姓名，年龄，技术方向，工作年限,
		// 工作单位和职务；方法包括：工作
		// 要求：
		// 1) 设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
		// 2) 限定IT从业人员必须年满15岁，无效信息需提示，并设置默认年龄为15。
		// 3) 限定“技术方向”是只读属性
		// 4) 工作方法通过输入参数，接收工作单位和职务，输出个人工作信息
		// 5) 编写测试类，测试IT从业者类的对象及相关方法（测试数据信息自定义）
		
		
		// 1.以面向对象的思想，编写自定义类描述图书信息。设定属性包括：书名，
		// 作者，出版社名，价格；方法包括：信息介绍
		// 要求：
		// 1)设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
		// 2)限定介格必须大于10，如果无效进行提示
		// 3)限定作者，书名境外为只读属性
		// 4)设计构造方法实现对属性赋值
		// 5)信息介绍方法描述图书所有信息
		// 6)编写测试类，测试图书类的对象及相关方法（测试数据信息自定）

		// 2.某公司要开发名为”我爱购物狂”的购物网站，
		// 请使用面向对象的思想设计描述商品信息
		// 要求：
		// 1)分析商品类别和商品详细信息属性和方法，
		// 设计商品类别类和商品详细信息类
		// 2)在商品详细信息类中通过属性描述该商品所属类别
		// 3)设置属性的私有访问权限，通过公有的get,set方法实现对属性的访问
		// 4)编写测试类，测试商品类别类和商品详细信息类的对象及相关方法
		// （测试数据信息自定）
		// 5)创建包info—存放商品类别类和商品详细信息类，
		// 创建包test—存放测试类
		// 参考分析思路:
		// 商品类别类：
		// 属性：类别编号，类别名称
		// 商品详细信息类：
		// 属性：商品编号，商品名称，所属类别，商品数量（大于0），
		// 商品价格（大于0），
		// 方法：盘点的方法，描述商品信息。内容包括商品名称，
		// 商品数量，商品价格，现在商品总价以及所属类别信息
	}
}
