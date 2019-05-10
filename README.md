# springcloud-base-frame
基于springcloud生态一套适合公司微服务化的基础框架结构

# 注意事项
- 目前该脚手架是基于zookeeper来做注册中心以及配置中心，所以在使用前需要开启本地或远程zookeeper服务；

- 可配合服务网关，链路追踪使用（独立发布）。目前服务网关使用zuul,链路追踪使用trace;(可根据公司需求替换其他产品，需自己另外添加依赖调试)

- 配合zkui开源项目进行zookeeper的服务管理。


