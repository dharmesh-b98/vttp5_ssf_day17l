"# vttp5_ssf_day17l" 


start a redis thing in railway
go to settings
under public networking, junction.proxy.rlwy.net:32877 -> 6379, junction.proxy.rlwy.net IS HOST, 32877 is PORT

go to variables, copy the REDIS_URL
in terminal type, redis-cli -u <REDIS_URL>
example is redis-cli -u redis://default:RTWtOUVbQCDeMbkArfYlLXGzyEhgojhx@junction.proxy.rlwy.net:32877


create empty service
add 5 new variables
SERVER_PORT = 3000 -> port no that you put in application properties
SPRING_DATA_REDIS_HOST -> HOST retrieved from redis above
SPRING_DATA_REDIS_PORT -> PORT retrieved from redis above
SPRING_DATA_REDIS_USERNAME -> REDISUSER from redis variables on railway
SPRING_DATA_REDIS_PASSWORD -> REDISPASSWORD from redia variables on railway



Go to app in railway and go to settings
Generate public domain
DONE

when testing, to get local redis-cli --> redis-cli
to get the railway cli --> redis-cli -u <redisURL> -> get from redis variables on railway (REDIS_PUBLIC_URL) (should have exclamation mark there)
example -> redis-cli -u redis://default:RTWtOUVbQCDeMbkArfYlLXGzyEhgojhx@junction.proxy.rlwy.net:32877


railway login

railway link

railway up