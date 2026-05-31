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
package com.tencentcloudapi.tokenhub.v20260322.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeApiKeyRequest extends AbstractModel {

    /**
    * 平台类型。当前支持填值：maas
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * API 密钥 ID，与 ApiKey 至少需传入其一，优先使用 ApiKeyId。
    */
    @SerializedName("ApiKeyId")
    @Expose
    private String ApiKeyId;

    /**
    * API 密钥明文，与 ApiKeyId 至少需传入其一。
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
     * Get 平台类型。当前支持填值：maas 
     * @return Platform 平台类型。当前支持填值：maas
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 平台类型。当前支持填值：maas
     * @param Platform 平台类型。当前支持填值：maas
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get API 密钥 ID，与 ApiKey 至少需传入其一，优先使用 ApiKeyId。 
     * @return ApiKeyId API 密钥 ID，与 ApiKey 至少需传入其一，优先使用 ApiKeyId。
     */
    public String getApiKeyId() {
        return this.ApiKeyId;
    }

    /**
     * Set API 密钥 ID，与 ApiKey 至少需传入其一，优先使用 ApiKeyId。
     * @param ApiKeyId API 密钥 ID，与 ApiKey 至少需传入其一，优先使用 ApiKeyId。
     */
    public void setApiKeyId(String ApiKeyId) {
        this.ApiKeyId = ApiKeyId;
    }

    /**
     * Get API 密钥明文，与 ApiKeyId 至少需传入其一。 
     * @return ApiKey API 密钥明文，与 ApiKeyId 至少需传入其一。
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set API 密钥明文，与 ApiKeyId 至少需传入其一。
     * @param ApiKey API 密钥明文，与 ApiKeyId 至少需传入其一。
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
    }

    public DescribeApiKeyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeApiKeyRequest(DescribeApiKeyRequest source) {
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ApiKeyId != null) {
            this.ApiKeyId = new String(source.ApiKeyId);
        }
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamSimple(map, prefix + "ApiKeyId", this.ApiKeyId);
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);

    }
}

