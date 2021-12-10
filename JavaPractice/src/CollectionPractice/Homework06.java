package CollectionPractice;

import java.util.HashSet;
import java.util.Objects;

import org.junit.jupiter.api.Test;

public class Homework06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hashSet = new HashSet<>();
		Person p1 = new Person(1001, "AA");
		Person p2 = new Person(1002, "BB");
		
		hashSet.add(p1);
		hashSet.add(p2);
		
		p1.setName("CC"); //p1仍然在HashTable的原有索引位置，但数值已经被改变
		
		hashSet.remove(p1);  //p1的name更改后，Hash值已经改变，所以在HashSet的HashTable中找不到当前p1，所以此删除无效
		System.out.println(hashSet);
		
		hashSet.add(new Person(1001, "CC")); //1001，"CC"具有新的Hash值，因此可以加入HashSet中
		System.out.println(hashSet);
		
		/*1001，"AA"的Hash值与最早的p1的Hash值一样，因此会加入到最早的p1的索引位置，但由于在该位置的p1的值已经被修改，
		 * 所以新的p1值与此时输入的数据的Hash值不相等，因此此时输入的数据会链接到新的p1后形成单向链表
		 */
		hashSet.add(new Person(1001, "AA")); 
		System.out.println(hashSet);
	}

}


class Person {
	private int id;
	private String name;
	
	public Person(int id, String name) {
		this.name = name;
		this.id = id;
	}

	@Test
	public int getId() {
		return id;
	}

	@Test
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}

	
	
	
}
	
	
	
