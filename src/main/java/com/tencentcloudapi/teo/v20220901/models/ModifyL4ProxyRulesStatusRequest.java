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

public class ModifyL4ProxyRulesStatusRequest extends AbstractModel {

    /**
    * 站点 ID。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 四层代理实例 ID。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 转发规则 ID 列表。单次最多支持 200 条转发规则。
    */
    @SerializedName("RuleIds")
    @Expose
    private String [] RuleIds;

    /**
    * 转发规则状态，取值有：
<li>online：启用；</li>
<li>offline：停用。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 站点 ID。 
     * @return ZoneId 站点 ID。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。
     * @param ZoneId 站点 ID。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 四层代理实例 ID。 
     * @return ProxyId 四层代理实例 ID。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set 四层代理实例 ID。
     * @param ProxyId 四层代理实例 ID。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 转发规则 ID 列表。单次最多支持 200 条转发规则。 
     * @return RuleIds 转发规则 ID 列表。单次最多支持 200 条转发规则。
     */
    public String [] getRuleIds() {
        return this.RuleIds;
    }

    /**
     * Set 转发规则 ID 列表。单次最多支持 200 条转发规则。
     * @param RuleIds 转发规则 ID 列表。单次最多支持 200 条转发规则。
     */
    public void setRuleIds(String [] RuleIds) {
        this.RuleIds = RuleIds;
    }

    /**
     * Get 转发规则状态，取值有：
<li>online：启用；</li>
<li>offline：停用。</li> 
     * @return Status 转发规则状态，取值有：
<li>online：启用；</li>
<li>offline：停用。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 转发规则状态，取值有：
<li>online：启用；</li>
<li>offline：停用。</li>
     * @param Status 转发规则状态，取值有：
<li>online：启用；</li>
<li>offline：停用。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyL4ProxyRulesStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyL4ProxyRulesStatusRequest(ModifyL4ProxyRulesStatusRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.RuleIds != null) {
            this.RuleIds = new String[source.RuleIds.length];
            for (int i = 0; i < source.RuleIds.length; i++) {
                this.RuleIds[i] = new String(source.RuleIds[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamArraySimple(map, prefix + "RuleIds.", this.RuleIds);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

