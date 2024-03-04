# Docker Commands

## How to start/stop Docker service

```docker
# To start docker daemon:
sudo systemctl start docker docker.socket containerd

# To stop docker daemon:
sudo systemctl stop docker docker.socket containerd
```

## On Boot Configure Docker to start

```docker
# Enable
sudo systemctl enable docker.service
sudo systemctl enable containerd.service

# Disable
sudo systemctl disable docker.service
sudo systemctl disable containerd.service
```

## Run PostgreSQL instance

`docker container run --name postgresdb -e POSTGRES_PASSWORD=admin
-d -p 5432:5432 postgres`

* --name: used to define container name
* -e: used to define environment variable
* -d: detach mode(terminal will not attach)
* -p: define port number

