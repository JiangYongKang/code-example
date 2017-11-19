### KEY

```shell
# SET KEY_NAME VALUE
redis 127.0.0.1:6379> set root vincent
OK

# EXISTS KEY_NAME
redis 127.0.0.1:6379> exists root
(integer) 1

# GET KEY_NAME
redis 127.0.0.1:6379> get root
"root"

# DUMP KEY_NAME
redis 127.0.0.1:6379> dump root
"\x00\avincent\a\x00\x18D\x81\x9c\xccb\x82-"

# RENAME OLD_KEY_NAME NEW_KEY_NAME
redis 127.0.0.1:6379> rename root admin
OK

# DEL KEY_NAME
redis 127.0.0.1:6379> del root
(integer) 1

# KEYS KEY_NAME
redis 127.0.0.1:6379> set key name1 lucy
OK
redis 127.0.0.1:6379> set key name2 jack
OK
redis 127.0.0.1:6379> set key name3 scott
OK
redis 127.0.0.1:6379> keys name*
"lucy"
"jack"
"scott"

# TYPE KEY_NAME
redis 127.0.0.1:6379> type root
string
```
