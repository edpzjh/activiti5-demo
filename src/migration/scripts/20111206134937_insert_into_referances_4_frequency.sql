--// insert into referances 4 frequency
-- Migration SQL that makes the change goes here.
INSERT INTO referances VALUES (125,'Referance','Frequency','Frequency','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (126,'Referance','Frequency','Ƶ��','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());

INSERT INTO referances VALUES (1501,'Frequency','DAIL','Daily','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1502,'Frequency','DAIL','ÿ��','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1503,'Frequency','MIAN','SemiAnnual','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1504,'Frequency','MIAN','ÿ����','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1505,'Frequency','MNTH','Monthly','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1506,'Frequency','MNTH','ÿ��','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1507,'Frequency','QURT','Quarterly','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1508,'Frequency','QURT','ÿ����','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1509,'Frequency','TEND','TenDays','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1510,'Frequency','TEND','ÿʮ��','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1511,'Frequency','WEEK','Weekly','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1512,'Frequency','WEEK','ÿ��','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1513,'Frequency','YEAR','Annual','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1514,'Frequency','YEAR','ÿ��','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());


--//@UNDO
-- SQL to undo the change goes here.
delete from referances where id >=125 and id <=126;
delete from referances where id >=1501 and id <=1514;


