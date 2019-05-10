# bdp-dht网关服务
-  基于zuul实现服务网关
- 网关可实现功能：限流、熔断、负载均衡、灰度发布、安全校验等
- 目前存在不足：网关直接与注册中心交互，没有持久化服务信息，如果注册中心宕机，则网关服务不可用

## 网关实现的功能需要在 filter 目录下增加


## 注意
- 服务网关，spring-boot-starter-parent版本只能使用2.0.0.RELEASE以下版本，否则会有冲突，导致程序无法启动
```
 <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.5.20.RELEASE</version>
        <relativePath/>
    </parent>
```