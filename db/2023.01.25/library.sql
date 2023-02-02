SELECT
	*
from
	library_mst
where
	도서명 like '%부산%'; 
    

/*===================<< select insert >>=================*/

/*===============<< 작가 >>=====================*/
insert into author_mst 
	(author_name)
select distinct
	저작자
from
	library_mst
order by
	저작자;
    
select * from author_mst;

/*===============<< 출판사 >>=====================*/
insert into publisher_mst
	(publisher_name)
select distinct
	출판사
from
	library_mst
order by
	출판사;
    
select * from publisher_mst;

/*===================<< select update >>=================*/

update library_mst, author_mst
set
	저작자 = author_id
where
	저작자 = author_name;
    
                    
select * from library_mst;

delete
from
	library_mst
where
	순번 > 1000;


/* update 세이버 꺼주기 */
set SQL_SAFE_UPDATES = 0;


/*===================<< 출판사 select update >>=================*/

update library_mst, publisher_mst
set 
	출판사 = publisher_id
where
	출판사 = publisher_name;

select * from library_mst;


/*===================<< join >>=================*/
select
	*
from
	library_mst lm
    left outer join author_mst am on(am.author_id = lm.저작자)
    left outer join publisher_mst pm on(pm.publisher_id = lm.출판사);
                    

/*=================================================================*/

select * from author_mst;


/* 실행 시간 측정*/
set profiling = 1;
set profiling_history_size = 30;

select
	도서관명,
    도서명
from
	library_mst
where
	저작자 > 100
and 저작자 < 110

union


select
	도서관명,
    도서명
from
	library_mst
where
	저작자 in (select
				author_id
			from
				author_mst
			where
				author_name like '%김주%' 
            or 	author_name like '%김민%');
            
select
	도서관명,
    도서명
from
     library_mst lm
     left outer join author_mst am on(am.author_id = 저작자)
where
	am.author_name like "%김주%";

/*시간 실행 측정 메소드*/
show profiles;
    
/*===================<< 출판사 update >>=================*/
update publisher_mst
set
	publisher_year = '2023-01-25'
where
	publisher_id in (36, 37);
    
select * from publisher_mst;
	

