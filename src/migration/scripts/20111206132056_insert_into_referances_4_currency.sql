--// insert into referances 4 currency
-- Migration SQL that makes the change goes here.
INSERT INTO referances VALUES (123,'Referance','Currency','Currency','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (124,'Referance','Currency','����','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());

INSERT INTO referances VALUES (1401,'Currency','USD','United States Dollar','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1402,'Currency','USD','��Ԫ','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1403,'Currency','JPY','Japan Yen','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1404,'Currency','JPY','��Ԫ','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1405,'Currency','CNY','China Yuan Renminbi','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1406,'Currency','CNY','�����','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1407,'Currency','EUR','Euro Member Countries','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1408,'Currency','EUR','ŷԪ','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1409,'Currency','AUD','Australia Dollar','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1410,'Currency','AUD','�Ĵ�����Ԫ','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1411,'Currency','CAD','Canada Dollar','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1412,'Currency','CAD','���ô�Ԫ','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1413,'Currency','GBP','United Kingdom Pound','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1414,'Currency','GBP','Ӣ��','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1415,'Currency','SGD','Singapore Dollar','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1416,'Currency','SGD','�¼���Ԫ','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1417,'Currency','KRW','Korea (South) Won','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1418,'Currency','KRW','��Ԫ','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1419,'Currency','HKD','Hong Kong Dollar','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1420,'Currency','HKD','�۱�','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());

--//@UNDO
-- SQL to undo the change goes here.
delete from referances where id >=123 and id <=124;
delete from referances where id >=1401 and id <=1420;


