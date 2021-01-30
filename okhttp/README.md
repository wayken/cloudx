#### HTTP客户端请求
#### 组件特性
- 同步、异步调用两种模式
- 请求负载均衡(BALANCE)
- 代理转发(PROXY)
- 故障转移(FAIL_OVER)
 
 #### 组件原理
 - 底层实现采用RxIo框架，
 - RxIo主要服务于后台开发便于统一异步处理规范，主要服务于前台异步开发
 
 #### 开发计划
 - 开发post参数提交，统一用param作为参数
 - 开发post文件上传，统一用param作为参数
 - 思考OkHttp如何指定balancer负载均衡