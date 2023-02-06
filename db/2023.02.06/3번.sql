CREATE SCHEMA `student` DEFAULT CHARACTER SET utf8mb4 ;

CREATE TABLE `student`.`student_mst` (
  `학번` INT NOT NULL AUTO_INCREMENT,
  `이름` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`학번`));
  
insert into student_mst values (0, '김춘식');
insert into student_mst values (0, '손흥민');

CREATE TABLE `student`.`subject_mst` (
  `과목번호` INT NOT NULL AUTO_INCREMENT,
  `과목이름` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`과목번호`));
  
insert into subject_mst values (0, '컴퓨터 구조');
insert into subject_mst values (0, '데이터베이스');
insert into subject_mst values (0, '인공지능');
  
  CREATE TABLE `student`.`grade_mst` (
  `순번` INT NOT NULL AUTO_INCREMENT,
  `학번` INT NOT NULL,
  `과목번호` INT NOT NULL,
  `점수` INT NOT NULL,
  PRIMARY KEY (`순번`));
  
insert into grade_mst values (0, 1, 1, 95);
insert into grade_mst values (0, 2, 1, 84);
insert into grade_mst values (0, 1, 2, 89);
insert into grade_mst values (0, 2, 2, 92);
insert into grade_mst values (0, 1, 3, 100);
insert into grade_mst values (0, 2, 3, 88);
  
select
	gm.순번,
    gm.학번,
    stm.이름,
    gm.과목번호,
    sum.과목이름,
    gm.점수
from
	grade_mst gm
    left outer join student_mst stm on (stm.학번 = gm.학번)
    left outer join subject_mst sum on (sum.과목번호 = gm.과목번호)
where
	gm.순번 < 5;
  
    
