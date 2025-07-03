# Changelog

### [3.1.1239] - 2025-04-10
- feat: 添加自定义 HTTP 客户端的 API

### [3.1.1054] - 2024-07-05
- fix: CommonRequest 支持空值

### [3.1.1009] - 2024-04-28
- feat: 添加 isStream() 辅助函数以支持流上下文中的非流调用

### [3.1.1005] - 2024-04-23
- feat: 支持关闭 SSE 响应

### [3.1.986] - 2024-03-26
- fix: 在 TencentCloudSDKException::toString 中附加 cause

### [3.1.971] - 2024-03-01
- fix: 修复io异常捕获问题

### [3.1.970] - 2024-02-28
- feat: CommonRequest/Response

### [3.1.938] - 2023-12-29
- fix: 明确使用 UTF-8 作为 SSE 解码器，因为在 JDK8 Windows 平台上 Charset.defaultCharset() 可能会提供除 UTF-8 之外的其他字符集

### [3.1.883] - 2023-10-18
- feat: 支持 apigw endpoint

### [3.1.881] - 2023-10-16
- feat: OIDCRoleArnProvider 支持自动刷新

### [3.1.880] - 2023-10-16
- fix: 移除对 jaxb-api 的依赖

### [3.1.878] - 2023-10-12
- feat: 支持 text/event-stream

### [3.1.842] - 2023-08-30
- feat: java sdk支持自定义header

### [3.1.821] - 2023-08-04
- feat: 支持 OIDCRoleArnProvider

### [3.1.792] - 2023-07-05
- fix: 免签接口支持java sdk

### [3.1.779] - 2023-06-15
- feat: 地域熔断

### [3.1.767] - 2023-05-31
- fix: 使用 OkHttpClient 单例以最小化内存占用

### [3.1.736] - 2023-04-13
- feat: SSLSocketFactory

### [3.1.731] - 2023-04-07
- fix: okhttp 降级以支持 JDK 7

### [3.1.676] - 2023-01-11
- fix: 支持连接池

### [3.1.338] - 2021-08-19
- feat: 支持 CommonClient 调用 octet-stream API

### [3.1.80] - 2020-01-29
- feat: 添加日志支持

### [3.0.96] - 2019-10-11
- feat: 添加代理支持

### [3.0.71] - 2019-05-30
- fix: 将默认签名方法更改为 TC3-HMAC-SHA256

### [3.0.61] - 2019-04-11
- feat: 支持自定义参数

### [3.0.49] - 2019-03-15
- feat: 支持 multipart

### [3.0.33] - 2018-11-20
- feat: 支持 TC3-HMAC-SHA256 签名

