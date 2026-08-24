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

public class ModifyDspmAuditFilterStrategyRequest extends AbstractModel {

    /**
    * <p>策略ID</p>
    */
    @SerializedName("AuditFilterStrategyId")
    @Expose
    private Long AuditFilterStrategyId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>策略名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>策略规则内容</p>
    */
    @SerializedName("Rule")
    @Expose
    private String Rule;

    /**
    * <p>是否启用</p><p>枚举值：</p><ul><li>0： 不启用</li><li>1： 启用</li></ul>
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>策略ID</p> 
     * @return AuditFilterStrategyId <p>策略ID</p>
     */
    public Long getAuditFilterStrategyId() {
        return this.AuditFilterStrategyId;
    }

    /**
     * Set <p>策略ID</p>
     * @param AuditFilterStrategyId <p>策略ID</p>
     */
    public void setAuditFilterStrategyId(Long AuditFilterStrategyId) {
        this.AuditFilterStrategyId = AuditFilterStrategyId;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>策略名称</p> 
     * @return Name <p>策略名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称</p>
     * @param Name <p>策略名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略描述</p> 
     * @return Description <p>策略描述</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述</p>
     * @param Description <p>策略描述</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>策略规则内容</p> 
     * @return Rule <p>策略规则内容</p>
     */
    public String getRule() {
        return this.Rule;
    }

    /**
     * Set <p>策略规则内容</p>
     * @param Rule <p>策略规则内容</p>
     */
    public void setRule(String Rule) {
        this.Rule = Rule;
    }

    /**
     * Get <p>是否启用</p><p>枚举值：</p><ul><li>0： 不启用</li><li>1： 启用</li></ul> 
     * @return IsEnabled <p>是否启用</p><p>枚举值：</p><ul><li>0： 不启用</li><li>1： 启用</li></ul>
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set <p>是否启用</p><p>枚举值：</p><ul><li>0： 不启用</li><li>1： 启用</li></ul>
     * @param IsEnabled <p>是否启用</p><p>枚举值：</p><ul><li>0： 不启用</li><li>1： 启用</li></ul>
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyDspmAuditFilterStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDspmAuditFilterStrategyRequest(ModifyDspmAuditFilterStrategyRequest source) {
        if (source.AuditFilterStrategyId != null) {
            this.AuditFilterStrategyId = new Long(source.AuditFilterStrategyId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Rule != null) {
            this.Rule = new String(source.Rule);
        }
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditFilterStrategyId", this.AuditFilterStrategyId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Rule", this.Rule);
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

