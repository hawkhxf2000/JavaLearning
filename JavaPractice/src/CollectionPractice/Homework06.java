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
		
		p1.setName("CC"); //p1��Ȼ��HashTable��ԭ������λ�ã�����ֵ�Ѿ����ı�
		
		hashSet.remove(p1);  //p1��name���ĺ�Hashֵ�Ѿ��ı䣬������HashSet��HashTable���Ҳ�����ǰp1�����Դ�ɾ����Ч
		System.out.println(hashSet);
		
		hashSet.add(new Person(1001, "CC")); //1001��"CC"�����µ�Hashֵ����˿��Լ���HashSet��
		System.out.println(hashSet);
		
		/*1001��"AA"��Hashֵ�������p1��Hashֵһ������˻���뵽�����p1������λ�ã��������ڸ�λ�õ�p1��ֵ�Ѿ����޸ģ�
		 * �����µ�p1ֵ���ʱ��������ݵ�Hashֵ����ȣ���˴�ʱ��������ݻ����ӵ��µ�p1���γɵ�������
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
	
	
	
