#!/usr/bin/env bash

REPO="anakin-repotest"

$(aws ecr get-login --no-include-email --region ap-southeast-1)
docker build -t ${REPO} .
docker tag ${REPO}:latest 019908562201.dkr.ecr.ap-southeast-1.amazonaws.com/${REPO}:latest
docker push 019908562201.dkr.ecr.ap-southeast-1.amazonaws.com/${REPO}:latest