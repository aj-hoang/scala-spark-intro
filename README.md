# scala-spark-intro

This is just an example repo to go through an introduction to scala / spark

## Prerequisites (Important)
### Java 8
* Go to: https://developers.redhat.com/products/openjdk/download
* Search of "OpenJDK 8"
* If on Windows:
  * search for "jdk-8u392-x64 MSI" and install

### Spark 3
* Download spark 3.3.4 Prebuilt with hadoop 2.7 here: https://spark.apache.org/downloads.html
* If on Windows:
  * Create a folder `C:\install\spark` and move the .tgz into it
  * In Git Bash - navigate to this folder `cd /c/install/spark` and run `tar -xvzf spark-3.3.4-bin-hadoop2.tgz` to extract the files
  * To run spark locally - we have to 'trick' spark to think that Hadoop exists
  * Go to: https://github.com/steveloughran/winutils/tree/master/hadoop-2.7.1/bin
    * Download `hadoop.dll` and `winutils.exe`
    * Create a folder `C:\install\winutils\hadoop-2.7.1\bin` and move the 2 files downloaded into this folder

### Environment Variables
* If on Windows:
  * Set some user environment variables
  ```
  JAVA_HOME = C:\Program Files\RedHat\java-1.8.0-openjdk-1.8.x.xxx (replace the x with the java version donwloaded)
  SPARK_HOME = C:\install\spark\spark-3.3.4-bin-hadoop2
  HADOOP_HOME = C:\install\winutils\hadoop-2.7.1
  SPARK_CONF_DIR = %SPARK_HOME%\conf
  ```
  * Also add these to your Path environment variable
  ```
  %JAVA_HOME%\bin
  %HADOOP_HOME%\bin
  %SPARK_HOME%\bin
  ``` 
  * Open a new powershell terminal and run: `spark-shell` - give it a min and you'll have a spark shell

### IntelliJ
  * In IntelliJ, use scala plugin
  * When opening this project in IntelliJ, it should detect this as a gradle project (small popup), ensure you select "load as gradle project"
  * In File -> Project Structure -> Set SDK to OpenJDK 8 (the java 8 installation you've setup should be selectable in the dropdown)
  * Ensure to import the gradle project

## Sample Data
We can experiment with some open data here: https://www.data.gov.uk/dataset/208c0e7b-353f-4e2d-8b7a-1a7118467acc/gb-road-traffic-counts
  - Specifically the local authority traffic csv
  - Download the file
  - Create a directory at the root of this repo called: and setup the directory as follows, and place the csv in there
  ```
  data
  └── local-authority-traffic
      └── csv
          └── local_authority_traffic.csv
  
  ```
