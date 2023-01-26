/*
	DML
    C : insert / into	데이터 추가
    R : select / from	데이터 조회
    U : update / set	데이터 수정
    D : delete / from	데이터 삭제
*/

/*==============<< insert >>================*/

select * from student_mst;

-- insert into 
-- 	`db_study2_explain`.`student_mst`
--     (`student_id`, `student_name`) 
--     values (4, '홍길동');

insert into student_mst
	(student_id, student_name, 	mentor_id)
    
values
	(5, 			'홍길동', 		10),
	(6, 			'백길동', 		10),
	(7, 			'청길동', 		10),
	(8, 			'흑길동', 		10);
    
select * from student_mst;
    
/*===========<< university>>=========*/
insert into university_mst
	(university_id, university_name)
    
values
	(	4,				'부경대'),
	(	5,				'경성대'),
	(	6,				'동아대'),
	(	7,				'동의대');
    
    select * from university_mst;
    
 
/*==============<< update >>================*/
select * from student_mst;

update student_mst
set
	student_name = '고바꿈',
	mentor_id = 15
where
	student_id = 5;
    
select * from student_mst;
    
/* 멘토 아이디가 10인 학생들의 멘토 아이디를 1로 바꿔라 */
select * from student_mst;

update student_mst
set
	mentor_id = 1
where
	mentor_id = 10;
    
select * from student_mst;

/*==============<< delete >>================*/
select * from student_mst;

delete
from
	student_mst
where 
	student_id = 5
and student_name = '고바꿈';

select * from student_mst;

/*===========<< university>>=========*/
delete
from
	university_mst
where
	university_id = 4;
    
select * from university_mst;

delete
from
	university_mst
where
	university_id = 5
and	university_name = '경성대';

select * from university_mst;
    
delete
from
	university_mst
where
	university_id > 6;
    
select * from university_mst;    

