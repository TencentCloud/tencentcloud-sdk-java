/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TalkSTTConfigInfo extends AbstractModel {

    /**
    * 支持的STT类型，tencent-腾讯；azure-亚马逊；volcengine-火山引擎；deepgram-Deepgram;系统默认-tencent。
    */
    @SerializedName("STTType")
    @Expose
    private String STTType;

    /**
    * 是否开启
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 配置信息JSON字符串，根据STTType进行不同的值匹配。例如`STTType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"EngineType\":\"16k_zh\"}`

## tencent
```
{
  "AppId": 123456,
  "SecretId": "secretId*****",
  "SecretKey": "SecretKey****",
  "EngineType": "16k_zh"
}
```

## azure
```
{
  "Region": "",
  "EndpointId": "id",
  "Language": "zh-CN",
  "SubscriptionKey": "*****"
}
```
## volcengine
```
{
  "AppId": 123456,
  "AccessToken": "*****",
  "ResourceId": "SecretKey****",
  "ModelName": "16k_zh",
  "Language":""
}
```
## deepgram
```
{
  "Model": "nova-2",
  "Language": "zh",
   "BaseUrl":"http://www.deepgram.com",
  "ApiKey": "SecretKey****"
}
```

    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
     * Get 支持的STT类型，tencent-腾讯；azure-亚马逊；volcengine-火山引擎；deepgram-Deepgram;系统默认-tencent。 
     * @return STTType 支持的STT类型，tencent-腾讯；azure-亚马逊；volcengine-火山引擎；deepgram-Deepgram;系统默认-tencent。
     */
    public String getSTTType() {
        return this.STTType;
    }

    /**
     * Set 支持的STT类型，tencent-腾讯；azure-亚马逊；volcengine-火山引擎；deepgram-Deepgram;系统默认-tencent。
     * @param STTType 支持的STT类型，tencent-腾讯；azure-亚马逊；volcengine-火山引擎；deepgram-Deepgram;系统默认-tencent。
     */
    public void setSTTType(String STTType) {
        this.STTType = STTType;
    }

    /**
     * Get 是否开启 
     * @return Enabled 是否开启
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set 是否开启
     * @param Enabled 是否开启
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get 配置信息JSON字符串，根据STTType进行不同的值匹配。例如`STTType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"EngineType\":\"16k_zh\"}`

## tencent
```
{
  "AppId": 123456,
  "SecretId": "secretId*****",
  "SecretKey": "SecretKey****",
  "EngineType": "16k_zh"
}
```

## azure
```
{
  "Region": "",
  "EndpointId": "id",
  "Language": "zh-CN",
  "SubscriptionKey": "*****"
}
```
## volcengine
```
{
  "AppId": 123456,
  "AccessToken": "*****",
  "ResourceId": "SecretKey****",
  "ModelName": "16k_zh",
  "Language":""
}
```
## deepgram
```
{
  "Model": "nova-2",
  "Language": "zh",
   "BaseUrl":"http://www.deepgram.com",
  "ApiKey": "SecretKey****"
}
```
 
     * @return Config 配置信息JSON字符串，根据STTType进行不同的值匹配。例如`STTType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"EngineType\":\"16k_zh\"}`

## tencent
```
{
  "AppId": 123456,
  "SecretId": "secretId*****",
  "SecretKey": "SecretKey****",
  "EngineType": "16k_zh"
}
```

## azure
```
{
  "Region": "",
  "EndpointId": "id",
  "Language": "zh-CN",
  "SubscriptionKey": "*****"
}
```
## volcengine
```
{
  "AppId": 123456,
  "AccessToken": "*****",
  "ResourceId": "SecretKey****",
  "ModelName": "16k_zh",
  "Language":""
}
```
## deepgram
```
{
  "Model": "nova-2",
  "Language": "zh",
   "BaseUrl":"http://www.deepgram.com",
  "ApiKey": "SecretKey****"
}
```

     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置信息JSON字符串，根据STTType进行不同的值匹配。例如`STTType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"EngineType\":\"16k_zh\"}`

## tencent
```
{
  "AppId": 123456,
  "SecretId": "secretId*****",
  "SecretKey": "SecretKey****",
  "EngineType": "16k_zh"
}
```

## azure
```
{
  "Region": "",
  "EndpointId": "id",
  "Language": "zh-CN",
  "SubscriptionKey": "*****"
}
```
## volcengine
```
{
  "AppId": 123456,
  "AccessToken": "*****",
  "ResourceId": "SecretKey****",
  "ModelName": "16k_zh",
  "Language":""
}
```
## deepgram
```
{
  "Model": "nova-2",
  "Language": "zh",
   "BaseUrl":"http://www.deepgram.com",
  "ApiKey": "SecretKey****"
}
```

     * @param Config 配置信息JSON字符串，根据STTType进行不同的值匹配。例如`STTType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"EngineType\":\"16k_zh\"}`

## tencent
```
{
  "AppId": 123456,
  "SecretId": "secretId*****",
  "SecretKey": "SecretKey****",
  "EngineType": "16k_zh"
}
```

## azure
```
{
  "Region": "",
  "EndpointId": "id",
  "Language": "zh-CN",
  "SubscriptionKey": "*****"
}
```
## volcengine
```
{
  "AppId": 123456,
  "AccessToken": "*****",
  "ResourceId": "SecretKey****",
  "ModelName": "16k_zh",
  "Language":""
}
```
## deepgram
```
{
  "Model": "nova-2",
  "Language": "zh",
   "BaseUrl":"http://www.deepgram.com",
  "ApiKey": "SecretKey****"
}
```

     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    public TalkSTTConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkSTTConfigInfo(TalkSTTConfigInfo source) {
        if (source.STTType != null) {
            this.STTType = new String(source.STTType);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "STTType", this.STTType);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Config", this.Config);

    }
}

