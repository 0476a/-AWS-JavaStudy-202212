START TRANSACTION;

INSERT INTO `상품`

VALUES(0, '오렌지사탕', 20);

savepoint sp1;

UPDATE `상품`

SET
    `수량` = 200

WHERE
    `상품코드` = 1;
    
savepoint sp2;

DELETE

FROM
    `상품`

WHERE
    `상품코드` = 2;

savepoint sp3;

rollback to sp2;

UPDATE `상품`

SET
    `수량` = 200

WHERE
    `상품코드` = 2;

COMMIT;