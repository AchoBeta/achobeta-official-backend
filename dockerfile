# 以jdk8为基础镜像
FROM openjdk:21
# 描述
LABEL description="official service"
# 暴露接口
EXPOSE 8989
# 将主机中的jar包添加到镜像中
ADD ./achobeta-official-service/target/achobeta-official-service-0.0.1-SNAPSHOT.jar official-service-0.0.1-SNAPSHOT.jar
# 运行jar包
ENTRYPOINT ["java", "-jar","official-service-0.0.1-SNAPSHOT.jar"]