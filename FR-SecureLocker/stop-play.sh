#!/bin/bash
kill -9 $(ps -ef | grep /opt/play-1.5 | awk '{print $2}')
exit 0
