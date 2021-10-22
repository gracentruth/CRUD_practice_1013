# CRUD_practice_1013

Arraylist란 ? 

- List 인터페이스를 상속받은 여러 클래스 중 하나
- 생성하기) import java.util.ArrayList 추가 
- ArrayList<타입> 이름 = new ArrayList<타입>()
- 엘레멘트 추가 add() 메소드
- 엘레멘트 변경 set() 메소드
- 엘레멘트 삭제 remove() 메소드
- 특정 엘레멘트 가져오기 get(인덱스)
- 출력 for each문 : 항목변수를 (항목변수 선언:배열명)으로 받는다.
    

- view(), upload() : 완료 (10/13)
- update(), delete() : 완료 (10/19)
- 파일 불러오기 (fileservice) : 미완료    


* 파일 객체 사용 

객체 생성 방법 : File 파일명 = new File(파일 경로 )

파일 불러오기

BufferReader(입력버퍼)와 FileReader(입력스트)

파일의 내용을 한줄씩 읽을때는 버퍼를 이용해서 읽는다 

1. FileReader(File file) 
: character 파일을 읽을 수 있는 기능 제공