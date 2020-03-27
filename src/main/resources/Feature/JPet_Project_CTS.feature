@Jpetstore_feature
Feature: JPet Website


@TC_01_Registeration
Scenario: Registration in JPet store Web Application and SignIn

Given The User Launches the Browser
And The User is on Registeration Page
Then Enter the Details and take Screenshot
And Complete the Registration
And Signin and Go to Account Pages and take Screenshot


@TC_02_Login_The_User
Scenario: Login to the Jpet store application

Given The User Launches Browser
When Opens the Login Page
Then Enters Username and Password
And Click on Login button


@TC_03_Search_Product_Add_To_Cart
Scenario: Search Product and Add to Cart in the JPet Store Web Application.

Given Open the Browser and Go To JPet homepage
When The Webpage Opens, Enter Search Content
Then Click Search button
And Click  Product ID
And Click Item ID
And Click AddToCart and take Screenshot


@TC_04_Print_Table
Scenario: Print the Table Details
 
 Given Open the Browser and Go To JPet Homepage
 And Click on Pet
 Then Print the Table Details
 And Close Browser

@TC_05_Signout_User_From_JPet_Web_Application
Scenario: Sign out from the JPet Store Web Application.

Given Launch the Chrome Browser
When Open the JPet Web Application
Then Click the Login button
And Enter the Username, Password and Click Login button
And If User is logged in then Click the Signout button



