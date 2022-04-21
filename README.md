# SpringCloudAlibaba-Eureka-Demo
SpringCloud + MyBatis-plus + Eureka + Swagger + Mysql 分布式微服务搭建
<!-- 一、创建父工程
         1.新建了maven项目
         2.引入父依赖
         3.引入springCloudAlibaba 依赖，从官网复制
         4.引入mysql驱动依赖
         5.引入mybatis-plus依赖
         6.引入lombok依赖
         7.引入druid依赖
         8.引入mybatis-plus代码生成器依赖
      -->
    <!-- 二、创建子工程（微服务）
         1.配置swagger
         2.配置druid
         3.自动生成代码
         4.编写业务接口
         5.用swagger测试
         然后同样的步骤在创建第二个子工程
    -->

    <!-- 三、远程调用
         1.在order-service（在启动类中注册，或新建一个配置类） 中注册 RestTemplate 实例
         2.修改order查询方法
       -->

    <!-- 四、Eureka
         1.创建 Eureka 模块子工程
         2.引入 Eureka 依赖(server)
         3.编写启动类
         4.编写配置文件yml
         5.配置服务名称
         6.配置 Eureka 地址
         -->

    <!-- 五、服务注册
         1.引入依赖（client）
         2.配置服务名称
         3.配置 Eureka 地址
       -->
    <!-- 六、服务发现
         1.将接口的ip地址改为服务名称
         2.在启动器 RestTemplate 实例上添加负载均衡注解 @LoadBalanced
         -->