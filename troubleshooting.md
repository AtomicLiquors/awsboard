[1011] 
최초 git pull 에러 발생
로컬 폴더를 원격 저장소에 연결하는 과정에서 주소에 https://를 넣지 않음  

```
[X] git remote add origin "github.com/AtomicLiquors/awsboard.git"
[O] git remote add origin "https://github.com/AtomicLiquors/awsboard.git"
```


----------------------------------------
/var/log/nginx/error.log
----------------------------------------
2022/10/17 13:37:16 [error] 1351#1351: *165 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:37:29 [error] 1351#1351: *167 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:37:31 [error] 1351#1351: *169 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:37:44 [error] 1351#1351: *171 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:37:46 [error] 1351#1351: *173 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:37:59 [error] 1351#1351: *175 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:38:01 [error] 1351#1351: *177 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:38:12 [error] 1351#1351: *179 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "HEAD /robots.txt HTTP/1.1", upstream: "http://127.0.0.1:5000/robots.txt", host: "awseb-awseb-11clfsl7fq1of-1562022218.ap-northeast-2.elb.amazonaws.com"
2022/10/17 13:38:14 [error] 1351#1351: *181 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:38:16 [error] 1351#1351: *183 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:38:29 [error] 1351#1351: *185 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:38:31 [error] 1351#1351: *187 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:38:44 [error] 1351#1351: *189 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:38:46 [error] 1351#1351: *191 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:38:59 [error] 1351#1351: *193 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:39:01 [error] 1351#1351: *195 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:39:14 [error] 1351#1351: *197 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:39:16 [error] 1351#1351: *199 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:39:29 [error] 1351#1351: *201 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:39:31 [error] 1351#1351: *203 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:39:44 [error] 1351#1351: *205 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:39:46 [error] 1351#1351: *207 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:39:59 [error] 1351#1351: *209 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:40:01 [error] 1351#1351: *211 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:40:14 [error] 1351#1351: *213 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:40:16 [error] 1351#1351: *215 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:40:29 [error] 1351#1351: *217 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:40:31 [error] 1351#1351: *219 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:40:44 [error] 1351#1351: *221 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:40:46 [error] 1351#1351: *223 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:40:59 [error] 1351#1351: *225 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:41:01 [error] 1351#1351: *227 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:41:14 [error] 1351#1351: *229 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:41:16 [error] 1351#1351: *231 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:41:29 [error] 1351#1351: *233 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:41:31 [error] 1351#1351: *235 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:41:44 [error] 1351#1351: *237 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:41:46 [error] 1351#1351: *239 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:41:59 [error] 1351#1351: *241 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:42:01 [error] 1351#1351: *243 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:42:14 [error] 1351#1351: *245 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:42:16 [error] 1351#1351: *247 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:42:29 [error] 1351#1351: *249 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:42:31 [error] 1351#1351: *251 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:42:44 [error] 1351#1351: *253 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:42:46 [error] 1351#1351: *255 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:42:59 [error] 1351#1351: *257 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:43:01 [error] 1351#1351: *259 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:43:14 [error] 1351#1351: *261 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:43:16 [error] 1351#1351: *263 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:43:29 [error] 1351#1351: *265 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:43:31 [error] 1351#1351: *267 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:43:44 [error] 1351#1351: *269 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:43:46 [error] 1351#1351: *271 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:43:59 [error] 1351#1351: *273 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:44:01 [error] 1351#1351: *275 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:44:14 [error] 1351#1351: *277 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:44:16 [error] 1351#1351: *279 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:44:29 [error] 1351#1351: *281 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:44:31 [error] 1351#1351: *283 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:44:44 [error] 1351#1351: *285 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:44:46 [error] 1351#1351: *287 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:44:59 [error] 1351#1351: *289 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:45:01 [error] 1351#1351: *291 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:45:14 [error] 1351#1351: *293 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:45:16 [error] 1351#1351: *295 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:45:29 [error] 1351#1351: *297 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:45:31 [error] 1351#1351: *299 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:45:44 [error] 1351#1351: *301 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:45:46 [error] 1351#1351: *303 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:45:59 [error] 1351#1351: *305 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:46:01 [error] 1351#1351: *307 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:46:14 [error] 1351#1351: *309 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:46:16 [error] 1351#1351: *311 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:46:29 [error] 1351#1351: *313 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:46:31 [error] 1351#1351: *315 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:46:44 [error] 1351#1351: *317 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:46:46 [error] 1351#1351: *319 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:46:59 [error] 1351#1351: *321 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:47:01 [error] 1351#1351: *323 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:47:14 [error] 1351#1351: *325 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:47:16 [error] 1351#1351: *327 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:47:29 [error] 1351#1351: *329 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:47:31 [error] 1351#1351: *331 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:47:44 [error] 1351#1351: *333 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:47:46 [error] 1351#1351: *335 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:47:59 [error] 1351#1351: *337 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:48:01 [error] 1351#1351: *339 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:48:14 [error] 1351#1351: *341 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:48:16 [error] 1351#1351: *343 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:48:29 [error] 1351#1351: *345 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:48:31 [error] 1351#1351: *347 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:48:45 [error] 1351#1351: *349 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:48:46 [error] 1351#1351: *351 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:49:00 [error] 1351#1351: *353 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:49:01 [error] 1351#1351: *355 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:49:03 [error] 1351#1351: *357 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "awsboard-env.eba-gvyvvrrt.ap-northeast-2.elasticbeanstalk.com"
2022/10/17 13:49:03 [error] 1351#1351: *357 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET /favicon.ico HTTP/1.1", upstream: "http://127.0.0.1:5000/favicon.ico", host: "awsboard-env.eba-gvyvvrrt.ap-northeast-2.elasticbeanstalk.com", referrer: "http://awsboard-env.eba-gvyvvrrt.ap-northeast-2.elasticbeanstalk.com/"
2022/10/17 13:49:15 [error] 1351#1351: *360 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.21.28, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"
2022/10/17 13:49:16 [error] 1351#1351: *362 connect() failed (111: Connection refused) while connecting to upstream, client: 172.31.3.254, server: , request: "GET / HTTP/1.1", upstream: "http://127.0.0.1:5000/", host: "172.31.13.208"


----------------------------------------
/var/log/web.stdout.log
----------------------------------------
Oct 17 13:48:41 ip-172-31-13-208 web: at com.mysql.cj.protocol.StandardSocketFactory.connect(StandardSocketFactory.java:153) ~[mysql-connector-java-8.0.30.jar!/:8.0.30]
Oct 17 13:48:41 ip-172-31-13-208 web: at com.mysql.cj.protocol.a.NativeSocketConnection.connect(NativeSocketConnection.java:63) ~[mysql-connector-java-8.0.30.jar!/:8.0.30]
Oct 17 13:48:41 ip-172-31-13-208 web: ... 60 common frames omitted
Oct 17 13:48:41 ip-172-31-13-208 web: 2022-10-17 13:48:41.767 ERROR 20565 --- [           main] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
Oct 17 13:48:41 ip-172-31-13-208 web: 2022-10-17 13:48:41.767  WARN 20565 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
Oct 17 13:48:41 ip-172-31-13-208 web: 2022-10-17 13:48:41.790  INFO 20565 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
Oct 17 13:48:41 ip-172-31-13-208 web: 2022-10-17 13:48:41.839  INFO 20565 --- [           main] ConditionEvaluationReportLoggingListener :
Oct 17 13:48:41 ip-172-31-13-208 web: Error starting ApplicationContext. To display the conditions report re-run your application with 'debug' enabled.
Oct 17 13:48:41 ip-172-31-13-208 web: 2022-10-17 13:48:41.898 ERROR 20565 --- [           main] o.s.boot.SpringApplication               : Application run failed
Oct 17 13:48:41 ip-172-31-13-208 web: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Invocation of init method failed; nested exception is org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1804) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:620) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1154) ~[spring-context-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:908) ~[spring-context-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[spring-context-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:147) ~[spring-boot-2.7.4.jar!/:2.7.4]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-2.7.4.jar!/:2.7.4]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408) ~[spring-boot-2.7.4.jar!/:2.7.4]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.SpringApplication.run(SpringApplication.java:308) ~[spring-boot-2.7.4.jar!/:2.7.4]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-2.7.4.jar!/:2.7.4]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-2.7.4.jar!/:2.7.4]
Oct 17 13:48:41 ip-172-31-13-208 web: at com.board.awsboard.AwsboardApplication.main(AwsboardApplication.java:10) ~[classes!/:0.0.1-SNAPSHOT]
Oct 17 13:48:41 ip-172-31-13-208 web: at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
Oct 17 13:48:41 ip-172-31-13-208 web: at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:na]
Oct 17 13:48:41 ip-172-31-13-208 web: at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
Oct 17 13:48:41 ip-172-31-13-208 web: at java.base/java.lang.reflect.Method.invoke(Method.java:566) ~[na:na]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.loader.MainMethodRunner.run(MainMethodRunner.java:49) ~[application.jar:0.0.1-SNAPSHOT]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.loader.Launcher.launch(Launcher.java:108) ~[application.jar:0.0.1-SNAPSHOT]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.loader.Launcher.launch(Launcher.java:58) ~[application.jar:0.0.1-SNAPSHOT]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.boot.loader.JarLauncher.main(JarLauncher.java:65) ~[application.jar:0.0.1-SNAPSHOT]
Oct 17 13:48:41 ip-172-31-13-208 web: Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:275) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:237) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.id.factory.internal.DefaultIdentifierGeneratorFactory.injectServices(DefaultIdentifierGeneratorFactory.java:175) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.service.internal.AbstractServiceRegistryImpl.injectDependencies(AbstractServiceRegistryImpl.java:286) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:243) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:214) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:173) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:127) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1460) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1494) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:58) ~[spring-orm-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:365) ~[spring-orm-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:341) ~[spring-orm-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1863) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1800) ~[spring-beans-5.3.23.jar!/:5.3.23]
Oct 17 13:48:41 ip-172-31-13-208 web: ... 24 common frames omitted
Oct 17 13:48:41 ip-172-31-13-208 web: Caused by: org.hibernate.boot.registry.selector.spi.StrategySelectionException: Unable to resolve name [org.hibernate.dialect.MYSQL5Dialect] as strategy [org.hibernate.dialect.Dialect]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.selector.internal.StrategySelectorImpl.selectStrategyImplementor(StrategySelectorImpl.java:156) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.selector.internal.StrategySelectorImpl.resolveStrategy(StrategySelectorImpl.java:239) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.selector.internal.StrategySelectorImpl.resolveDefaultableStrategy(StrategySelectorImpl.java:183) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.selector.internal.StrategySelectorImpl.resolveDefaultableStrategy(StrategySelectorImpl.java:170) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.selector.internal.StrategySelectorImpl.resolveStrategy(StrategySelectorImpl.java:164) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.constructDialect(DialectFactoryImpl.java:74) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:51) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:138) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:35) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:101) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: ... 41 common frames omitted
Oct 17 13:48:41 ip-172-31-13-208 web: Caused by: org.hibernate.boot.registry.classloading.spi.ClassLoadingException: Unable to load class [org.hibernate.dialect.MYSQL5Dialect]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.classloading.internal.ClassLoaderServiceImpl.classForName(ClassLoaderServiceImpl.java:133) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.selector.internal.StrategySelectorImpl.selectStrategyImplementor(StrategySelectorImpl.java:152) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: ... 51 common frames omitted
Oct 17 13:48:41 ip-172-31-13-208 web: Caused by: java.lang.ClassNotFoundException: Could not load requested class : org.hibernate.dialect.MYSQL5Dialect
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.classloading.internal.AggregatedClassLoader.findClass(AggregatedClassLoader.java:210) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:589) ~[na:na]
Oct 17 13:48:41 ip-172-31-13-208 web: at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:522) ~[na:na]
Oct 17 13:48:41 ip-172-31-13-208 web: at java.base/java.lang.Class.forName0(Native Method) ~[na:na]
Oct 17 13:48:41 ip-172-31-13-208 web: at java.base/java.lang.Class.forName(Class.java:398) ~[na:na]
Oct 17 13:48:41 ip-172-31-13-208 web: at org.hibernate.boot.registry.classloading.internal.ClassLoaderServiceImpl.classForName(ClassLoaderServiceImpl.java:130) ~[hibernate-core-5.6.11.Final.jar!/:5.6.11.Final]
Oct 17 13:48:41 ip-172-31-13-208 web: ... 52 common frames omitted