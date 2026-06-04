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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppWebSearchConfig extends AbstractModel {

    /**
    * API密钥
    */
    @SerializedName("ApiKey")
    @Expose
    private String ApiKey;

    /**
    * 是否开启
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 服务提供商
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * 返回结果数量
    */
    @SerializedName("TopN")
    @Expose
    private Long TopN;

    /**
     * Get API密钥 
     * @return ApiKey API密钥
     */
    public String getApiKey() {
        return this.ApiKey;
    }

    /**
     * Set API密钥
     * @param ApiKey API密钥
     */
    public void setApiKey(String ApiKey) {
        this.ApiKey = ApiKey;
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
     * Get 服务提供商 
     * @return Provider 服务提供商
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set 服务提供商
     * @param Provider 服务提供商
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get 返回结果数量 
     * @return TopN 返回结果数量
     */
    public Long getTopN() {
        return this.TopN;
    }

    /**
     * Set 返回结果数量
     * @param TopN 返回结果数量
     */
    public void setTopN(Long TopN) {
        this.TopN = TopN;
    }

    public AppWebSearchConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppWebSearchConfig(AppWebSearchConfig source) {
        if (source.ApiKey != null) {
            this.ApiKey = new String(source.ApiKey);
        }
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.TopN != null) {
            this.TopN = new Long(source.TopN);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApiKey", this.ApiKey);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "TopN", this.TopN);

    }
}

