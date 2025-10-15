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

public class TalkTTSConfigInfo extends AbstractModel {

    /**
    * 支持的LLM类型，支持tencent-腾讯；azure-亚马逊；volcengine-火山引擎；elevenlabs-ELEVENLABS；minimax-MINIMAX；cartesia-CARTESIA；aliyun-阿里；系统默认-tencent。
    */
    @SerializedName("TTSType")
    @Expose
    private String TTSType;

    /**
    * 是否开启
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 配置信息JSON字符串，根据`TTSType`进行不同的值匹配。例如`TTSType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"VoiceType\":10001}`

## tencent
```
{
   "AppId": 100203,
   "SecretId": "XXXX",
   "SecretKey": "XXXXX",
  "VoiceType":123456
}
```

## azure
```
{
   "SubscriptionKey": 100203,
   "Region": "ch-zn",
   "VoiceName": "XXXXX",
  "Language":"zh"
}
```
## elevenlabs
```
{
   "ModelId": 100203,
   "VoiceId": "ch-zn",
   "ApiKey": "XXXXX"
}
```
## minimax
```
{  
  "Model":"xxxx",
   "ApiUrl": "346w34",
   "ApiKey": "xxx",
   "GroupId": "ion",
  "VoiceType":"xioawei"
}
```
## cartesia
```
{  
  "Model":"xxxx",
   "ApiKey": "xxx",
  "VoiceId":"xioawei"
}
```
## aliyun
```
{
   "VoiceType": 100203,
   "RegionId": "XXXX",
   "ApiKey": "XXXXX"
}
```
## volcengine
```
{
   "AppId": "346w34",
   "AccessToken": "xxx",
   "ResourceId": "volc.bigasr.sauc.duration",
  "VoiceType":"xioawei"
}
```

    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 温度
    */
    @SerializedName("Speed")
    @Expose
    private Float Speed;

    /**
    * 最大token数
    */
    @SerializedName("Volume")
    @Expose
    private Float Volume;

    /**
    * PITCH
    */
    @SerializedName("Pitch")
    @Expose
    private Float Pitch;

    /**
     * Get 支持的LLM类型，支持tencent-腾讯；azure-亚马逊；volcengine-火山引擎；elevenlabs-ELEVENLABS；minimax-MINIMAX；cartesia-CARTESIA；aliyun-阿里；系统默认-tencent。 
     * @return TTSType 支持的LLM类型，支持tencent-腾讯；azure-亚马逊；volcengine-火山引擎；elevenlabs-ELEVENLABS；minimax-MINIMAX；cartesia-CARTESIA；aliyun-阿里；系统默认-tencent。
     */
    public String getTTSType() {
        return this.TTSType;
    }

    /**
     * Set 支持的LLM类型，支持tencent-腾讯；azure-亚马逊；volcengine-火山引擎；elevenlabs-ELEVENLABS；minimax-MINIMAX；cartesia-CARTESIA；aliyun-阿里；系统默认-tencent。
     * @param TTSType 支持的LLM类型，支持tencent-腾讯；azure-亚马逊；volcengine-火山引擎；elevenlabs-ELEVENLABS；minimax-MINIMAX；cartesia-CARTESIA；aliyun-阿里；系统默认-tencent。
     */
    public void setTTSType(String TTSType) {
        this.TTSType = TTSType;
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
     * Get 配置信息JSON字符串，根据`TTSType`进行不同的值匹配。例如`TTSType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"VoiceType\":10001}`

## tencent
```
{
   "AppId": 100203,
   "SecretId": "XXXX",
   "SecretKey": "XXXXX",
  "VoiceType":123456
}
```

## azure
```
{
   "SubscriptionKey": 100203,
   "Region": "ch-zn",
   "VoiceName": "XXXXX",
  "Language":"zh"
}
```
## elevenlabs
```
{
   "ModelId": 100203,
   "VoiceId": "ch-zn",
   "ApiKey": "XXXXX"
}
```
## minimax
```
{  
  "Model":"xxxx",
   "ApiUrl": "346w34",
   "ApiKey": "xxx",
   "GroupId": "ion",
  "VoiceType":"xioawei"
}
```
## cartesia
```
{  
  "Model":"xxxx",
   "ApiKey": "xxx",
  "VoiceId":"xioawei"
}
```
## aliyun
```
{
   "VoiceType": 100203,
   "RegionId": "XXXX",
   "ApiKey": "XXXXX"
}
```
## volcengine
```
{
   "AppId": "346w34",
   "AccessToken": "xxx",
   "ResourceId": "volc.bigasr.sauc.duration",
  "VoiceType":"xioawei"
}
```
 
     * @return Config 配置信息JSON字符串，根据`TTSType`进行不同的值匹配。例如`TTSType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"VoiceType\":10001}`

## tencent
```
{
   "AppId": 100203,
   "SecretId": "XXXX",
   "SecretKey": "XXXXX",
  "VoiceType":123456
}
```

## azure
```
{
   "SubscriptionKey": 100203,
   "Region": "ch-zn",
   "VoiceName": "XXXXX",
  "Language":"zh"
}
```
## elevenlabs
```
{
   "ModelId": 100203,
   "VoiceId": "ch-zn",
   "ApiKey": "XXXXX"
}
```
## minimax
```
{  
  "Model":"xxxx",
   "ApiUrl": "346w34",
   "ApiKey": "xxx",
   "GroupId": "ion",
  "VoiceType":"xioawei"
}
```
## cartesia
```
{  
  "Model":"xxxx",
   "ApiKey": "xxx",
  "VoiceId":"xioawei"
}
```
## aliyun
```
{
   "VoiceType": 100203,
   "RegionId": "XXXX",
   "ApiKey": "XXXXX"
}
```
## volcengine
```
{
   "AppId": "346w34",
   "AccessToken": "xxx",
   "ResourceId": "volc.bigasr.sauc.duration",
  "VoiceType":"xioawei"
}
```

     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置信息JSON字符串，根据`TTSType`进行不同的值匹配。例如`TTSType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"VoiceType\":10001}`

## tencent
```
{
   "AppId": 100203,
   "SecretId": "XXXX",
   "SecretKey": "XXXXX",
  "VoiceType":123456
}
```

## azure
```
{
   "SubscriptionKey": 100203,
   "Region": "ch-zn",
   "VoiceName": "XXXXX",
  "Language":"zh"
}
```
## elevenlabs
```
{
   "ModelId": 100203,
   "VoiceId": "ch-zn",
   "ApiKey": "XXXXX"
}
```
## minimax
```
{  
  "Model":"xxxx",
   "ApiUrl": "346w34",
   "ApiKey": "xxx",
   "GroupId": "ion",
  "VoiceType":"xioawei"
}
```
## cartesia
```
{  
  "Model":"xxxx",
   "ApiKey": "xxx",
  "VoiceId":"xioawei"
}
```
## aliyun
```
{
   "VoiceType": 100203,
   "RegionId": "XXXX",
   "ApiKey": "XXXXX"
}
```
## volcengine
```
{
   "AppId": "346w34",
   "AccessToken": "xxx",
   "ResourceId": "volc.bigasr.sauc.duration",
  "VoiceType":"xioawei"
}
```

     * @param Config 配置信息JSON字符串，根据`TTSType`进行不同的值匹配。例如`TTSType`是`tencent`，`Config`值是`{\"AppId\":123456,\"SecretId\":\"secretId*****\",\"SecretKey\":\"SecretKey****\",\"VoiceType\":10001}`

## tencent
```
{
   "AppId": 100203,
   "SecretId": "XXXX",
   "SecretKey": "XXXXX",
  "VoiceType":123456
}
```

## azure
```
{
   "SubscriptionKey": 100203,
   "Region": "ch-zn",
   "VoiceName": "XXXXX",
  "Language":"zh"
}
```
## elevenlabs
```
{
   "ModelId": 100203,
   "VoiceId": "ch-zn",
   "ApiKey": "XXXXX"
}
```
## minimax
```
{  
  "Model":"xxxx",
   "ApiUrl": "346w34",
   "ApiKey": "xxx",
   "GroupId": "ion",
  "VoiceType":"xioawei"
}
```
## cartesia
```
{  
  "Model":"xxxx",
   "ApiKey": "xxx",
  "VoiceId":"xioawei"
}
```
## aliyun
```
{
   "VoiceType": 100203,
   "RegionId": "XXXX",
   "ApiKey": "XXXXX"
}
```
## volcengine
```
{
   "AppId": "346w34",
   "AccessToken": "xxx",
   "ResourceId": "volc.bigasr.sauc.duration",
  "VoiceType":"xioawei"
}
```

     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 温度 
     * @return Speed 温度
     */
    public Float getSpeed() {
        return this.Speed;
    }

    /**
     * Set 温度
     * @param Speed 温度
     */
    public void setSpeed(Float Speed) {
        this.Speed = Speed;
    }

    /**
     * Get 最大token数 
     * @return Volume 最大token数
     */
    public Float getVolume() {
        return this.Volume;
    }

    /**
     * Set 最大token数
     * @param Volume 最大token数
     */
    public void setVolume(Float Volume) {
        this.Volume = Volume;
    }

    /**
     * Get PITCH 
     * @return Pitch PITCH
     */
    public Float getPitch() {
        return this.Pitch;
    }

    /**
     * Set PITCH
     * @param Pitch PITCH
     */
    public void setPitch(Float Pitch) {
        this.Pitch = Pitch;
    }

    public TalkTTSConfigInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TalkTTSConfigInfo(TalkTTSConfigInfo source) {
        if (source.TTSType != null) {
            this.TTSType = new String(source.TTSType);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Speed != null) {
            this.Speed = new Float(source.Speed);
        }
        if (source.Volume != null) {
            this.Volume = new Float(source.Volume);
        }
        if (source.Pitch != null) {
            this.Pitch = new Float(source.Pitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TTSType", this.TTSType);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Speed", this.Speed);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "Pitch", this.Pitch);

    }
}

