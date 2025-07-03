# Changelog

### [3.1.1239] - 2025-04-10
- feat: add api to customize http client

### [3.1.1054] - 2024-07-05
- fix: CommonRequest support null value

### [3.1.1009] - 2024-04-28
- feat: add isStream() helper function to support non-stream call in stream context

### [3.1.1005] - 2024-04-23
- feat: support close sse response

### [3.1.986] - 2024-03-26
- fix: append cause to TencentCloudSDKException::toString

### [3.1.971] - 2024-03-01
- fix: 修复io异常捕获问题

### [3.1.970] - 2024-02-28
- feat: CommonRequest/Response

### [3.1.938] - 2023-12-29
- fix: explicitly use utf-8 as sse decoder, because Charset.defaultCharset() may give other charset other than utf-8 on JDK8 windows platform

### [3.1.883] - 2023-10-18
- feat: support apigw endpoint

### [3.1.881] - 2023-10-16
- feat: OIDCRoleArnProvider support auto refresh

### [3.1.880] - 2023-10-16
- fix: remove dependency to jaxb-api

### [3.1.878] - 2023-10-12
- support text/event-stream

### [3.1.842] - 2023-08-30
- feat: java sdk支持自定义header

### [3.1.821] - 2023-08-04
- feat: add OIDCRoleArnProvider

### [3.1.792] - 2023-07-05
- fix: 免签接口支持java sdk

### [3.1.779] - 2023-06-15
- feat: region breaker

### [3.1.767] - 2023-05-31
- fix: Use OkHttpClient singleton to minimize memory footprint

### [3.1.736] - 2023-04-13
- feat: SSLSocketFactory

### [3.1.731] - 2023-04-07
- fix: downgrade okhttp to support JDK 7

### [3.1.676] - 2023-01-11
- fix: enable connection pool

### [3.1.338] - 2021-08-19
- feat: support common client call octet-stream api

### [3.1.80] - 2020-01-29
- add log support

### [3.0.96] - 2019-10-11
- feature: add proxy support

### [3.0.71] - 2019-05-30
- change default signature method to TC3-HMAC-SHA256

### [3.0.61] - 2019-04-11
- support customized parameter

### [3.0.49] - 2019-03-15
- support multipart

### [3.0.33] - 2018-11-20
- support TC3-HMAC-SHA256 signature

