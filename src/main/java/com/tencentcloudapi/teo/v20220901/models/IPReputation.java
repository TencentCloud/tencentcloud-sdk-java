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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IPReputation extends AbstractModel {

    /**
    * IP 情报库（原客户端画像分析）。取值有：<li>on：开启；</li><li>off：关闭。</li>
    */
    @SerializedName("Enabled")
    @Expose
    private String Enabled;

    /**
    * IP 情报库（原客户端画像分析）的具体配置内容。
    */
    @SerializedName("IPReputationGroup")
    @Expose
    private IPReputationGroup IPReputationGroup;

    /**
     * Get IP 情报库（原客户端画像分析）。取值有：<li>on：开启；</li><li>off：关闭。</li> 
     * @return Enabled IP 情报库（原客户端画像分析）。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public String getEnabled() {
        return this.Enabled;
    }

    /**
     * Set IP 情报库（原客户端画像分析）。取值有：<li>on：开启；</li><li>off：关闭。</li>
     * @param Enabled IP 情报库（原客户端画像分析）。取值有：<li>on：开启；</li><li>off：关闭。</li>
     */
    public void setEnabled(String Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get IP 情报库（原客户端画像分析）的具体配置内容。 
     * @return IPReputationGroup IP 情报库（原客户端画像分析）的具体配置内容。
     */
    public IPReputationGroup getIPReputationGroup() {
        return this.IPReputationGroup;
    }

    /**
     * Set IP 情报库（原客户端画像分析）的具体配置内容。
     * @param IPReputationGroup IP 情报库（原客户端画像分析）的具体配置内容。
     */
    public void setIPReputationGroup(IPReputationGroup IPReputationGroup) {
        this.IPReputationGroup = IPReputationGroup;
    }

    public IPReputation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IPReputation(IPReputation source) {
        if (source.Enabled != null) {
            this.Enabled = new String(source.Enabled);
        }
        if (source.IPReputationGroup != null) {
            this.IPReputationGroup = new IPReputationGroup(source.IPReputationGroup);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamObj(map, prefix + "IPReputationGroup.", this.IPReputationGroup);

    }
}

