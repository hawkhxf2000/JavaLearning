
import java.util.TreeSet;

public class TreeSetDemo {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet nums = new TreeSet();
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
		
		//输出集合元素，看到集合元素已经处于排序状态
		System.out.println(nums);
		
		//输出集合中的第一个元素
		System.out.println(nums.first());
		
		//输出集合中的最后一个元素
		System.out.println(nums.last());
		
		//返回小于4的子集，不包含4
		System.out.println(nums.headSet(4));
		
		//返回大于5的子集，如果Set中含有5，子集中也包含5
		System.out.println(nums.tailSet(5));
		
		//返回大于等于-3、小于4的子集
		System.out.println(nums.subSet(-3, 4));
	}

}
