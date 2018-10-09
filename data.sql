COPY mentors(first_Name,Last_Name,Nick_Name,
telephone_Number,eMail,City,Favourite_Number) 
FROM '/home/devas/WebRoom/SI1/sql-application-process-pawelbielec89/mentors.csv'
 DELIMITER ',' quote '''' CSV;

COPY applicants(first_Name,Last_Name,telephone_Number,eMail,application_code) 
FROM '/home/devas/WebRoom/SI1/sql-application-process-pawelbielec89/applicants.csv'
 DELIMITER ',' quote '''' CSV;
