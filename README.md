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

#### 安装教程

1.  xxxx


#### 使用说明

1.  xxxx


#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### Log

- 2020-08-23 初版，并在mybatis-oracle模块中配置了单数据源的全局变量，使用场景：在一个数据源中使用另外一个数据源的数据