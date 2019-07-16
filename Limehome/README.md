Task #1: Finding Defects
Check-In Screen:
1) The translation to German language link isn't working
2) The Last Name and Booking Reference shouldn't be passed in the URL unless it is encrypted.
3) The Booking reference should be alphanumeric but inputs like "absg*^)" are getting accepted
4) There is no check on the character limit for Last Name and Booking reference
5) Blank Last Name and Booking reference(just the spaces) are getting accepted.

Booking Details Screen:
1) The Translation to English isn't working for the description of Headers (lorem ipsum text)
2) Hint texts for various fields, Headers, description not translating to German.
3) The future dates in the Calender should either be disabled or error should appear when future dates are selected in Date of birth field (example 5/14/8888)
4) In mandatory fields like first name, if the user enters just some blank spaces, they are getting accepted and no validation error appears. Similarly, for other mandatory fields like postal code, and City, passport Id.
5) When any of the mandatory fields is left blank, and the user tries to Submit the form, validation error message appears but no fields are highlighted which isn't correct. Ideally, the fields that were mandatory and left blank should be highlighted.
6) When the user clicks Back button from the Thankyou page, he is taken back to the Booking details screen which isn't correct.
7) Special characters shouldn't be allowed in fields like First Name, Last Name, city but are getting accepted.
8) There is no character limit set on textfields and the user is able to enter infinite characters which isn't correct.
9) The booking details can be accessed just by launching the URL "https://limehome-qa-task.herokuapp.com/registrationForm/ddddddddddd/dddddd". There is no access token being passed to keep a check on authentication.


Task #2: Writing Test Scenarios
The test scenarios are present in the following sheet https://docs.google.com/spreadsheets/d/1v24wkcc27_xL90tUUn8qEL6QHJPnZlYnSkI-0R3HNEA/edit?usp=sharing

Task #3: Defect Reporting
I logged a sample bug in JIRA. I have attached screenshots for the same in resources folder.

