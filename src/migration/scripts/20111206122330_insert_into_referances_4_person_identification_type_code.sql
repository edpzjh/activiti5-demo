--// insert into referances 4 PersonIdentificationTypeCode
-- Migration SQL that makes the change goes here.
INSERT INTO referances VALUES (119,'Referance','PersonIdentificationTypeCode','PersonIdentificationTypeCode','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (120,'Referance','PersonIdentificationTypeCode','PersonIdentificationTypeCode','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());

INSERT INTO referances VALUES (1201,'PersonIdentificationTypeCode','AREG','AlienRegistrationNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1202,'PersonIdentificationTypeCode','AREG','AlienRegistrationNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1203,'PersonIdentificationTypeCode','CPFA','CPFAccountNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1204,'PersonIdentificationTypeCode','CPFA','CPFAccountNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1205,'PersonIdentificationTypeCode','DRLC','DriversLicenseNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1206,'PersonIdentificationTypeCode','DRLC','DriversLicenseNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1207,'PersonIdentificationTypeCode','EMID','EmployerIdentificationNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1208,'PersonIdentificationTypeCode','EMID','EmployerIdentificationNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1209,'PersonIdentificationTypeCode','IDCD','IdentityCardNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1210,'PersonIdentificationTypeCode','IDCD','IdentityCardNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1211,'PersonIdentificationTypeCode','NRIN','NationalRegistrationIdentificationNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1212,'PersonIdentificationTypeCode','NRIN','NationalRegistrationIdentificationNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1213,'PersonIdentificationTypeCode','OTHR','Other','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1214,'PersonIdentificationTypeCode','OTHR','Other','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1215,'PersonIdentificationTypeCode','PASS','PassportNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1216,'PersonIdentificationTypeCode','PASS','PassportNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1217,'PersonIdentificationTypeCode','SOCS','SocialSecurityNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1218,'PersonIdentificationTypeCode','SOCS','SocialSecurityNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1219,'PersonIdentificationTypeCode','SRSA','SRSAccountNumber','en','','createdBy',SYSDATE(),'createdBy',SYSDATE());
INSERT INTO referances VALUES (1220,'PersonIdentificationTypeCode','SRSA','SRSAccountNumber','zh','','createdBy',SYSDATE(),'createdBy',SYSDATE());

--//@UNDO
-- SQL to undo the change goes here.
delete from referances where id >=119 and id <=120;
delete from referances where id >=1201 and id <=1220;
