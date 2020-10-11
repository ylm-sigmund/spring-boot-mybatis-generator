# spring-boot-mybatis-generator

#### 介绍
IDEA mysql&oracle mybatis-generator plugin插件 自动生成实体类和mapper.xml实战

#### 软件架构
- 2个独立的模块，分别是mysql、oralce独立集成插件的实现
- 重要：依赖一个自定义的数据类型映射配置类（独立jar）
- [自用工具jar地址](https://gitee.com/ylm-sigmund/common)
```pom
<!--  引入自用工具jar,自定义数据库属性映射关系,例如Short->Integer  -->
<dependency>
    <groupId>com.diy.sigmund</groupId>
    <artifactId>common</artifactId>
    <version>1.0.0-RELEASE</version>
</dependency>
```

#### Log
- 2020-10-11 mybatis-oracle集成数据库批处理更新代码(使用lambda表达式，可复用)，com.diy.sigmund.mybatisoracle.util.BatchProgram
- 2020-09-14 mybatis-mysql集成
1. Spring Boot SessionListener 用监听器统计网站在线人数
2. Spring Boot thymeleaf模板静态文件不更新的解决方案
- 2020-09-12 mybatis-mysql集成SqlInterceptor打印完整sql
- 2020-08-23 初版，并在mybatis-oracle模块中配置了单数据源的全局变量，使用场景：在一个数据源中使用另外一个数据源的数据