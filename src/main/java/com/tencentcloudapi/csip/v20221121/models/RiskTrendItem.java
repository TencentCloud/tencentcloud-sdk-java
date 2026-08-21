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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskTrendItem extends AbstractModel {

    /**
    * 风险项类型：intrusion_alert / vulnerability
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 展示名称，按请求语言返回；漏洞项按是否付费区分文案
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 风险数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 风险项类型：intrusion_alert / vulnerability 
     * @return Key 风险项类型：intrusion_alert / vulnerability
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 风险项类型：intrusion_alert / vulnerability
     * @param Key 风险项类型：intrusion_alert / vulnerability
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 展示名称，按请求语言返回；漏洞项按是否付费区分文案 
     * @return Name 展示名称，按请求语言返回；漏洞项按是否付费区分文案
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 展示名称，按请求语言返回；漏洞项按是否付费区分文案
     * @param Name 展示名称，按请求语言返回；漏洞项按是否付费区分文案
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 风险数量 
     * @return Count 风险数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 风险数量
     * @param Count 风险数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public RiskTrendItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskTrendItem(RiskTrendItem source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

