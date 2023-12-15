# hello-world

#### 1. Clone the project on your local machine

git clone git@github.com:manisekharan/docker-demo.git

#### 2. Go to docker-demo folder

cd docker-demo

#### 3. Build DockerFile

docker build -f DockerFile -t docker-demo .

#### 4. Run docker image

docker run -p 8080:8080 docker-demo

#### 5. Once Spring Boot Application boots up and the server is running on port 8080, try below endpoints using browser.

http://localhost:8080

http://localhost:8080/healthz

#### 6. Ctrl+C to shutdown the server.

