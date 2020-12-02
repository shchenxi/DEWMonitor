FROM java:openjdk-8-jre-alpine
WORKDIR /opt/diyu
VOLUME /tmp
COPY *.jar /opt/diyu/
copy *.yml /opt/diyu/
EXPOSE 8080
ENTRYPOINT java -jar -Dspring.profiles.active=prod *.jar
