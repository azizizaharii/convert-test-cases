No	Test Case	Test Case Details	Flow of the Test Case
1	Normal conversion case	A normal conversion scenario, starting from opening the website on a browser (in this case Chrome is used). An amount is determined and converted.

This is to test the functionality of the Convert module, alongside the of the functionality of “Amount” textbox and “Convert” button.	1.	Open browser
2.	Navigate to https://www.xe.com/
3.	Insert the amount to be converted into “Amount” textbox
4.	Click “Convert” button
5.	Close Browser
2	Reversing the conversion	As the default conversion is USD-EUR, both “From” and “To” are changed to EUR and MYR respectively to test the functionality of both textboxes.

The conversion is also reversed to see the conversion of the same amount from MYR to EUR. This is used to test the functionality of the “Swap currencies”	1.	Open browser
2.	Navigate to https://www.xe.com/
3.	Change the “From” textbox to EUR
4.	Change the “To” textbox to MYR
5.	Insert the amount to be converted into “Amount” textbox
6.	Click “Convert” button
7.	Click “Swap currencies” button
8.	Close browser
3	Non-number amount	The “Amount” textbox is filled with characters other than numbers, such as letters and special characters. This is to test that the Convert module should give out an error message.	1.	Open browser
2.	Navigate to https://www.xe.com/
3.	Insert letters into “Amount” textbox
4.	Check whether the error message “Please enter a valid amount” appears
5.	Close browser

Due to time constraints and my inexperience in using Java and Selenium, I could only figure out these 3 test cases.
