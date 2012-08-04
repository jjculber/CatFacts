#!/bin/bash
cd /home/justin/catfacts
java -cp .:google-voice-java-1.10-java6.jar:json.jar catfacts >/dev/null
