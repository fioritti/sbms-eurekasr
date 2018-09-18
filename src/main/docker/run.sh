echo "********************************************************"
echo "Starting the Eureka Server"
echo "********************************************************"
java  -Xmx64m -Xss256k -Djava.security.egd=file:/dev/./urandom -jar /usr/local/eurekaserver/@project.build.finalName@.jar