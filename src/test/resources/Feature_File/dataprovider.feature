Feature: Login Page Test 
Scenario: Login Page 
	Given Open The Browser 
	Then Enter "velmurugan" and "978967298" 
	Then Logout page 
	
@Dataprovider 
Scenario Outline: : Login Page 
	Given Open The Browser 
	Then Enter "<UserName>" and "<Password>" 
	Then Logout page 
	
	Examples: 
		|UserName|Password|
		|VAISNU|1236|
		|MURUGAN|56789|
		|RAJJENDRAN|098765|
		|UBBULAKSHMI|234567|
		
		@DataTable 
		Scenario: Login Page 
			Given Open The Browser 
			Then Enter username and pssword 
				|velmurugan|9789679298|
			Then Logout page 
			
		@DataTableMap 
		Scenario: Login Page 
			Given Open The Browser 
			Then Enter username and pssword 
				|userName|Password|
				|velmurugan|9789679298|
				|VAISHNU|9789679299|
			Then Logout page 
			
			
