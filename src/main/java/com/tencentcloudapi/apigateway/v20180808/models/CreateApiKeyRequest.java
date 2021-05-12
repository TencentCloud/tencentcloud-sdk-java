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
package com.tencentcloudapi.apigateway.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateApiKeyRequest extends AbstractModel{

    /**
    * 用户自定义密钥名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 密钥类型，支持 auto 和 manual（自定义密钥），默认为 auto。
    */
    @SerializedName("AccessKeyType")
    @Expose
    private String AccessKeyType;

    /**
    * 用户自定义密钥 ID，AccessKeyType 为 manual 时必传。长度为5 - 50字符，由字母、数字、英文下划线组成。
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * 用户自定义密钥 Key，AccessKeyType 为 manual 时必传。长度为10 - 50字符，由字母、数字、英文下划线。
    */
    @SerializedName("AccessKeySecret")
    @Expose
    private String AccessKeySecret;

    /**
     * Get 用户自定义密钥名称。 
     * @return SecretName 用户自定义密钥名称。
     */
    public String getSecretName() {
        return this.SecretName;
    }

    /**
     * Set 用户自定义密钥名称。
     * @param SecretName 用户自定义密钥名称。
     */
    public void setSecretName(String SecretName) {
        this.SecretName = SecretName;
    }

    /**
     * Get 密钥类型，支持 auto 和 manual（自定义密钥），默认为 auto。 
     * @return AccessKeyType 密钥类型，支持 auto 和 manual（自定义密钥），默认为 auto。
     */
    public String getAccessKeyType() {
        return this.AccessKeyType;
    }

    /**
     * Set 密钥类型，支持 auto 和 manual（自定义密钥），默认为 auto。
     * @param AccessKeyType 密钥类型，支持 auto 和 manual（自定义密钥），默认为 auto。
     */
    public void setAccessKeyType(String AccessKeyType) {
        this.AccessKeyType = AccessKeyType;
    }

    /**
     * Get 用户自定义密钥 ID，AccessKeyType 为 manual 时必传。长度为5 - 50字符，由字母、数字、英文下划线组成。 
     * @return AccessKeyId 用户自定义密钥 ID，AccessKeyType 为 manual 时必传。长度为5 - 50字符，由字母、数字、英文下划线组成。
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set 用户自定义密钥 ID，AccessKeyType 为 manual 时必传。长度为5 - 50字符，由字母、数字、英文下划线组成。
     * @param AccessKeyId 用户自定义密钥 ID，AccessKeyType 为 manual 时必传。长度为5 - 50字符，由字母、数字、英文下划线组成。
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get 用户自定义密钥 Key，AccessKeyType 为 manual 时必传。长度为10 - 50字符，由字母、数字、英文下划线。 
     * @return AccessKeySecret 用户自定义密钥 Key，AccessKeyType 为 manual 时必传。长度为10 - 50字符，由字母、数字、英文下划线。
     */
    public String getAccessKeySecret() {
        return this.AccessKeySecret;
    }

    /**
     * Set 用户自定义密钥 Key，AccessKeyType 为 manual 时必传。长度为10 - 50字符，由字母、数字、英文下划线。
     * @param AccessKeySecret 用户自定义密钥 Key，AccessKeyType 为 manual 时必传。长度为10 - 50字符，由字母、数字、英文下划线。
     */
    public void setAccessKeySecret(String AccessKeySecret) {
        this.AccessKeySecret = AccessKeySecret;
    }

    public CreateApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateApiKeyRequest(CreateApiKeyRequest source) {
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.AccessKeyType != null) {
            this.AccessKeyType = new String(source.AccessKeyType);
        }
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.AccessKeySecret != null) {
            this.AccessKeySecret = new String(source.AccessKeySecret);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "AccessKeyType", this.AccessKeyType);
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "AccessKeySecret", this.AccessKeySecret);

    }
}

