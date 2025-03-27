/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MQTTAuthenticatorItem extends AbstractModel {

    /**
    * 认证器类型
JWT：JWT认证器
JWKS：JWKS认证器
HTTP：HTTP认证器
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * JWT认证器字段说明
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
secret（签名方式）
    hmac-based：hmac-based签名方式
    public-key：public-key签名方式
secret（密钥），hmac-based需要配置密钥
public-key（公钥），public-key签名方式需要配置
样例：{"from":"password","secret":"secret282698","algorithm":"hmac-based"}

JWKS认证器字段说明
endpoint（接入点）：公钥获取服务器接入地址
refreshInterval（认证内容）：公钥集合刷新周期
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
text：公钥集合
样例：{"endpoint":"127.0.0.1","refreshInterval":60,"from":"password"}

HTTP认证器
headers（请求头）：标准请求头和自定义请求头
endpoint（接入点）：认证服务器接入点
method（http请求方法）：POST/GET
readTimeout（读超时时间）：读取认证服务器数据超时时间，单位秒
connectTimeout（连接超时时间）：连接认证服务器超时时间，单位秒
body（请求体）：http请求体
concurrency（并发数）：最大并发请求数量
样例：{"headers":[{"key":"Content-type","value":"application/json"},{"key":"username","value":"${Username}"}],"endpoint":"https://127.0.0.1:443","method":"POST","readTimeout":10,"connectTimeout":10,"body":[{"key":"client-id","value":"${ClientId}"}],"concurrency":8}
参考 [认证管理概述](https://cloud.tencent.com/document/product/1778/114813)
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 认证器状态
open：认证器打开
close：认证器关闭
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间，毫秒级时间戳 。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 说明，最长 128 字符。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 认证器类型
JWT：JWT认证器
JWKS：JWKS认证器
HTTP：HTTP认证器 
     * @return Type 认证器类型
JWT：JWT认证器
JWKS：JWKS认证器
HTTP：HTTP认证器
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 认证器类型
JWT：JWT认证器
JWKS：JWKS认证器
HTTP：HTTP认证器
     * @param Type 认证器类型
JWT：JWT认证器
JWKS：JWKS认证器
HTTP：HTTP认证器
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get JWT认证器字段说明
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
secret（签名方式）
    hmac-based：hmac-based签名方式
    public-key：public-key签名方式
secret（密钥），hmac-based需要配置密钥
public-key（公钥），public-key签名方式需要配置
样例：{"from":"password","secret":"secret282698","algorithm":"hmac-based"}

JWKS认证器字段说明
endpoint（接入点）：公钥获取服务器接入地址
refreshInterval（认证内容）：公钥集合刷新周期
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
text：公钥集合
样例：{"endpoint":"127.0.0.1","refreshInterval":60,"from":"password"}

HTTP认证器
headers（请求头）：标准请求头和自定义请求头
endpoint（接入点）：认证服务器接入点
method（http请求方法）：POST/GET
readTimeout（读超时时间）：读取认证服务器数据超时时间，单位秒
connectTimeout（连接超时时间）：连接认证服务器超时时间，单位秒
body（请求体）：http请求体
concurrency（并发数）：最大并发请求数量
样例：{"headers":[{"key":"Content-type","value":"application/json"},{"key":"username","value":"${Username}"}],"endpoint":"https://127.0.0.1:443","method":"POST","readTimeout":10,"connectTimeout":10,"body":[{"key":"client-id","value":"${ClientId}"}],"concurrency":8}
参考 [认证管理概述](https://cloud.tencent.com/document/product/1778/114813) 
     * @return Config JWT认证器字段说明
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
secret（签名方式）
    hmac-based：hmac-based签名方式
    public-key：public-key签名方式
secret（密钥），hmac-based需要配置密钥
public-key（公钥），public-key签名方式需要配置
样例：{"from":"password","secret":"secret282698","algorithm":"hmac-based"}

JWKS认证器字段说明
endpoint（接入点）：公钥获取服务器接入地址
refreshInterval（认证内容）：公钥集合刷新周期
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
text：公钥集合
样例：{"endpoint":"127.0.0.1","refreshInterval":60,"from":"password"}

HTTP认证器
headers（请求头）：标准请求头和自定义请求头
endpoint（接入点）：认证服务器接入点
method（http请求方法）：POST/GET
readTimeout（读超时时间）：读取认证服务器数据超时时间，单位秒
connectTimeout（连接超时时间）：连接认证服务器超时时间，单位秒
body（请求体）：http请求体
concurrency（并发数）：最大并发请求数量
样例：{"headers":[{"key":"Content-type","value":"application/json"},{"key":"username","value":"${Username}"}],"endpoint":"https://127.0.0.1:443","method":"POST","readTimeout":10,"connectTimeout":10,"body":[{"key":"client-id","value":"${ClientId}"}],"concurrency":8}
参考 [认证管理概述](https://cloud.tencent.com/document/product/1778/114813)
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set JWT认证器字段说明
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
secret（签名方式）
    hmac-based：hmac-based签名方式
    public-key：public-key签名方式
secret（密钥），hmac-based需要配置密钥
public-key（公钥），public-key签名方式需要配置
样例：{"from":"password","secret":"secret282698","algorithm":"hmac-based"}

JWKS认证器字段说明
endpoint（接入点）：公钥获取服务器接入地址
refreshInterval（认证内容）：公钥集合刷新周期
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
text：公钥集合
样例：{"endpoint":"127.0.0.1","refreshInterval":60,"from":"password"}

HTTP认证器
headers（请求头）：标准请求头和自定义请求头
endpoint（接入点）：认证服务器接入点
method（http请求方法）：POST/GET
readTimeout（读超时时间）：读取认证服务器数据超时时间，单位秒
connectTimeout（连接超时时间）：连接认证服务器超时时间，单位秒
body（请求体）：http请求体
concurrency（并发数）：最大并发请求数量
样例：{"headers":[{"key":"Content-type","value":"application/json"},{"key":"username","value":"${Username}"}],"endpoint":"https://127.0.0.1:443","method":"POST","readTimeout":10,"connectTimeout":10,"body":[{"key":"client-id","value":"${ClientId}"}],"concurrency":8}
参考 [认证管理概述](https://cloud.tencent.com/document/product/1778/114813)
     * @param Config JWT认证器字段说明
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
secret（签名方式）
    hmac-based：hmac-based签名方式
    public-key：public-key签名方式
secret（密钥），hmac-based需要配置密钥
public-key（公钥），public-key签名方式需要配置
样例：{"from":"password","secret":"secret282698","algorithm":"hmac-based"}

JWKS认证器字段说明
endpoint（接入点）：公钥获取服务器接入地址
refreshInterval（认证内容）：公钥集合刷新周期
from（认证字段）
    password：从password字段获取认证字段
    username：从username字段获取认证字段
text：公钥集合
样例：{"endpoint":"127.0.0.1","refreshInterval":60,"from":"password"}

HTTP认证器
headers（请求头）：标准请求头和自定义请求头
endpoint（接入点）：认证服务器接入点
method（http请求方法）：POST/GET
readTimeout（读超时时间）：读取认证服务器数据超时时间，单位秒
connectTimeout（连接超时时间）：连接认证服务器超时时间，单位秒
body（请求体）：http请求体
concurrency（并发数）：最大并发请求数量
样例：{"headers":[{"key":"Content-type","value":"application/json"},{"key":"username","value":"${Username}"}],"endpoint":"https://127.0.0.1:443","method":"POST","readTimeout":10,"connectTimeout":10,"body":[{"key":"client-id","value":"${ClientId}"}],"concurrency":8}
参考 [认证管理概述](https://cloud.tencent.com/document/product/1778/114813)
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 认证器状态
open：认证器打开
close：认证器关闭 
     * @return Status 认证器状态
open：认证器打开
close：认证器关闭
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 认证器状态
open：认证器打开
close：认证器关闭
     * @param Status 认证器状态
open：认证器打开
close：认证器关闭
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间，毫秒级时间戳 。 
     * @return CreateTime 创建时间，毫秒级时间戳 。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间，毫秒级时间戳 。
     * @param CreateTime 创建时间，毫秒级时间戳 。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 说明，最长 128 字符。 
     * @return Remark 说明，最长 128 字符。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明，最长 128 字符。
     * @param Remark 说明，最长 128 字符。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public MQTTAuthenticatorItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MQTTAuthenticatorItem(MQTTAuthenticatorItem source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

