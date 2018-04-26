package homeWork00;

public class Dog {
	// 课堂习题
	// 创建一个Dog类，包含昵称，亲密度两上属性，
	// 创建测试类，完成以下任务
	// 需求说明：
	// 把多个Dog的信息添加到集合中
	// 查看Dog的数量及所有Dog的信息
	// 删除集合中部分Dog的元素
	// 判断集合中是否包含指定Dog
	private String name;
	private int love;

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(String name, int love) {
		super();
		this.name = name;
		this.love = love;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLove() {
		return love;
	}

	public void setLove(int love) {
		this.love = love;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "昵称：" + name + "\t亲密度：" + love + "\n";
	}
}
