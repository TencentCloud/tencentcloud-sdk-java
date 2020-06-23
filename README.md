![](https://img.shields.io/maven-central/v/com.tencentcloudapi/tencentcloud-sdk-java?label=maven)

# 简介
欢迎使用腾讯云开发者工具套件（SDK）3.0，SDK3.0是云 API3.0 平台的配套工具。目前已经支持cvm、vpc、cbs等产品，后续所有的云服务产品都会接入进来。新版SDK实现了统一化，具有各个语言版本的SDK使用方法相同，接口调用方式相同，统一的错误码和返回包格式这些优点。
为方便 JAVA 开发者调试和接入腾讯云产品 API，这里向您介绍适用于 Java 的腾讯云开发工具包，并提供首次使用开发工具包的简单示例。让您快速获取腾讯云 Java SDK 并开始调用。
# 依赖环境
1.依赖环境：JDK 7 版本及以上。
2.从 腾讯云控制台 开通相应产品。
3.获取 SecretID、SecretKey 以及调用地址（endpoint），endpoint 一般形式为\*.tencentcloudapi.com，如CVM 的调用地址为 cvm.tencentcloudapi.com，具体参考各产品说明。

# 获取安装
安装 Java SDK 前，先获取安全凭证。在第一次使用云API之前，用户首先需要在腾讯云控制台上申请安全凭证，安全凭证包括 SecretID 和 SecretKey， SecretID 是用于标识 API 调用者的身份，SecretKey是用于加密签名字符串和服务器端验证签名字符串的密钥。SecretKey 必须严格保管，避免泄露。
## 通过 Maven 安装(推荐)
通过 Maven 获取安装是使用 JAVA SDK 的推荐方法，Maven 是 JAVA 的依赖管理工具，支持您项目所需的依赖项，并将其安装到项目中。关于 Maven 详细可参考 Maven 官网 。
1. 请访问[Maven官网](https://maven.apache.org/)下载对应系统Maven安装包进行安装。
2. 为您的项目添加 Maven 依赖项，只需在 Maven pom.xml 添加以下依赖项即可。注意这里的版本号只是举例,您可以在[Maven仓库](https://search.maven.org/search?q=tencentcloud-sdk-java)上找到最新的版本，当前最新版本为![](https://img.shields.io/maven-central/v/com.tencentcloudapi/tencentcloud-sdk-java?label=maven)：
```xml
<dependency>
    <groupId>com.tencentcloudapi</groupId>
    <artifactId>tencentcloud-sdk-java</artifactId>
    <!-- go to https://search.maven.org/search?q=tencentcloud-sdk-java and get the latest version. -->
    <!-- 请到https://search.maven.org/search?q=tencentcloud-sdk-java查询最新版本 -->
    <version>3.0.93</version>
</dependency>
```
3. 引用方法可参考示例。

## 通过源码包安装
1. 前往 [Github 代码托管地址](https://github.com/tencentcloud/tencentcloud-sdk-java) 下载源码压缩包。
2. 解压源码包到您项目合适的位置。
3. 需要将vendor目录下的jar包放在java的可找到的路径中。
4. 引用方法可参考示例。

# 示例
以查询可用区接口为例:
```java
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.profile.ClientProfile;
// 导入对应产品模块的client
import com.tencentcloudapi.cvm.v20170312.CvmClient;
// 导入要请求接口对应的request response类
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesRequest;
import com.tencentcloudapi.cvm.v20170312.models.DescribeZonesResponse;

public class DescribeZones
{
    public static void main(String [] args) {
        try{
            // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey
            Credential cred = new Credential("secretId", "secretKey");
            
            // 实例化要请求产品(以cvm为例)的client对象
            ClientProfile clientProfile = new ClientProfile();
            clientProfile.setSignMethod(ClientProfile.SIGN_TC3_256);
            CvmClient client = new CvmClient(cred, "ap-guangzhou", clientProfile);
            
            // 实例化一个请求对象
            DescribeZonesRequest req = new DescribeZonesRequest();
            
            // 通过client对象调用想要访问的接口，需要传入请求对象
            DescribeZonesResponse resp = client.DescribeZones(req);
            
            // 输出json格式的字符串回包
            System.out.println(DescribeZonesRequest.toJsonString(resp));
        } catch (TencentCloudSDKException e) {
                System.out.println(e.toString());
        }

    }
    
} 
```
## 支持http
SDK支持 http协议和https协议，通过设置HttpProfile的setProtocol()方法可以实现协议间的切换。：  
```
      HttpProfile httpProfile = new HttpProfile();
      httpProfile.setProtocol("http://"); //http协议
	  httpProfile.setProtocol("https://"); //https协议

```
## 支持打印日志
自\*\*版本开始，SDK支持打印日志  
首先,在创建CLientProfile对象时,设置debug模式为真  
```
      ClientProfile clientProfile = new ClientProfile();
      clientProfile.setDebug(true);
```
然后在项目根目录上设置log的配置文件,可以参考tencentcloud-sdk-java/log4j.properties。  
若配置文件使用运行程序tencentcloud-sdk-java/log4j.properties，会在根目录下生成两个文件debug.log和info.log。  
debug.log为debug LEVEL中**DEBUG**之上的日志。  
info.log为debug LEVEL中**INFO**之上的日志  
log日志内容为:**日志级别|时间|发起请求的类名|方法名|日志信息**，如：  
```
DEBUG | 2020-06-23 19:53:45,527 | com.tencentcloudapi.cvm.v20170312.CvmClient | main | send request, request url: http://cvm.ap-shanghai.tencentcloudapi.com/?Nonce=214427340&Action=DescribeInstances&Filters.0.Values.1=ap-shanghai-2&Version=2017-03-12&Filters.0.Values.0=ap-shanghai-1&SecretId=AKIDf6Jcz7nvVHdy7HmsKbcnqhY9mBIdsfM3&Filters.0.Name=zone&RequestClient=SDK_JAVA_3.1.77&Region=ap-shanghai&SignatureMethod=HmacSHA256&Timestamp=1592913225&Signature=4M90tzqzZk2%2Fa6pQv2Tep0gWSO%2FTODAN%2Bb3cLLZW4kw%3D. request headers information: 
DEBUG | 2020-06-23 19:53:45,685 | com.tencentcloudapi.cvm.v20170312.CvmClient | main | recieve response, response url: http://cvm.ap-shanghai.tencentcloudapi.com/?Nonce=214427340&Action=DescribeInstances&Filters.0.Values.1=ap-shanghai-2&Version=2017-03-12&Filters.0.Values.0=ap-shanghai-1&SecretId=AKIDf6Jcz7nvVHdy7HmsKbcnqhY9mBIdsfM3&Filters.0.Name=zone&RequestClient=SDK_JAVA_3.1.77&Region=ap-shanghai&SignatureMethod=HmacSHA256&Timestamp=1592913225&Signature=4M90tzqzZk2%2Fa6pQv2Tep0gWSO%2FTODAN%2Bb3cLLZW4kw%3D, response headers: Server: nginx;Date: Tue, 23 Jun 2020 11:53:45 GMT;Content-Type: text/html; charset=utf-8;Content-Length: 162;Connection: keep-alive;OkHttp-Selected-Protocol: http/1.1;OkHttp-Sent-Millis: 1592913225648;OkHttp-Received-Millis: 1592913225684;,response body information: com.squareup.okhttp.internal.http.RealResponseBody@86be70a
 INFO | 2020-06-23 19:53:45,686 | com.tencentcloudapi.cvm.v20170312.CvmClient | main | response code is 403, not 200
```


## 更多示例

您可以在[github](https://github.com/tencentcloud/tencentcloud-sdk-java)中examples目录下找到更详细的示例。

# 相关配置

## 代理

从3.0.96版本开始，可以单独设置  HTTP 代理：

```
HttpProfile httpProfile = new HttpProfile();
httpProfile.setProxyHost("真实代理ip");
httpProfile.setProxyPort(真实代理端口);
```

## 语言

从3.1.16版本开始，我们添加了对公共参数 Language 的支持，以满足部分产品国际化的诉求。和以前一样，Language 默认不传，行为由各产品接口自行决定，通常是中文的，但也有默认英文的。目前可选值为中文或者英文，通过如下方法设置：

```
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.Language;
...
    ClientProfile clientProfile = new ClientProfile();
    clientProfile.setLanguage(Language.ZH_CN);
```

# 旧版 SDK
我们推荐您使用新版 SDK， 如果需要旧版 SDK，请在您的 Maven pom.xml 添加以下依赖项即可：
```xml
<dependency>
<groupId>com.qcloud</groupId>
<artifactId>qcloud-java-sdk</artifactId>
<version>2.0.6</version>
</dependency>
```

# 其他问题

## 版本升级

请注意，从 3.0.x 版本升级到 3.1.x 版本有兼容性问题，对于 Integer 字段的使用修改为了 Long 类型，需要重新编译项目。

## 依赖冲突

目前，SDK 依赖 okhttp 2.5.0，如果和其他依赖 okhttp3 的包混用时，有可能会报错，例如：`Exception in thread "main" java.lang.NoSuchMethodError: okio.BufferedSource.rangeEquals(JLokio/ByteString;)Z`。原因是 okhttp3 依赖 okio 1.12.0，而 okhttp 依赖 okio 1.6.0，maven 在解析依赖时的规则是路径最短优先和顺序优先，所以如果 SDK 在 pom.xml 依赖中先被声明，则 okio 1.6.0 会被使用，从而报错。在 SDK 没有升级到 okhttp3 前的解决办法：1）在 pom.xml 中明确指定依赖 okio 1.12.0 版本（注意可能有其他包需要用到更高的版本，变通下取最高版本就可以了）；2）将 SDK 放在依赖的最后（注意如果此前已经编译过，需要先删除掉 maven 缓存的 okhttp 包），以同时使用依赖 okhttp3 的 CMQ SDK 为例，形如（注意变通版本号）：

```
    <dependency>
      <groupId>com.qcloud</groupId>
      <artifactId>cmq-http-client</artifactId>
      <version>1.0.7</version>
    </dependency>
    <dependency>
      <groupId>com.tencentcloudapi</groupId>
      <artifactId>tencentcloud-sdk-java</artifactId>
      <version>3.1.59</version>
    </dependency>
```
