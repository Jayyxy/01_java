package edu.kh.collection.pack2.model.service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetService {
	
	
	/* Set(집합, 주머니)
	 * - 기본적으로 순서를 유지하지 않음
	 * 	(index 없음 ! -> get() 메서드가 없음)
	 * 
	 * - 중복데이터는 저장 x
	 * 
	 * Set 인터페이스의 자식 클래스 
	 * 1.HashSet(대표) : 처리속도가 빠
	 * 2.LinkedHashSet : 순서를 유지하는 Set
	 * 3.TreeSet : 자동 정렬되는 Set
	 *  
	 *
	 */

	
	public void method1() {
		
		
	//HashSet 객체 생성
	Set<String> set = new HashSet<>();
	//Set<String> set = new TreeSet<>();
	//Set<String> set = new LinkHashSet<>();
	
	
	//HashSet
	//TreeSet
	//LinkHashSet
	
	//1.boolean add(E e) : 추가 
	set.add("네이버");
	set.add("카카오");
	set.add("라인");
	set.add("쿠팡");
	set.add("배달의 민족");
	set.add("당근마켓");
	set.add("토스");
	set.add("직방");
	set.add("야놀자");

	//중복저장 
	set.add("배달의 민족");
	set.add("배달의 민족");
	set.add("배달의 민족");
	set.add("배달의 민족");
	set.add("배달의 민족");

	//null 도 중복 x	확인
	set.add(null);
	set.add(null);
	set.add(null);
	set.add(null);
	
	System.out.println(set);
	
	//2. int size() : Set에 저장된 객체의 수 반환 
	System.out.println("set의 size() : " + set.size());
	
	//3. boolean remove(E e) : 
	//전달받은 매개변수 e를 Set에서 제거
	// 제거성공 true, 업의면 false
	System.out.println(set.remove("배달의 민족"));
	System.out.println(set);
	System.out.println(set.remove("유플러스"));
	
	//4.boolean contain(E e):
	//전달받은 e가 Set에 있으면 true, 없으면 false 
	System.out.println("쿠팡 있는지 검사 : " + set.contains("쿠팡"));
	System.out.println("삼성 있는지 검사 : " + set.contains("삼성"));
	
	
	//5.void clear() : set에 저장된 내용을 모두 삭제 
	set.clear();
	
	
	//6.boolean isEmpty() : 비어있으면 true, 아니면false
	
	System.out.println(set.isEmpty());  
	System.out.println(set);  
	}
	
	/*
	 * Set에 저장된 요소(객체)를 꺼내는 방법
	 * 
	 * 1. Iterator(반복자) 이용
	 * 2. List로 반환
	 * 3. 향상된 for문 이용 
	 */
	public void method2() {
		
		Set<String> set = new HashSet<String>();
		
		set.add("몽쉘");
		set.add("꼬북칩");
		set.add("쿠쿠다스");
		set.add("빈츠");
		set.add("포카칩");
		
		//1.iterator (반복자)
		// - 컬랙션 객체에 저장된 요소를 
		//	하나씩 순차 접근하는 객체
		
		// Iterator set.iterator();
		// - 현재 Set을 순차 접근할 수 있는 Iterator 객체 반환
		
		Iterator<String> it = set.iterator();
		
		
		//boolean Iterator.hasNext() : 
		//다음 순차 접근할 요소가 있으면 true 없으면 false 
		
		while(it.hasNext()) {
			//다음 요소가 있으면 반복, 없으면 멈춤
			
			// E Iterator.next() : 다음 요소를 꺼내와 반
			String temp = it.next();
			System.out.println(temp);
		}
		
		System.out.println("--------------------------");
		System.out.println("[List 반환]");
		
		//set에 저장된 객체를 이용해서 List생성
		
		List<String> list = new ArrayList<>(set);
		
		 
	}
}

