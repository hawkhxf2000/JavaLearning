package CollectionPractice;

import java.util.ArrayList;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		News news1 = new News("新冠确诊病例额超千万，数百万印度教信徒赴恒河\"圣浴引民众担忧\"");
		News news2 = new News("男子突然想起2个月前钓的鱼还在网兜中，捞起一看赶紧放生");
		
		ArrayList<News> newsList = new ArrayList<>();
		newsList.add(news1);
		newsList.add(news2);
		
		for(int i=newsList.size()-1;i>=0;i--) {
//			String title = newsList.get(i).toString();
			News news= (News) newsList.get(i);
			System.out.println(news.processTitle(news.toString()));
		}
	}
//	public static String processTitle(String title) {
//	 if (title == null) {
//		 return "";
//	 }
//	 
//	 if(title.length() > 15) {
//		 return title.substring(0,15) + "...";
//	 }else {
//		 return title;
//	 }
// }
}

class News{
	private String title;
	private String content;
	
	//提供一个有参构造器
	public News(String title) {
		this.title = title;
	}
	
	//设置getter,setter方法
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
		
	}
	
	public String processTitle(String title) {
		 if (title == null) {
			 return "";
		 }
		 
		 if(title.length() > 15) {
			 return title.substring(0,15) + "...";
		 }else {
			 return title;
		 }
	 }
}