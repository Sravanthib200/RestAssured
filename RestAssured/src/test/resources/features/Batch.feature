@batch
Feature: Post request for createBatch
@post
  Scenario Outline: 
    Given : User creates POST Request for the valid baseUrl and endpoint
    When : User sends request Body from excel "<SheetName>" and <RowNumber>
    Then : User receieves 201 Created Status with response body

    Examples: 
      | SheetName | RowNumber |
      | Batch     |         0 |
      | Batch     |         1 |

@getall
Scenario:
    Given : User has to request to retrieve the data 
    When : User sends get request 
    Then : User receieves the list of data with status code 200 ok
    
@getbyid   
Scenario Outline:
    Given : User has to request to retrieve the data 
    When : User data is retrieved using <id> by get request
    Then : User gets data using batchid
    
    Examples:
    |id|
    |7135|

    
@getbyname
Scenario Outline:
    Given : User has to request to retrieve the data 
    When : User data is retrieved using "<name>" by get request
    Then : User gets data using batchname
  
  Examples:
  |name|
  |Jul23-Api Trekkers-SDET-Team13-013|  
   
@getbyprogramid
Scenario Outline:
    Given : User has to request to retrieve the data 
    When : User data is retrieved using <programid> by get request
    Then : User gets data by programId
    
    Examples:
    |programid|
    |10732|
  
    
 @put
 Scenario Outline:
    Given : User has to request to update the data 
    When : User calls the payload API with PUT Request by BatchId
    Then : User updated the list of data 
   
   Examples:
   |batchid| 
   |7135|
    
 #@delete
 #Scenario Outline:
    #Given : User has to request to delete the data 
    #When : User data is deleted using <batchid> by delete request
    #Then : User deleted the list of data 
    #
  #Examples:
  #|batchid|
  #|6778|
    