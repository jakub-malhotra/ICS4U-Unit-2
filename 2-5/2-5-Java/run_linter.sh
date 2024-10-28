#!/usr/bin/env bash

java -jar ./linter/checkstyle.app -c ./linter/sun_checks.xml *.java
