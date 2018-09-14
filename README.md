# pact-scala-enhancement
**This projects helps to download pacts from pact broker in Scala. **

## Getting Started:
```
 Clone project from GitHub (https://github.com/kanwaldeepBhangu/pact-scala-enhancement)  
 Run maven command to build the project (Example mvn install -Dmaven.test.skip=true)
 Add the enhancement-0.0.1-SNAPSHOT.jar file into your project as Dependency
 ```

## Prerequisites:
**To work with this project ,you need to set four System variables**
```
PACT_BROKER_USERNAME="YourUserName"
PACT_BROKER_PASSWORD="YourPassword"
PACT_BROKER_HOST="YourHostName" example- localhost
PACT_BROKER_TARGET_FOLDER="folderName",where you want to  download pacts
```

## Steps to Use:
```
1.Add dependency into your project
  <dependency>
	<groupId>pact.broker.utility</groupId>
	<artifactId>enhancement</artifactId>
	<version>0.0.1-SNAPSHOT</version>
 </dependency
2.Set required system variables as mentioned above.
3.Create instance of PactBrokerResource 
4.Invoke downloadLatestPactsBasedOnProvider function by passing providerName as input argument.
  This will throw RuntimeException in case of Connection Issue.
 
```
**Below is the sample code-
```
    @Test
	public void testDownloadLatestPactsBasedOnProvider() {
		PactBrokerResource resource = new PactBrokerResource();
		resource.downloadLatestPactsBasedOnProvider("yourProviderName");
       }

```
## Built With:
```
** Programming Language : Java
** Build tool           : Maven
```
## Version: 0.0.1-SNAPSHOT

## Authors:
