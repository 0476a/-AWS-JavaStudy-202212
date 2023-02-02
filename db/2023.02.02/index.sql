/*인덱스를 생성해주는 것*/
CREATE INDEX product_id on product_mst(product_code);

/*인덱스 테이블 확인*/
show index from product_mst;

/*product_name 칼럼에 유니크한 인덱스를 하나 만들어 주는 작업*/
alter table product_mst
add unique product_name(product_name);

/* 인덱스 값을 입력해서 해당 테이블에서 인덱스를 지워주는 역할  */
alter table product_mst
drop index product_id1;