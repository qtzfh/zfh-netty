## 环境
* gradle4.10
* jdk11
* netty4
* mysql8.0
## API网关
* 系统架构
    * ![](http://test-1251463082.picsh.myqcloud.com/111.jpg)
* 具体功能
    * 黑名单功能
    * 请求限流
    * 入参校验
    * 请求分发
* 使用说明
    * 运行mysql.sql，初始化库表以及测试数据
    * 运行netty服务，默认端口：8080
    * 运行分发项目，并且在api_verify_name中配置系统名称和服务地址

#### 项目bug反馈
* 邮箱：qtzfh@hotmail.com
