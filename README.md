# Spring security graphql bug
## Problem statement:
/graphql endpoint always result in unauthorized request 401
## How to reproduce:
- Run this application 
```console 
gradlew bootRun
```
- Perform test grahql request:
```bash
   curl --location --request POST 'http://localhost:8080/graphql' \
   --header 'Authorization: Basic dXNlcjpwYXNzd29yZA==' \
   --header 'Content-Type: application/json' \
   --data-raw '{"query":"query {\n    hello\n}","variables":{}}'
```
- Result will be:
```json
{"timestamp":"2022-12-10T13:28:38.536+00:00","status":401,"error":"Unauthorized","path":"/graphql"}
```
- However in logs you can see that method was invoked successfully:
```text 
hello: UsernamePasswordAuthenticationToken [Principal=org.springframework.security.core.userdetails.User [Username=user, Password=[PROTECTED], Enabled=true, AccountNonExpired=true, credentialsNonExpired=true, AccountNonLocked=true, Granted Authorities=[ROLE_USER]], Credentials=[PROTECTED], Authenticated=true, Details=WebAuthenticationDetails [RemoteIpAddress=127.0.0.1, SessionId=null], Granted Authorities=[ROLE_USER]]
```
