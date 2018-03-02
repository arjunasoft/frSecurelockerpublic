kill -9 $(ps -ef | grep /opt/play-1.2.4 | awk '{print $2}')
exit 0
