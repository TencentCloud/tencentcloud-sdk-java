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
package com.tencentcloudapi.ga2.v20250115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyForwardingPolicyRequest extends AbstractModel {

    /**
    * <p>全球加速实例ID。</p>
    */
    @SerializedName("GlobalAcceleratorId")
    @Expose
    private String GlobalAcceleratorId;

    /**
    * <p>监听器ID。</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>策略ID。</p>
    */
    @SerializedName("ForwardingPolicyId")
    @Expose
    private String ForwardingPolicyId;

    /**
    * <p>域名。</p><p>入参限制：长度范围在1-80。</p><p>格式必须满足正则表达式：^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p>
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
     * Get <p>全球加速实例ID。</p> 
     * @return GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public String getGlobalAcceleratorId() {
        return this.GlobalAcceleratorId;
    }

    /**
     * Set <p>全球加速实例ID。</p>
     * @param GlobalAcceleratorId <p>全球加速实例ID。</p>
     */
    public void setGlobalAcceleratorId(String GlobalAcceleratorId) {
        this.GlobalAcceleratorId = GlobalAcceleratorId;
    }

    /**
     * Get <p>监听器ID。</p> 
     * @return ListenerId <p>监听器ID。</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器ID。</p>
     * @param ListenerId <p>监听器ID。</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>策略ID。</p> 
     * @return ForwardingPolicyId <p>策略ID。</p>
     */
    public String getForwardingPolicyId() {
        return this.ForwardingPolicyId;
    }

    /**
     * Set <p>策略ID。</p>
     * @param ForwardingPolicyId <p>策略ID。</p>
     */
    public void setForwardingPolicyId(String ForwardingPolicyId) {
        this.ForwardingPolicyId = ForwardingPolicyId;
    }

    /**
     * Get <p>域名。</p><p>入参限制：长度范围在1-80。</p><p>格式必须满足正则表达式：^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p> 
     * @return Host <p>域名。</p><p>入参限制：长度范围在1-80。</p><p>格式必须满足正则表达式：^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p>
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set <p>域名。</p><p>入参限制：长度范围在1-80。</p><p>格式必须满足正则表达式：^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p>
     * @param Host <p>域名。</p><p>入参限制：长度范围在1-80。</p><p>格式必须满足正则表达式：^(<a href="?:[a-z0-9-]{0,61}[a-z0-9]">a-z0-9</a>?.)+[a-z]{2,}$</p>
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    public ModifyForwardingPolicyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyForwardingPolicyRequest(ModifyForwardingPolicyRequest source) {
        if (source.GlobalAcceleratorId != null) {
            this.GlobalAcceleratorId = new String(source.GlobalAcceleratorId);
        }
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ForwardingPolicyId != null) {
            this.ForwardingPolicyId = new String(source.ForwardingPolicyId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GlobalAcceleratorId", this.GlobalAcceleratorId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ForwardingPolicyId", this.ForwardingPolicyId);
        this.setParamSimple(map, prefix + "Host", this.Host);

    }
}

