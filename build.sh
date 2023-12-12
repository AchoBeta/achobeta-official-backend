#!/bin/zsh
# shellcheck disable=SC2164
cd achobeta-official-service
mvn clean install package -Dmaven.test.skip=true
docker-compose pull
docker-compose up -d --build

