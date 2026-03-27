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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiKeyRequest extends AbstractModel {

    /**
    * 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 密钥类型。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限，请勿暴露在客户端）、publish_key（客户端使用的公开密钥，权限受限，可安全用于前端或移动端）。
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * 密钥的自定义名称，用于在管理列表中标识和区分不同的密钥，建议填写能体现用途或归属的描述性名称，例如：server-prod、mobile-test
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * 密钥的有效期，单位为秒，最短不得低于 7200 秒。超过有效期后密钥将自动失效。不设置或设置为 0 则表示永不过期，建议根据安全需求合理设置有效期
    */
    @SerializedName("ExpireIn")
    @Expose
    private Long ExpireIn;

    /**
     * Get 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离 
     * @return EnvId 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     * @param EnvId 环境 ID，用于标识该密钥归属的云开发环境，不同环境之间的数据相互隔离
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 密钥类型。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限，请勿暴露在客户端）、publish_key（客户端使用的公开密钥，权限受限，可安全用于前端或移动端）。 
     * @return KeyType 密钥类型。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限，请勿暴露在客户端）、publish_key（客户端使用的公开密钥，权限受限，可安全用于前端或移动端）。
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 密钥类型。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限，请勿暴露在客户端）、publish_key（客户端使用的公开密钥，权限受限，可安全用于前端或移动端）。
     * @param KeyType 密钥类型。可选值：api_key（服务端调用使用的 API 密钥，具有完整权限，请勿暴露在客户端）、publish_key（客户端使用的公开密钥，权限受限，可安全用于前端或移动端）。
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 密钥的自定义名称，用于在管理列表中标识和区分不同的密钥，建议填写能体现用途或归属的描述性名称，例如：server-prod、mobile-test 
     * @return KeyName 密钥的自定义名称，用于在管理列表中标识和区分不同的密钥，建议填写能体现用途或归属的描述性名称，例如：server-prod、mobile-test
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 密钥的自定义名称，用于在管理列表中标识和区分不同的密钥，建议填写能体现用途或归属的描述性名称，例如：server-prod、mobile-test
     * @param KeyName 密钥的自定义名称，用于在管理列表中标识和区分不同的密钥，建议填写能体现用途或归属的描述性名称，例如：server-prod、mobile-test
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get 密钥的有效期，单位为秒，最短不得低于 7200 秒。超过有效期后密钥将自动失效。不设置或设置为 0 则表示永不过期，建议根据安全需求合理设置有效期 
     * @return ExpireIn 密钥的有效期，单位为秒，最短不得低于 7200 秒。超过有效期后密钥将自动失效。不设置或设置为 0 则表示永不过期，建议根据安全需求合理设置有效期
     */
    public Long getExpireIn() {
        return this.ExpireIn;
    }

    /**
     * Set 密钥的有效期，单位为秒，最短不得低于 7200 秒。超过有效期后密钥将自动失效。不设置或设置为 0 则表示永不过期，建议根据安全需求合理设置有效期
     * @param ExpireIn 密钥的有效期，单位为秒，最短不得低于 7200 秒。超过有效期后密钥将自动失效。不设置或设置为 0 则表示永不过期，建议根据安全需求合理设置有效期
     */
    public void setExpireIn(Long ExpireIn) {
        this.ExpireIn = ExpireIn;
    }

    public CreateApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiKeyRequest(CreateApiKeyRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.ExpireIn != null) {
            this.ExpireIn = new Long(source.ExpireIn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "ExpireIn", this.ExpireIn);

    }
}

