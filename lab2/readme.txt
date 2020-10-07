# Alpine
docker build -t alpine_lab2:1.0 -f Dockerfile.alpine .
docker run -d -v /root/test/my-repo4:/data alpine_lab2:1.0

# Nginx
docker build -t nginx_lab2:1.0 -f Dockerfile.nginx .
docker run -d -p 8080:80 -e MY_NAME=Oleg nginx_lab2:1.0
