# Ckafka 消息投递 COS

## 简介

本示例会根据触发器配置的最大批量消息数去触发云函数运行，云函数每次运行都会创建一个以时间戳加随机数为名字的文本文件，并把拉取到的 Ckafca 消息换行写入文本文件。最后把写好的文件上传到 COS bucket，并以小时为单位在 COS bucket 中创建文件夹。

## 快速开始

0. [准备](#0-准备)
1. [安装](#1-安装)
2. [配置](#2-配置)
3. [部署](#3-部署)
4. [移除](#4-移除)

### 0. 准备
- 已开通 Ckafka 服务，并在 [Ckafka 控制台](https://console.cloud.tencent.com/ckafka?rid=1)购买与云函数同地域的 Ckafka 实例，创建 Topic。

### 1. 安装

通过npm安装 Serverless Framework

```console
$ npm install -g serverless
```

确保您的 Serverless Framework 不低于以下版本：

```shell
$ serverless –v
Framework Core: 1.76.1
Plugin: 3.6.17
SDK: 2.3.1
Components: 2.33.0
```


### 2. 配置

通过如下命令直接初始化该模版：

```
serverless init -t python2-ckafka-scf-cos
```

### 3. 部署

通过`sls deploy`命令进行部署，并可以添加`--debug`参数查看部署过程中的信息

如您的账号未[登陆](https://cloud.tencent.com/login)或[注册](https://cloud.tencent.com/register)腾讯云，您可以直接通过`微信`扫描命令行中的二维码进行授权登陆和注册。

### 4. 移除

可以通过以下命令移除 Ckafka 消息投递 COS

```console
$ sls remove 

serverless ⚡ framework
Action: "remove" - Stage: "dev" - App: "python2-ckafka-scf-cos" - Instance: "ap-guangzhou_default_python2-ckafka-scf-cos"

6s › api-service › Success
  
```

### 账号配置（可选）

当前默认支持 CLI 扫描二维码登录，如您希望配置持久的环境变量/秘钥信息，也可以本地创建 `.env` 文件

```console
$ touch .env # 腾讯云的配置信息
```

在 `.env` 文件中配置腾讯云的 SecretId 和 SecretKey 信息并保存

如果没有腾讯云账号，可以在此[注册新账号](https://cloud.tencent.com/register)。

如果已有腾讯云账号，可以在[API 密钥管理](https://console.cloud.tencent.com/cam/capi)中获取 `SecretId` 和`SecretKey`.

```
# .env
TENCENT_SECRET_ID=123
TENCENT_SECRET_KEY=123
```