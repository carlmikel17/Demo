#!/bin/bash
for i in {1..30}; do echo $i; sleep 1; done

mkdir results/logs
cd results/logs/
touch logs.txt
