import java.util.Iterator;
import java.util.LinkedList;

/*
 <ArrayList와 LinkedList의 비교>
 1. ArrayList
 - 배열구조
 - 장점 : 검색 속도가 빠름. 순차적인 추가/삭제 속도가 빠름
 - 단점 : 비순차적(중간)인 추가>/삭제 속도가 느림
 
 2. LinkedList
 - 노드로 연결된 구조
 - 배열 구조의 단점을 개선
 - 장점 : 비순차적(중간)인 추가/삭제 속도가 빠름
 - 단점 : 검색 속도가 느림, 순차적인 추가/삭제가 느림
 */
public class LinkedListTest01 {
	public static void main(String[] args) {
		// 리스트 생성
		LinkedList<String> list = new LinkedList<String>();
		
		// 데이터 추가
		/*
		list.add("이익준");
		list.add("김준완");
		list.add("양석형");
		list.add("안정원");
		list.add("채송화");
		System.out.println(list);
		*/
		
		// 순차적으로 데이터 추가 - 배열을 추가
		String[] names = {"이익준", "김준완", "양석형", "안정원", "채송화"};
		for(int i = 0; i<names.length; i++) {
			list.add(names[i]);
		}
		System.out.println(list);
		
		// 비순차적(중간) 데이터 추가 - 양석형 다음에 추민하 추가
		/*
		list.add(3, "추민하");
		System.out.println(list);
		*/
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).equals("양석형")) {
				list.add(i+1, "추민하");
			}
		}
		System.out.println(list);
		
		// 데이터 변경 - 안정원을 장겨울로 변경
		//list.set(4, "장겨울");
		for(int i = 0 ; i <list.size(); i++) {
			if(list.get(i).equals("안정원")) {
				list.set(i, "장겨울");
			}
		}
		System.out.println(list);
		
		// 데이터 삭제 - 김준완 삭제
		// list.remove(1);
		for(int i= 0; i< list.size(); i++) {
			if(list.get(i).equals("김준완")) {
				list.remove(i);
			}
		}
		System.out.println(list);
		
		// <LinkedList 클래스에서 추가한 메소드>
		// addFirst() : 맨 처음에 데이터를 추가
		// 리스트의 맨 처음에 안정원 데이터를 추가
		list.addFirst("안정원");
		System.out.println(list);
		
		// addLast() : 맨 끝으로 데이터를 추가
		// 리스트의 맨 뒤에 도재학 데이터 추가
		list.addLast("도재학");
		System.out.println(list);
		
		// removeFirst() : 첫번째 데이터를 삭제
		list.removeFirst();
		System.out.println(list);
		
		// removeLast() : 맨 마지막 데이터를 삭제
		list.removeLast();
		System.out.println(list);
		
		// getFirst() : 
		System.out.println(list.getFirst());
		System.out.println(list);
		System.out.println("------------------");
		
		// getLast() : 
		System.out.println(list.getLast());
		System.out.println(list);
		System.out.println("------------------");
				
		// 출력1 - 기본 for문
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------");
		
		// 출력 2 - 확장 for문
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("----------");
		
		// 출력3 - Iterator 사용
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
	}
}
