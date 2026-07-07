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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProviderItem extends AbstractModel {

    /**
    * <p>Provider 标识（如 openai）</p>
    */
    @SerializedName("Provider")
    @Expose
    private String Provider;

    /**
    * <p>显示名称（如 OpenAI）</p>
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * <p>模型协议列表</p>
    */
    @SerializedName("Protocols")
    @Expose
    private String [] Protocols;

    /**
    * <p>英文显示名称</p>
    */
    @SerializedName("EnglishDisplayName")
    @Expose
    private String EnglishDisplayName;

    /**
     * Get <p>Provider 标识（如 openai）</p> 
     * @return Provider <p>Provider 标识（如 openai）</p>
     */
    public String getProvider() {
        return this.Provider;
    }

    /**
     * Set <p>Provider 标识（如 openai）</p>
     * @param Provider <p>Provider 标识（如 openai）</p>
     */
    public void setProvider(String Provider) {
        this.Provider = Provider;
    }

    /**
     * Get <p>显示名称（如 OpenAI）</p> 
     * @return DisplayName <p>显示名称（如 OpenAI）</p>
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set <p>显示名称（如 OpenAI）</p>
     * @param DisplayName <p>显示名称（如 OpenAI）</p>
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get <p>模型协议列表</p> 
     * @return Protocols <p>模型协议列表</p>
     */
    public String [] getProtocols() {
        return this.Protocols;
    }

    /**
     * Set <p>模型协议列表</p>
     * @param Protocols <p>模型协议列表</p>
     */
    public void setProtocols(String [] Protocols) {
        this.Protocols = Protocols;
    }

    /**
     * Get <p>英文显示名称</p> 
     * @return EnglishDisplayName <p>英文显示名称</p>
     */
    public String getEnglishDisplayName() {
        return this.EnglishDisplayName;
    }

    /**
     * Set <p>英文显示名称</p>
     * @param EnglishDisplayName <p>英文显示名称</p>
     */
    public void setEnglishDisplayName(String EnglishDisplayName) {
        this.EnglishDisplayName = EnglishDisplayName;
    }

    public ProviderItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProviderItem(ProviderItem source) {
        if (source.Provider != null) {
            this.Provider = new String(source.Provider);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.Protocols != null) {
            this.Protocols = new String[source.Protocols.length];
            for (int i = 0; i < source.Protocols.length; i++) {
                this.Protocols[i] = new String(source.Protocols[i]);
            }
        }
        if (source.EnglishDisplayName != null) {
            this.EnglishDisplayName = new String(source.EnglishDisplayName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Provider", this.Provider);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamArraySimple(map, prefix + "Protocols.", this.Protocols);
        this.setParamSimple(map, prefix + "EnglishDisplayName", this.EnglishDisplayName);

    }
}

