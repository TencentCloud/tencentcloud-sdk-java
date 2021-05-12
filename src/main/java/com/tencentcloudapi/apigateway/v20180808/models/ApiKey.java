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

public class ApiKey extends AbstractModel{

    /**
    * 创建的 API 密钥 ID 。
    */
    @SerializedName("AccessKeyId")
    @Expose
    private String AccessKeyId;

    /**
    * 创建的 API 密钥 Key。
    */
    @SerializedName("AccessKeySecret")
    @Expose
    private String AccessKeySecret;

    /**
    * 密钥类型，auto 或者 manual。
    */
    @SerializedName("AccessKeyType")
    @Expose
    private String AccessKeyType;

    /**
    * 用户自定义密钥名称。
    */
    @SerializedName("SecretName")
    @Expose
    private String SecretName;

    /**
    * 最后一次修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("ModifiedTime")
    @Expose
    private String ModifiedTime;

    /**
    * 密钥状态。0表示禁用，1表示启用。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * Get 创建的 API 密钥 ID 。 
     * @return AccessKeyId 创建的 API 密钥 ID 。
     */
    public String getAccessKeyId() {
        return this.AccessKeyId;
    }

    /**
     * Set 创建的 API 密钥 ID 。
     * @param AccessKeyId 创建的 API 密钥 ID 。
     */
    public void setAccessKeyId(String AccessKeyId) {
        this.AccessKeyId = AccessKeyId;
    }

    /**
     * Get 创建的 API 密钥 Key。 
     * @return AccessKeySecret 创建的 API 密钥 Key。
     */
    public String getAccessKeySecret() {
        return this.AccessKeySecret;
    }

    /**
     * Set 创建的 API 密钥 Key。
     * @param AccessKeySecret 创建的 API 密钥 Key。
     */
    public void setAccessKeySecret(String AccessKeySecret) {
        this.AccessKeySecret = AccessKeySecret;
    }

    /**
     * Get 密钥类型，auto 或者 manual。 
     * @return AccessKeyType 密钥类型，auto 或者 manual。
     */
    public String getAccessKeyType() {
        return this.AccessKeyType;
    }

    /**
     * Set 密钥类型，auto 或者 manual。
     * @param AccessKeyType 密钥类型，auto 或者 manual。
     */
    public void setAccessKeyType(String AccessKeyType) {
        this.AccessKeyType = AccessKeyType;
    }

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
     * Get 最后一次修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。 
     * @return ModifiedTime 最后一次修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String getModifiedTime() {
        return this.ModifiedTime;
    }

    /**
     * Set 最后一次修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     * @param ModifiedTime 最后一次修改时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public void setModifiedTime(String ModifiedTime) {
        this.ModifiedTime = ModifiedTime;
    }

    /**
     * Get 密钥状态。0表示禁用，1表示启用。 
     * @return Status 密钥状态。0表示禁用，1表示启用。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 密钥状态。0表示禁用，1表示启用。
     * @param Status 密钥状态。0表示禁用，1表示启用。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。 
     * @return CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     * @param CreatedTime 创建时间。按照 ISO8601 标准表示，并且使用 UTC 时间。格式为：YYYY-MM-DDThh:mm:ssZ。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    public ApiKey() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiKey(ApiKey source) {
        if (source.AccessKeyId != null) {
            this.AccessKeyId = new String(source.AccessKeyId);
        }
        if (source.AccessKeySecret != null) {
            this.AccessKeySecret = new String(source.AccessKeySecret);
        }
        if (source.AccessKeyType != null) {
            this.AccessKeyType = new String(source.AccessKeyType);
        }
        if (source.SecretName != null) {
            this.SecretName = new String(source.SecretName);
        }
        if (source.ModifiedTime != null) {
            this.ModifiedTime = new String(source.ModifiedTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessKeyId", this.AccessKeyId);
        this.setParamSimple(map, prefix + "AccessKeySecret", this.AccessKeySecret);
        this.setParamSimple(map, prefix + "AccessKeyType", this.AccessKeyType);
        this.setParamSimple(map, prefix + "SecretName", this.SecretName);
        this.setParamSimple(map, prefix + "ModifiedTime", this.ModifiedTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

