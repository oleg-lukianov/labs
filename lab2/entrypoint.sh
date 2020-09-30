#!/bin/bash
mkdir 1

sed -i "s/MY_NAME/$MY_NAME/g" /usr/share/nginx/html/index.html

if [ $? == 0 ]
then
  echo "Starting nginx"
  nginx -g "daemon off;"
fi
