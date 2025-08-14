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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyOwaspRuleStatusRequest extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则开关，0：关闭、1：开启、2：只观察
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * 是否全选
    */
    @SerializedName("SelectAll")
    @Expose
    private Boolean SelectAll;

    /**
    * 规则ID列表
    */
    @SerializedName("RuleIDs")
    @Expose
    private String [] RuleIDs;

    /**
    * 如果反转需要传入类型
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
    * 修改原因 0：无(兼容记录为空) 1：业务自身特性误报避免 2：规则误报上报 3：核心业务规则灰度 4：其它
    */
    @SerializedName("Reason")
    @Expose
    private Long Reason;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则开关，0：关闭、1：开启、2：只观察 
     * @return RuleStatus 规则开关，0：关闭、1：开启、2：只观察
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 规则开关，0：关闭、1：开启、2：只观察
     * @param RuleStatus 规则开关，0：关闭、1：开启、2：只观察
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 是否全选 
     * @return SelectAll 是否全选
     */
    public Boolean getSelectAll() {
        return this.SelectAll;
    }

    /**
     * Set 是否全选
     * @param SelectAll 是否全选
     */
    public void setSelectAll(Boolean SelectAll) {
        this.SelectAll = SelectAll;
    }

    /**
     * Get 规则ID列表 
     * @return RuleIDs 规则ID列表
     */
    public String [] getRuleIDs() {
        return this.RuleIDs;
    }

    /**
     * Set 规则ID列表
     * @param RuleIDs 规则ID列表
     */
    public void setRuleIDs(String [] RuleIDs) {
        this.RuleIDs = RuleIDs;
    }

    /**
     * Get 如果反转需要传入类型 
     * @return TypeId 如果反转需要传入类型
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 如果反转需要传入类型
     * @param TypeId 如果反转需要传入类型
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    /**
     * Get 修改原因 0：无(兼容记录为空) 1：业务自身特性误报避免 2：规则误报上报 3：核心业务规则灰度 4：其它 
     * @return Reason 修改原因 0：无(兼容记录为空) 1：业务自身特性误报避免 2：规则误报上报 3：核心业务规则灰度 4：其它
     */
    public Long getReason() {
        return this.Reason;
    }

    /**
     * Set 修改原因 0：无(兼容记录为空) 1：业务自身特性误报避免 2：规则误报上报 3：核心业务规则灰度 4：其它
     * @param Reason 修改原因 0：无(兼容记录为空) 1：业务自身特性误报避免 2：规则误报上报 3：核心业务规则灰度 4：其它
     */
    public void setReason(Long Reason) {
        this.Reason = Reason;
    }

    public ModifyOwaspRuleStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyOwaspRuleStatusRequest(ModifyOwaspRuleStatusRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.RuleStatus != null) {
            this.RuleStatus = new Long(source.RuleStatus);
        }
        if (source.SelectAll != null) {
            this.SelectAll = new Boolean(source.SelectAll);
        }
        if (source.RuleIDs != null) {
            this.RuleIDs = new String[source.RuleIDs.length];
            for (int i = 0; i < source.RuleIDs.length; i++) {
                this.RuleIDs[i] = new String(source.RuleIDs[i]);
            }
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
        if (source.Reason != null) {
            this.Reason = new Long(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamSimple(map, prefix + "SelectAll", this.SelectAll);
        this.setParamArraySimple(map, prefix + "RuleIDs.", this.RuleIDs);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

