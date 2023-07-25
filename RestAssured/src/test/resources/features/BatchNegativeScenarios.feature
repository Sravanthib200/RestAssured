Feature: Post request for createBatch
@invalidpost
  Scenario Outline: 
    Given : User trying to create POST Request with invalid baseUrl
    When : User sends request Body from excel "<SheetName>" and <RowNumber>
    Then : User receieves 400 Bad Request Status with response body

    Examples: 
      | SheetName | RowNumber |
      | Batch    |         2 |
      

@invalidpost1
  Scenario Outline: 
    Given : User trying to create POST Request without batchname
    When : User sends request Body from excel "<SheetName>" and <RowNumber>
    Then : User receieves 400 Bad Request Status with response body

    Examples: 
      | SheetName | RowNumber |
      | Batch    |         3|

    
@invalidgetbyid   
Scenario Outline:
    Given : User has to request to retrieve the data with invalid batchid
    When : User sends get request with invalid <id>
    Then : User receieves 404 Bad Request Status with response body

    
    Examples:
    |id|
    |1234|

    
@invalidgetbyname
Scenario Outline:
    Given : User has to request to retrieve the data with invalid batchname 
    When : User sends get request with invalid "<name>"
    Then : User receieves 404 Bad Request Status with response body

  
  Examples:
  |name|
  |Jul23-Api|  
   
@invalidgetbyprogramid
Scenario Outline:
    Given : User has to request to retrieve the data with invalid programid
    When : User sends get request with invalid <programid>
    Then : User receieves 404 Bad Request Status with response body

    
    Examples:
    |programid|
    |1234|
  
    
 @invalidput
 Scenario Outline:
    Given : User has to request to update the data with invalid batchid
    When : User sends put request with invalid <batchid> 
    Then : User receives 400 Bad Request Status with response body

   
   Examples:
   |batchid| 
   |1234|
    
 @invaliddelete
 Scenario Outline:
    Given : User has to request to delete the data with invalid batchid
    When : User sends delete request with invalid <batchid>
    Then : User receives 404 Bad Request Status with response body
    
    
  Examples:
  |batchid|
  |1234|
  