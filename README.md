# 轻量级Java响应库

## 项目说明
> 暂无


## 项目结构
```text
.
├── core                                        核心文件
│    ├── src/main/java
│    │    └── cc.itez.render.core
│    │         ├── data                         响应数据包
│    │         │    ├── PagingData.java         分页数据
│    │         │    ├── RenderData.java         响应数据
│    │         │    └── ThrownData.java         抛出数据
│    │         ├── std
│    │         │    ├── RenderBuilder.java      响应构建标准
│    │         │    ├── RenderFactory.java      响应构建工厂
│    │         │    └── RenderTemplate.java     响应内容模板
│    │         └── val
│    │             └── RestField.java           响应字段枚举
│    └── pom.xml
│
├── plugin                                      插件化代码
│    ├── src/main/java
│    │    └── cc.itez.render.example
│    │         └── RS.java                      标准HTTP响应码
│    └── pom.xml
│
├── spring                                      spring插件
│    ├── pom.xml
│    ├── src/main/java
│    │    └── cc.itez.render.spring
│    └── pom.xml
└── pom.xml

```