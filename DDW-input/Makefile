all: updateTomcat
	javac -classpath /home/jtm/Dev/Tomcat/lib/servlet-api.jar -d ./WEB-INF/classes/ ./src/*.java

updateTomcat:
	/home/jtm/Dev/Tomcat/bin/shutdown.sh
	/home/jtm/Dev/Tomcat/bin/startup.sh
