# lamp 快速开发平台

[![Language](https://img.shields.io/badge/语言-Java%20%7C%20SpringCloud%20%7C%20Vue3%20%7C%20...-red?style=flat-square&color=42b883)](https://github.com/zuihou/lamp-cloud)
[![License](https://img.shields.io/github/license/zuihou/lamp-cloud?color=42b883&style=flat-square)](https://github.com/zuihou/lamp-cloud/blob/master/LICENSE)
[![Author](https://img.shields.io/badge/作者-zuihou-orange.svg)](https://github.com/zuihou)
[![Version](https://img.shields.io/badge/版本-3.10.0-brightgreen.svg)](https://github.com/zuihou/lamp-cloud)
[![Star](https://img.shields.io/github/stars/zuihou/lamp-cloud?color=42b883&logo=github&style=flat-square)](https://github.com/zuihou/lamp-cloud/stargazers)
[![Fork](https://img.shields.io/github/forks/zuihou/lamp-cloud?color=42b883&logo=github&style=flat-square)](https://github.com/zuihou/lamp-cloud/network/members)
[![Star](https://gitee.com/zuihou111/lamp-cloud/badge/star.svg?theme=gray)](https://gitee.com/zuihou111/lamp-cloud/stargazers)
[![Fork](https://gitee.com/zuihou111/lamp-cloud/badge/fork.svg?theme=gray)](https://gitee.com/zuihou111/lamp-cloud/members)

# lamp 项目名字由来
`灯灯`(简称灯， 英文名：lamp)，他是一个项目的统称，由"工具集"、"后端"、"前端"组成，包含以下几个子项目

[点我了解项目详细介绍](https://tangyh.top/)

# 官网
[https://tangyh.top](https://tangyh.top/)

## 工具集

| 项目 | gitee | github | 备注 |
| --- | --- | --- | --- |
| lamp-util | [lamp-util](https://gitee.com/zuihou111/lamp-util) | [lamp-util](https://github.com/zuihou/lamp-util) | 核心工具集 |
| lamp-generator | [lamp-generator](https://gitee.com/zuihou111/lamp-generator) | [lamp-generator](https://github.com/zuihou/lamp-generator) | 代码生成器 |
| lamp-job | [lamp-job](https://gitee.com/zuihou111/lamp-job) | [lamp-job](https://github.com/zuihou/lamp-job) | 分布式定时调度器 |

## 后端

| 项目 | gitee | github | 备注 |
| --- | --- | --- | --- |
| lamp-cloud | [lamp-cloud](https://gitee.com/zuihou111/lamp-cloud) |  [lamp-cloud](https://github.com/zuihou/lamp-cloud) | SpringCloud(微服务)版 |
| lamp-boot | [lamp-boot](https://gitee.com/zuihou111/lamp-boot) |  [lamp-boot](https://github.com/zuihou/lamp-boot) | SpringBoot(单体)版 |
| 微服务版示例 | [lamp-samples](https://github.com/zuihou/lamp-samples) | [lamp-samples](https://github.com/zuihou/lamp-samples) | 常用示例 |

## 前端

| 项目 | gitee | github | 备注 | 演示地址 |
| --- | --- | --- | --- | --- |
| lamp-web-plus(强烈推荐！👏👏👏) | [lamp-web-plus](https://gitee.com/zuihou111/lamp-web-plus) | [lamp-web-plus](https://github.com/zuihou/lamp-web-plus) | 基于 vue-vben-admin （vue 3 + ant design vue 2） | https://pro.tangyh.top |
| lamp-web | [lamp-web](https://gitee.com/zuihou111/lamp-web) | [lamp-web](https://github.com/zuihou/lamp-web) | 基于 vue-admin-element (element-ui) | https://pro.tangyh.top/lamp-web |

# lamp-boot 简介

`lamp-boot`只是`lamp`项目的其中一个项目，她基于`jdk11/jdk8` + `SpringBoot` 开发，
她是一个微服务中后台快速开发平台，可以通过插件无缝切换是否启用SaaS模式、通过配置切换SaaS模式采用独立数据库模式还是字段模式。

她具备SaaS模式切换、完备的RBAC功能、网关统一鉴权、灰度发布、数据权限、可插拔缓存、统一封装缓存的key、表单校验前后端统一验证、字典数据自动回显、Xss防跨站攻击、自动生成前后端代码、多种存储系统、分布式事务、分布式定时任务等多个功能和模块，
支持多业务系统并行开发， 支持多服务并行开发，是中后台系统开发脚手架的最佳选择。代码简洁，注释齐全，架构清晰，非常适合学习和企业作为基础框架使用。

核心技术采用SpringBoot、Mybatis、RabbitMQ、FastDFS/MinIO等主要框架和中间件。 希望能努力打造一套从 `Web基础框架` - `分布式微服务架构` - `持续集成` - `系统监测`
的解决方案。本项目旨在实现基础框架能力，不涉及具体业务。

# 会员版演示地址
- 官网：[https://tangyh.top](https://tangyh.top)
- 4.0版本：后端使用lamp-cloud-pro， 前端使用lamp-web-pro。演示地址：   [https://pro.tangyh.top](https://pro.tangyh.top)
- 3.x版本：后端使用lamp-boot-plus， 前端使用lamp-web-plus。演示地址：  [https://boot.tangyh.top](https://boot.tangyh.top)
- 3.x版本：后端使用lamp-boot-plus， 前端使用lamp-web。演示地址：     [https://boot.tangyh.top/lamp-web](https://boot.tangyh.top/lamp-web)

# 快速上手
- 入门到精通，参考 [在线文档](https://www.kancloud.cn/zuihou/zuihou-admin-cloud)
- 发现bug和建议，请提交 [issue](https://github.com/zuihou/lamp-cloud/issues)
- 常见问题，请参考 [Discussions](https://github.com/zuihou/lamp-cloud/discussions)

# 作者参与过或PR过的项目
- [vue-vben-admin](https://github.com/vbenjs/vue-vben-admin)
- [knife4j](https://gitee.com/xiaoym/knife4j)
- [x-easypdf](https://gitee.com/dromara/x-easypdf)
- [J2Cache](https://gitee.com/ld/J2Cache)


# 项目截图：

| 预览 | 预览 |
|--|---|
| ![预览.png](01-docs/image/业务/swagger.png) | ![预览.png](01-docs/image/业务/工作流.png) |
| ![预览.png](01-docs/image/业务/项目预览1.png) | ![预览.png](01-docs/image/业务/项目预览2.png) |
| ![预览.png](01-docs/image/1000star.png) | ![预览.png](01-docs/image/软著V2.5.0.jpg) |

# 会员版
本项目分为开源版和会员版，github和gitee上能搜索到的为开源版本，遵循Apache协议。 会员版源码在私有gitlab托管，购买后开通账号。

区别请看：[会员版](https://tangyh.top/vip/%E6%8E%88%E6%9D%83%E8%B4%B9%E7%94%A8)


