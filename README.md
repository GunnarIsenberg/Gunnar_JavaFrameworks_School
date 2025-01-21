<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNORS UNIVERSITY 
## D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming.
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will use the Integrated Development Environment (IDE) link in the web links section of this assessment to install the IDE, IntelliJ IDEA (Ultimate Edition). All relevant links are on the course page. Please refer to the course of study for specific links. You will sign up for a free student license using your WGU.edu email address. Please see the “IntelliJ Ultimate Edition Instructions” attachment for instructions on how do this. Next you will download the “Inventory Management Application Template Code” provided in the web links section and open it in IntelliJ IDEA (Ultimate Edition). You will upload this project to a private external GitLab repository and backup regularly. As a part of this, you have been provided with a base code (starting point). 

## SUPPLEMENTAL RESOURCES  
1.	How to clone a project to IntelliJ using Git?

> Ensure that you have Git installed on your system and that IntelliJ is installed using [Toolbox](https://www.jetbrains.com/toolbox-app/). Make sure that you are using version 2022.3.2. Once this has been confirmed, click the clone button and use the 'IntelliJ IDEA (HTTPS)' button. This will open IntelliJ with a prompt to clone the proejct. Save it in a safe location for the directory and press clone. IntelliJ will prompt you for your credentials. Enter in your WGU Credentials and the project will be cloned onto your local machine.  

2. How to create a branch and start Development?

- GitLab method
> Press the '+' button located near your branch name. In the dropdown list, press the 'New branch' button. This will allow you to create a name for your branch. Once the branch has been named, you can select 'Create Branch' to push the branch to your repository.

- IntelliJ method
> In IntelliJ, Go to the 'Git' button on the top toolbar. Select the new branch option and create a name for the branch. Make sure checkout branch is selected and press create. You can now add a commit message and push the new branch to the local repo.

## SUPPORT
If you need additional support, please navigate to the course page and reach out to your course instructor.
## FUTURE USE
Take this opportunity to create or add to a simple resume portfolio to highlight and showcase your work for future use in career search, experience, and education!
________________________________________________________________________________________________________________________
## REQUIREMENTS 

## PART_A_PROMPT:
(A.  Create your subgroup and project by logging into GitLab using the web link provided and using the “GitLab How-To” web link, and do the following:

•  Clone the project to the IDE.

•  Commit with a message and push when you complete each of the tasks listed below (e.g., parts C to J).


Note: You may commit and push whenever you want to back up your changes, even if a task is not complete.


•  Submit a copy of the Git repository URL and a copy of the repository branch history retrieved from your repository, which must include the commit messages and dates.


Note: Wait until you have completed all the following prompts before you create your copy of the repository branch history.)
## PART_A_NOTES:

## PART_B_PROMPT:
(Create a README file that includes notes describing where in the code to find the changes you made for each of parts C 
to J. Each note should include the prompt, file name, line number, and change.)

## PART_B_NOTES:
Date: 01/04/2024
The project README was updated to incorporate the requirements listed in Part B.
Updates are reflected starting from Line 27 onward, which includes the specified requirements.

## PART_C_PROMPT:
(C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.)

## PART_C_NOTES:
Date: 01/04/2024
The mainscreen.html file was updated to reflect the chosen company name.
Modifications were made to Lines 14, 18, 21, and 45.

## PART_D_PROMPT:
(D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include 
navigation to and from the “About” page and the main screen.)

# PART_D_NOTES:
Generated product images using DALLE and saved them in resources/static/images.
Created a new controller, AboutController, located in java/controllers/AboutController.java.
Modified MainScreenController to include a @GetMapping for the /about endpoint on Lines 54–57.

## PART_E_PROMPT:
(E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five
products in your sample inventory and should not overwrite existing data in the database.
Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the 
sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your 
products. When duplicate items are added, make a “multi-pack” part.)

## PART_E_NOTES:
Generated a list of items (e.g., computer components) and corresponding products (e.g., complete systems).
Implemented changes in the bootstrapdata file to programmatically create products and parts, instead of relying on the GUI.
Updated the database configuration to accommodate the new data.
Specific changes:
Lines 46–228 in bootstrapdata.
Line 6 in application.properties.

## PART_F_PROMPT:
(F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the
associated parts.
•  Display a message that indicates the success or failure of a purchase.)

## PART_F_NOTES:
Created HTML templates for success and failure messages, saved as /resources/templates/notavailable.html and buynow.html.
Added dynamic “Buy Now” buttons using Thymeleaf in mainscreen.html on Lines 86–87.
Implemented a @GetMapping for the /buynow endpoint in MainScreenController, which:
Checks inventory levels.
Routes to the appropriate page based on availability.

## PART_G_PROMPT:
(Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
)

## PART_G_NOTES:
Updated the Part class to include getters, setters, and a modified constructor for maxInventory and minInventory.
Changes made on Lines 32–36, 57–65, and 107–119 of Part.java.
Updated mainscreen.html to display the minimum and maximum inventory values in the parts table on Lines 86–87.
Modified InhousePartForm and OutsourcedPartForm to include these fields on Lines 24–32 in both files.
Renamed the persistent storage file in application.properties on Line 6.
Added server-side validation to ensure inventory values are within the specified range, with exceptions thrown for invalid entries.
Implemented logic to handle cases where minimum and maximum inventory values are not set.

## PART_H_PROMPT:
(G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.)

## PART_H_NOTES:
Updated AddProductController with validation logic on Line 53.
Enhanced the ValidEnufParts validator on Lines 37–40 to display clear error messages for invalid inventory entries.
Previous updates to the PartsController from Part G already ensure functional error handling.

## PART_I_PROMPT:
(I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.)

## PART_I_NOTES:
Unit tests were written earlier as part of a learning exercise.
Tests are located in PartTest on Lines 104–131.

## SUBMISSION_2_NOTES:
Resolved the controller and validator errors causing whitelabel errors. 

## SUBMISSION_3_NOTES:
Resolved the hanging validator issue by removing the appropriate validator and updated the submission in order to make
them more succinct and easy to follow. 