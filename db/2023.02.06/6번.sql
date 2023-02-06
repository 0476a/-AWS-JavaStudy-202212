Create view USER_VIEW as
SELECT
    `ID`,
    `USERNAME`,
    `PASSWORD`,
    `NAME`,
    `EMAIL`
FROM
    `USER_MST`
WHERE
    `ID` BETWEEN 1 AND 200
    AND `USERNAME` like 'a%';
    
