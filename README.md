<h1> SIRET MICROSERVICE </h2>
This an implementation of JAVA microservice. That get pertinente companies informations from an API

<h2> How to launch the application ? </h2>

<li>Clone or download this repository in https://github.com/ManoloRaj/siretmicroservice-backend</li>
<li>Open it on your JAVA IDE (I used IntelliJ)</li>
<li>Then Debug/Run the application </li>

<h2> Project structure</h2>
<p>
The project was developped in IntelliJ IDE and structured by Maven project structure 
</p>
<p>
There are 3 packages :


<h3>"controller" package : take user requests, there are 4 routes:</h3>
<li>test: just for a test</li>
<li>getOneEtablissement: returns the complete characteristic of a company</li>

<li>getSpecificInformations: returns the following characteristics in a string:
	
-siret
-nic
-full address
-creation date
-Full name 
</li>

<li>saveSpecificInformations : Save the information in CSV file</li>


<h3>
"model" package : </h3>

<p>
This package contains a kind of "Entity" to map information from API
here is an image of UML Diagram (You can download it !!!)
</p>
<img src="Documentation/UML.png" width="500px" height="500px"/>


<h3>
"service" package : 
</h3>
<p>
This package contain the class "GetFromAPIws". The main rôle of this class is to do API request to a file  : "test_API.php".</br>
 And test_API.php do request to "https://api.insee.fr/entreprises/sirene/V3/siret/" . Why should we use this test_API.php file ????
We use it to avoid HTTPS SSL error in JAVA SPRING 
</p>


<h2> Unit TEST</h2>
<p>Unit test are located in src/test 
You can launch "SiretmicroserviceBackendApplicationTests" class , it will test all service and controllers method in class.</p>

<h2> NB</h2>
<p>
All variable/Class/Package/Methods name are made to FACILITATE readability and the role of them.
</p>
