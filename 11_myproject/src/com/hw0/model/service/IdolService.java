package com.hw0.model.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.hw0.model.dto.IdolDebut;

public class IdolService {

	private Scanner sc = new Scanner(System.in);
	
	private List<IdolDebut> library = new ArrayList<IdolDebut>();
	
	
	public IdolService() {
		
		library.add(new IdolDebut("Ive", 2021, "ELEVEN",Arrays.asList("원영","유진","가을","레이","이서","리즈")));
		library.add(new IdolDebut("Stay C", 2020, "So Bad",Arrays.asList("윤","아이사","재이","수민","시은","세은"  )));
		library.add(new IdolDebut("르세라핌", 2022, "Fealess",Arrays.asList("카즈하","사쿠라","채원","은채","윤진")));
		library.add(new IdolDebut("에스파", 2022, "Black Mamba",Arrays.asList("카리나","윈터","지젤","닝닝" )));
	}
		
	public void IdolMenu() {
		try {
			
			int menuNum = 0 ;
		
		do {
			System.out.println("===아이돌 검색 프로그램===");
			System.out.println("1.그룹정보 등록");			
			System.out.println("2.그룹정보 조회");
			System.out.println("3.그룹정보 수정");
			System.out.println("4.그룹정보 삭제");
			System.out.println("0. 프로그램 종료");
			
			System.out.println();
			System.out.print("메뉴를 입력하세요 : ");
			menuNum = sc.nextInt();
			
			
			switch(menuNum) {
			case 1 : System.out.println(addGroup()); break;
			case 2 : showGroupList(library); break;
			
			case 3 : System.out.println(editgroup()); break;
			
			case 4 : System.out.println(deletgroup()); break;
			case 0 : System.out.println("종료되었습니다."); break;
			default : System.out.println("메뉴에 있는 번호만 입력하세요!"); break;
			}
			
		}while(menuNum !=0);
		
		}catch (Exception e) {
			// Exception : 예외 클래스의 최상위 클래스
			System.out.println("예외 발생");
			e.printStackTrace(); // 예외추적 //오류 내용을 출력
		}
	}

	//신규 그룹 등록용 메서드 
	public String addGroup() {
System.out.println("========그룹 등록=========");
		
		System.out.print("그룹 : ");
		String groupinput = sc.nextLine();
		sc.nextLine(); 
		
		System.out.print("데뷔 년도 : ");
		int debutyearinput = sc.nextInt();
		sc.nextLine(); 
		
		System.out.print("데뷔곡 : ");
		String titleinput = sc.nextLine();
		
		System.out.print("멤버 : ");
		String memberinput = sc.nextLine();
		
		
		List<String> memberinputs = new ArrayList<>(Arrays.asList(memberinput.split(",")));

		
		IdolDebut newIdolDebut = new IdolDebut(groupinput,debutyearinput, titleinput ,memberinputs);
		
		library.add(newIdolDebut);
		
		return "등록 완료";
		
	}

	
	//그룹 조회용 메서드 
	public void showGroupList(List<IdolDebut>list) {
		if(list.isEmpty()) { 
			System.out.println("등록된 그룹이 없습니다. 그룹을 등록해주세요!");
		} else {
			
			// list를 순회하면서 각 객체를 출력
			for(IdolDebut temp : list) {
				System.out.println(temp); 
			}
			
		}
		
	}
	

	
	// 그룹 수정용 메서드
	// @return
	 
	public String editgroup() {
	    showGroupList(library); // 현재 그룹 목록 출력

	    System.out.println("======그룹 정보 수정========");

	    int editMenu = 0; // 수정 메뉴 선택용 변수

	    System.out.print("수정할 그룹명을 입력하세요: ");
	    String name = sc.nextLine(); // 사용자가 수정할 그룹명 입력

	    boolean flag = true; // 그룹을 찾았는지 확인하는 변수

	    for (IdolDebut temp : library) { // 그룹 목록을 순회하며 찾기
	        if (temp.getGroup().equals(name)) { // 입력한 그룹명을 찾았을 때

	            flag = false; // 그룹이 존재함을 표시

	            System.out.println("1. 그룹명 수정");
	            System.out.println("2. 데뷔년도 수정");
	            System.out.println("3. 데뷔곡 수정");
	            System.out.println("4. 멤버 수정");
	            System.out.println("0. 수정 종료");
	            System.out.print("어떤 정보를 수정하시겠습니까? ");

	            editMenu = sc.nextInt();
	            sc.nextLine(); // 개행 문자 제거

	            switch (editMenu) {
	                case 1:
	                    System.out.println("===그룹명 수정===");
	                    System.out.print("수정할 그룹명을 입력하세요: ");
	                    String groupname = sc.nextLine();
	                    temp.setGroup(groupname);
	                    break;

	                case 2:
	                    System.out.println("===데뷔 년도 수정===");
	                    System.out.print("수정할 데뷔년도를 입력하세요: ");
	                    int year = sc.nextInt();
	                    sc.nextLine(); // 개행 문자 제거
	                    temp.setDebutyear(year);
	                    break;

	                case 3:
	                    System.out.println("===데뷔곡 수정===");
	                    System.out.print("수정할 노래를 입력하세요: ");
	                    String song = sc.nextLine();
	                    temp.setTitle(song);
	                    break;

	                case 4:
	                    System.out.println("===멤버 수정===");
	                    System.out.print("수정할 멤버를 입력하세요 (공백으로 구분): ");
	                    String memberInput = sc.nextLine();
	                    List<String> members = new ArrayList<>(Arrays.asList(memberInput.split(","))); 
	                    temp.setMember(members);
	                    break;

	                case 0:
	                    System.out.println("수정을 종료합니다.");
	                    break;

	                default:
	                    System.out.println("올바른 번호를 입력하세요.");break;
	                    
	         
	            }
	        }
	        
	        }
	    
	    if (flag) {
	        return "해당 그룹을 찾을 수 없습니다.";
	    }

	    return "수정 완료!";
	
	  
	}

	/** 도서 삭제용 메서드
	 * @return
	 */
	public String deletgroup() {
		System.out.println("====그룹 삭제=====");
		
		showGroupList(library);
		
		System.out.print("삭제할 그룹명을 입력하세요 : ");
		String deletename = sc.nextLine();
		
		for(IdolDebut temp : library) {
			
			if(temp.getGroup().equals(deletename)) {
				int index = library.indexOf(temp);
				// int List.indexOf(Object) : List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
				
				System.out.println("index 번호 : " + index);
				
				System.out.print("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0); // "y" -> "Y" -> 'Y'
				
				if(answer == 'Y') {
					library.remove(index);
					break;
				} else {
					return "삭제를 진행하지 않습니다";
				}
			}
			
		}
		
		return "삭제 끝";
	}
	
}
