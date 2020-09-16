Feature: Verify the Adactinpage functionalities
 
 Scenario Outline: Verifiying the AdactinPage details


  Given user is on the Adactinpage
  When user is should be enter the "<userName>" and "<password>"
  When user is should enter the details"<loacation>","<hotelname>","<roomType>" and "<noofRooms>"
  And  user Enter the dates "<checkIn>" and "<CheckOut>","<noofadults>" and "<noofchildren>"
  Then user click the search button 
  And  user in selectHotel page click the select option and continue option 
  When user should enter the personal details"<finame>","<lstname>","<addrs>","<ccno>","<cctype>","<Exmonth>","<Exyear>" and "<cvvno>"
  Then user click the Book  now option
  Then user know the booking oder no
  
  
 
 Examples:
   
    |  userName   | password |loacation| hotelname      |roomType    |noofRooms|checkIn   |CheckOut  |noofadults|noofchildren|finame|lstname|addrs        |ccno            |cctype|  Exmonth|Exyear|cvvno|
   
    | jyothibala  |navyasree |London   | Hotel Sunshine |Double      |    1    |26/08/2020|27/08/2020|  1       |1           |jyothi|gajula |Thamilnadu   |4568789123456789|VISA  |November | 2022|428  |
    | jyothibala  |navyasree |London   | Hotel Sunshine |Double      |    2    |26/08/2020|27/08/2020|  1       |1           |jyothi|gajula |Thamilnadu   |4568789123456789|Other |January  | 2022|428  |
    | jyothibala  |navyasree |London   | Hotel Sunshine |Double      |    4    |26/08/2020|27/08/2020|  1       |1           |jyothi|gajula |Thamilnadu   |4568789123456789|VISA  |August   | 2022|563  |
    