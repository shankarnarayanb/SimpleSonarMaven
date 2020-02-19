# SimpleSonarMaven
A very basic sonar maven project for starters

The settings.xml file includes the config to be added your settings.xml in the .m2 folder.

Change the sonarqube url in the settings.xml to point to the one which you plan to use for uploading your reports

To run the project and upload the reports to sonar, try using 

mvn verify sonar:sonar -Dsonar.scm.disabled=true

Hope this helps!

Cheers,
Shankar
